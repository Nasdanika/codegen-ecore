package org.nasdanika.codegen.ecore.presentation;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.presentation.JavaProjectClassLoader;
import org.nasdanika.config.MutableContext;
import org.nasdanika.config.SimpleMutableContext;
import org.pegdown.Extensions;
import org.pegdown.LinkRenderer;
import org.pegdown.PegDownProcessor;
import org.pegdown.ast.AnchorLinkNode;
import org.pegdown.ast.AutoLinkNode;
import org.pegdown.ast.ExpLinkNode;
import org.pegdown.ast.RefLinkNode;
import org.pegdown.ast.WikiLinkNode;

public class EcoreCodegenForm extends Composite {
	private static final Object[] NO_OBJECTS = {};
	public static final int MARKDOWN_OPTIONS = 	Extensions.ALL ^ Extensions.HARDWRAPS ^ Extensions.SUPPRESS_HTML_BLOCKS ^ Extensions.SUPPRESS_ALL_HTML;
	private static final String ECORE_DOC_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/GenModel";

	private DataBindingContext m_bindingContext;

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	private WritableValue<EcoreCodeGenerator> generatorWritableValue = new WritableValue<EcoreCodeGenerator>(EcoreFactory.eINSTANCE.createEcoreCodeGenerator(), EcoreCodeGenerator.class);
	private Text txtDomainModelFilter;
	
	private WritableValue<String> filterValue = new WritableValue<>();
	private WritableValue<EObject> selectionWritableValue = new WritableValue<>();
	private CheckboxTreeViewer checkboxTreeViewer;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param site 
	 * @param new AdapterFactoryContentProvider(adapterFactory) 
	 */
	@SuppressWarnings({ "unchecked", "serial" })
	public EcoreCodegenForm(
			Composite parent, 
			int style, 
			EditingDomain editingDomain, 
			IWorkbenchPartSite site, 
			IEditorInput editorInput, 
			AdapterFactory adapterFactory) {
		
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Form form = toolkit.createForm(this);
		form.setText("Generators Model");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form);
		toolkit.paintBordersFor(body);
		form.setLayout(new GridLayout(1, false));
		form.getBody().setLayout(new GridLayout(2, false));
		
		try {
			IProject project = ((FileEditorInput) editorInput).getFile().getProject();
			if (project.isOpen() && project.getNature(JavaCore.NATURE_ID) != null) {
				IJavaProject javaProject = JavaCore.create(project);
			    ClassLoader currentProjectClassLoader = new JavaProjectClassLoader(getClass().getClassLoader(), javaProject);
			
				Action codeGenerationAction = new Action("Generate code", IAction.AS_PUSH_BUTTON) {
					
					@Override
					public void run() {
						try {						
							EcoreCodeGenerator eCoreCodeGenerator = generatorWritableValue.getValue();
//							CodeGenerationWizard codeGenerationWizard = new CodeGenerationWizard(
//									eCoreCodeGenerator, 
//									currentProjectClassLoader, 
//									obj -> GeneratorUtil.isGenerate(eCoreCodeGenerator, obj) ? new BaseContextInfo<EObject>(eCoreCodeGenerator, obj) : null);
//							
//							WizardDialog dialog = new WizardDialog(EcoreCodegenForm.this.getShell(), codeGenerationWizard);
//							if (dialog.open() == Window.OK) {
//								try {
//									new ProgressMonitorDialog(getShell()).run(true, true, codeGenerationWizard.getGenerateCodeOperation());
//								} catch (CancellationException ce) {
//									MessageDialog.openInformation(getShell(), "Operation cancelled", "Code generation cancelled by the user");			
//								}
//							}
						} catch (Exception e) {
							StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
							IStatus[] childStatuses = new IStatus[stackTraces.length];

							for (int i = 0; i < stackTraces.length; ++i) {
								childStatuses[i] = new Status(IStatus.ERROR, "org.nasdanika.codegen.ecore.editor", stackTraces[i].toString());
							}

							MultiStatus status = new MultiStatus(
									"org.nasdanika.codegen.ecore.editor",
									IStatus.ERROR, 
									childStatuses,
									e.toString(), 
									e);
							
							e.printStackTrace();
							ErrorDialog.openError(getShell(), "Error generating code", e.getMessage(), status);
						}
					}
					
				};
				codeGenerationAction.setToolTipText("Opens code generation wizard");
				codeGenerationAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.nasdanika.codegen.ecore.editor", "icons/full/obj16/cog.png"));
				
				form.getToolBarManager().add(codeGenerationAction);
				form.getToolBarManager().update(true);
			}
		} catch (CoreException ce) {
			// TODO Better reporting
			ce.printStackTrace();
		}
						
		SashForm sections = new SashForm(form.getBody(), SWT.NONE);
		sections.setLayout(new GridLayout(2, false));
		sections.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		toolkit.paintBordersFor(sections);
		sections.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		Section sctnDomainModel = toolkit.createSection(sections, Section.TWISTIE | Section.TITLE_BAR);
		sctnDomainModel.setDescription("Domain model checkbox tree.");
		sctnDomainModel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		sctnDomainModel.setBounds(0, 0, 98, 21);
		toolkit.paintBordersFor(sctnDomainModel);
		sctnDomainModel.setText("Domain Model");
		sctnDomainModel.setExpanded(true);
		
		Composite domainModelComposite = toolkit.createComposite(sctnDomainModel, SWT.NONE);
		toolkit.paintBordersFor(domainModelComposite);
		sctnDomainModel.setClient(domainModelComposite);
		domainModelComposite.setLayout(new GridLayout(2, false));
		
		Label lblFilter = toolkit.createLabel(domainModelComposite, "Filter:", SWT.NONE);
		lblFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txtDomainModelFilter = toolkit.createText(domainModelComposite, "New Text", SWT.NONE);
		txtDomainModelFilter.setText("");
		txtDomainModelFilter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		checkboxTreeViewer = new ContainerCheckedTreeViewer(domainModelComposite, SWT.BORDER);
		Tree tree = checkboxTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		toolkit.paintBordersFor(tree);
		checkboxTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory) {
			
			@Override
			public Object[] getChildren(Object object) {
				if (object instanceof WritableValue) {
					return new Object[] { ((WritableValue<?>) object).getValue() };
				}
				
				if (object instanceof EcoreCodeGenerator) {
					return ((EcoreCodeGenerator) object).getEPackages().toArray();
				}
				
				if (object instanceof EStructuralFeature || object instanceof EParameter) {
					return NO_OBJECTS;
				}
				
				if (object instanceof EOperation) {
					return ((EOperation) object).getEParameters().toArray();
				}							
				
				Object[] ret = super.getChildren(object);
				if (object instanceof EClass) {
					return Arrays.stream(ret).filter(obj -> obj instanceof EStructuralFeature || obj instanceof EOperation).toArray();  
				}
				
				if (object instanceof EPackage) {
					return Arrays.stream(ret).filter(obj -> obj instanceof EClass).toArray();  
				}

				return ret;
			}
			
			@Override
			public Object[] getElements(Object object) {
				return getChildren(object);
			}
			
			@Override
			public boolean hasChildren(Object object) {
				if (object instanceof EStructuralFeature || object instanceof EParameter) {
					return false;
				}
				if (object instanceof EOperation) {
					return !((EOperation) object).getEParameters().isEmpty();
				}
				return getChildren(object).length > 0;
			}
			
			@Override
			public Object getParent(Object object) {
				Object input = checkboxTreeViewer.getInput();
				if (object instanceof EPackage && input instanceof WritableValue && ((WritableValue<?>) input).getValue() instanceof EcoreCodeGenerator) {
					if (!(((EPackage) object).eContainer() instanceof EPackage)) {
						return ((WritableValue<?>) input).getValue();
					}
				}
				return super.getParent(object);
			}
			
		});
		checkboxTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory) {
			
			@Override
			public String getText(Object object) {
				if (object instanceof EClassifier) {
					return ((EClassifier) object).getName();
				}
				if (object instanceof EcoreCodeGenerator) {
					return ((EcoreCodeGenerator) object).getName();
				}
				return super.getText(object);
			};
			
		});
		
		generatorWritableValue.addChangeListener(event -> checkboxTreeViewer.refresh());		
		filterValue.addChangeListener(event -> checkboxTreeViewer.refresh());
				
		checkboxTreeViewer.addFilter(new ViewerFilter() {
			
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (filterValue.getValue() == null || filterValue.getValue().trim().length() == 0) {
					return true;
				}
				
				if (((AdapterFactoryLabelProvider) checkboxTreeViewer.getLabelProvider()).getText(element).toLowerCase().contains(filterValue.getValue().toLowerCase())) {
					return true;
				}
				
				Object[] children = ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(element);
				if (children != null) {
					for (Object child: children) {
						if (select(viewer, element, child)) {
							return true;
						}
					}
				}
				
				return false;
			}
			
		});
		
		checkboxTreeViewer.setComparator(new ViewerComparator() {
			
			@Override
			public int category(Object element) {
				if (element instanceof EPackage) {
					return 1;
				}
				if (element instanceof EClassifier) {
					return 2;
				}
				if (element instanceof EStructuralFeature) {
					return 3;
				}
				if (element instanceof EOperation) {
					return 4;
				}
				
				return super.category(element);
			}
			
		});
		
		checkboxTreeViewer.addCheckStateListener(new EcoreCodeGeneratorCheckStateListener(editingDomain, generatorWritableValue, checkboxTreeViewer));
		checkboxTreeViewer.setCheckStateProvider(new EcoreCodeGeneratorCheckStateProvider(generatorWritableValue, (ITreeContentProvider) checkboxTreeViewer.getContentProvider()));
		
		checkboxTreeViewer.setInput(generatorWritableValue);
		
		SashForm sashFormRight = new SashForm(sections, SWT.SMOOTH | SWT.VERTICAL);
		toolkit.adapt(sashFormRight);
		toolkit.paintBordersFor(sashFormRight);
		sashFormRight.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		Section sctnElementInfo = toolkit.createSection(sashFormRight, Section.TWISTIE | Section.TITLE_BAR);
		sctnElementInfo.setDescription("Domain model element details.");
		sctnElementInfo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnElementInfo);
		sctnElementInfo.setText("Element");
		sctnElementInfo.setExpanded(true);
		
		Browser browser = new Browser(sctnElementInfo, SWT.NONE);
		sctnElementInfo.setClient(browser);
		toolkit.adapt(browser);
		toolkit.paintBordersFor(browser);		
		
		Section sctnConfiguration = toolkit.createSection(sashFormRight, Section.TWISTIE | Section.TITLE_BAR);
		sctnConfiguration.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sctnConfiguration.setBounds(0, 0, 98, 21);
		toolkit.paintBordersFor(sctnConfiguration);
		sctnConfiguration.setText("Configuration");
		sctnConfiguration.setExpanded(true);
		
		Composite configurationComposite = toolkit.createComposite(sctnConfiguration, SWT.NONE);
		toolkit.paintBordersFor(configurationComposite);
		sctnConfiguration.setClient(configurationComposite);
//		configurationComposite.setLayout(new GridLayout(3, false));
		
					
		selectionWritableValue.addChangeListener(new IChangeListener() {
			
			@Override
			public void handleChange(ChangeEvent event) {
				EObject selection = selectionWritableValue.getValue();
				if (selection instanceof EcoreCodeGenerator) {
					// Element information
					StringBuilder docBuilder = new StringBuilder();
					docBuilder.append("<H4>EPackages</H4>").append(System.lineSeparator());
					docBuilder.append("<UL>").append(System.lineSeparator());
					for (EPackage ePackage: ((EcoreCodeGenerator) selection).getEPackages()) {
						docBuilder.append("<LI>").append(ePackage.getName()).append(" - ").append(ePackage.getNsURI()).append("</LI>").append(System.lineSeparator());
					}
					docBuilder.append("</UL>").append(System.lineSeparator());					
					browser.setText(docBuilder.toString());
					
					// TODO - targets.
				} else if (selection instanceof EModelElement) {
					// Element information
					MutableContext docContext = new SimpleMutableContext();
					
					StringBuilder infoBuilder = new StringBuilder();					
					if (selection instanceof ENamedElement) {
						infoBuilder.append("<H3>"+((ENamedElement) selection).getName()+"</H3>");
					}
					
					// TODO - details - type, cardinality, opposite.
					
					docContext.set("info", infoBuilder);
					docContext.set("documentation", "");						
					EAnnotation docAnn = ((EModelElement) selection).getEAnnotation(ECORE_DOC_ANNOTATION_SOURCE);
					if (docAnn != null) {
						String markdown = docAnn.getDetails().get("documentation");
						if (markdown != null && markdown.trim().length() > 0) {
							String docHTML = markdownToHtml(markdown);
							docContext.set("documentation", "<HR/>" + System.lineSeparator() + docHTML);
						}
					}
					try {
						browser.setText(docContext.interpolate(getClass().getResource("element-info-template.html")));
					} catch (IOException e) {
						e.printStackTrace();
						browser.setText("Error");
					}
					
					// TODO - tabs config forms.
				}				
			}
			
		});
		
		sections.setWeights(new int[] {1, 2});
		m_bindingContext = initDataBindings();
	}
	
	public void setGenerator(EcoreCodeGenerator generator) {
		generatorWritableValue.setValue(generator);
	}
	
	private String markdownToHtml(String markdown) {
		// Renders links to open in a new window.
		return new PegDownProcessor(MARKDOWN_OPTIONS).markdownToHtml(markdown, new LinkRenderer() {
			
			@Override
			public Rendering render(AutoLinkNode node) {
				return super.render(node).withAttribute("target", "_blank");
			}
			
			@Override
			public Rendering render(AnchorLinkNode node) {
				return super.render(node).withAttribute("target", "_blank");
			}
			
			@Override
			public Rendering render(ExpLinkNode node, String text) {
				return super.render(node, text).withAttribute("target", "_blank");
			}
			
			@Override
			public Rendering render(RefLinkNode node, String url, String title, String text) {
				return super.render(node, url, title, text).withAttribute("target", "_blank");
			}
			
			@Override
			public Rendering render(WikiLinkNode wikiLinkNode) {
				return super.render(wikiLinkNode).withAttribute("target", "_blank");
			}
			
		});
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtDomainModelFilterObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(100, txtDomainModelFilter);
		bindingContext.bindValue(observeTextTxtDomainModelFilterObserveWidget, filterValue, null, null);
		//
		IObservableValue observeSingleSelectionCheckboxTreeViewer = ViewerProperties.singleSelection().observe(checkboxTreeViewer);
		bindingContext.bindValue(observeSingleSelectionCheckboxTreeViewer, selectionWritableValue, null, null);
		//
		return bindingContext;
	}
}
