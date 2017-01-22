package org.nasdanika.codegen.ecore.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
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
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
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
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.wb.swt.ResourceManager;
import org.nasdanika.codegen.ecore.ConfigurationEntry;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.provider.ecorecodegenerationEditPlugin;
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
	static final String GENERATION_TARGET_EXTENSION_POINT_ID = "org.nasdanika.codegen.ecore.editor.generation_target";
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
	private Composite configurationComposite;
	private EditingDomain editingDomain;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 * @param site 
	 * @param new AdapterFactoryContentProvider(adapterFactory) 
	 */
	public EcoreCodegenForm(
			Composite parent, 
			int style, 
			EditingDomain editingDomain, 
			IWorkbenchPartSite site, 
			IEditorInput editorInput, 
			AdapterFactory adapterFactory) {
		
		super(parent, style);
		this.editingDomain = editingDomain;
		
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
		
		IProject project = ((FileEditorInput) editorInput).getFile().getProject();
		
		GenerateAction generateAction = new GenerateAction(project, adapterFactory);
		generatorWritableValue.addChangeListener(event -> generateAction.setGenerator(generatorWritableValue.getValue()));
		selectionWritableValue.addChangeListener(event -> generateAction.setSelection(selectionWritableValue.getValue()));
		generateAction.setToolTipText("Generates code");
		generateAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.nasdanika.codegen.ecore.editor", "icons/full/obj16/cog.png"));
		
		form.getToolBarManager().add(generateAction);
		form.getToolBarManager().update(true);
						
		SashForm sections = new SashForm(form.getBody(), SWT.NONE);
		sections.setLayout(new GridLayout(2, false));
		sections.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		toolkit.paintBordersFor(sections);
		sections.setBackground(getDisplay().getSystemColor(SWT.COLOR_GRAY));
		
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
		
		checkboxTreeViewer.addCheckStateListener(new EcoreCodeGeneratorCheckStateListener(editingDomain, generatorWritableValue, checkboxTreeViewer) {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				super.checkStateChanged(event);
				if (event.getChecked()) {
					renderConfiguration(event.getElement());
				} else {
					renderConfiguration(null);
				}
			}
			
		});
		
		checkboxTreeViewer.setCheckStateProvider(new EcoreCodeGeneratorCheckStateProvider(generatorWritableValue, (ITreeContentProvider) checkboxTreeViewer.getContentProvider()));
		
		checkboxTreeViewer.setInput(generatorWritableValue);
		
		SashForm sashFormRight = new SashForm(sections, SWT.SMOOTH | SWT.VERTICAL);
		toolkit.adapt(sashFormRight);
		toolkit.paintBordersFor(sashFormRight);
		sashFormRight.setBackground(getDisplay().getSystemColor(SWT.COLOR_GRAY));
		
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
		
		configurationComposite = toolkit.createComposite(sctnConfiguration, SWT.NONE);
		toolkit.paintBordersFor(configurationComposite);
		sctnConfiguration.setClient(configurationComposite);
		configurationComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
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
				}	
				renderConfiguration(checkboxTreeViewer.getChecked(selection) ? selection : null);
				
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
	
	private CTabFolder configurationTabFolder;
	
	private void renderConfiguration(Object selection) {
		if (configurationTabFolder != null) {
			configurationTabFolder.dispose();
		}
		
		if (selection != null) {			
			String label = ("Update configuration entries ") + checkboxTreeViewer.getTree().getSelection()[0].getText();
			List<ConfigurationEntry> configuration = new ArrayList<>();
			RecordingCommand recordingCommand = new RecordingCommand((TransactionalEditingDomain) editingDomain, label) {

				@Override
				protected void doExecute() {
					EcoreCodeGenerator eCoreCodeGenerator = generatorWritableValue.getValue();
					if (selection == eCoreCodeGenerator) {
						updateConfiguration(eCoreCodeGenerator);
						configuration.addAll(eCoreCodeGenerator.getConfiguration());
					} else if (selection instanceof EModelElement) {
						ModelElement me = eCoreCodeGenerator.find((EModelElement) selection, true);
						updateConfiguration(me);
						configuration.addAll(me.getConfiguration());
					}
				}
				
			};

			editingDomain.getCommandStack().execute(recordingCommand);			

			if (!configuration.isEmpty()) {
				configurationTabFolder = new CTabFolder(configurationComposite, SWT.BORDER);
				toolkit.adapt(configurationTabFolder);
				toolkit.paintBordersFor(configurationTabFolder);
				configurationTabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
				
				Collections.sort(configuration, (a,b) -> a.getName().compareTo(b.getName()));
				for (ConfigurationEntry ce: configuration) {							
					CTabItem tabItem = new CTabItem(configurationTabFolder, SWT.NONE);
					tabItem.setText(ce.getName());

					ScrolledForm scrolledForm = toolkit.createScrolledForm(configurationTabFolder);
					scrolledForm.getBody().setLayout(new GridLayout());
					tabItem.setControl(scrolledForm);
					toolkit.paintBordersFor(scrolledForm);
					renderConfiguration(ce.getConfiguration(), scrolledForm.getBody());														
				}
				configurationTabFolder.setSelection(0);
			}					
		}
		
		configurationComposite.layout();		
	}
	
	private void renderConfiguration(EObject configuration, Composite parent) {
		try {
			for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor("org.nasdanika.codegen.ecore.editor.configuration_renderer")) {
				// TODO renderers cache to improve performance?
				if ("configuration_renderer".equals(ce.getName()) 
						&& configuration.eClass().getName().equals(ce.getAttribute("configuration_eclass_name"))
						&& configuration.eClass().getEPackage().getNsURI().equals(ce.getAttribute("configuration_epackage_ns_uri"))) {
					((ConfigurationRenderer) ce.createExecutableExtension("renderer_class_name")).render(parent, configuration, editingDomain);
					return;
				}
			}		
		
			ECPSWTViewRenderer.INSTANCE.render(parent, configuration);
		} catch (Exception e) {
			Label lblNewLabel = new Label(parent, SWT.NONE);
			toolkit.adapt(lblNewLabel, true, true);
			lblNewLabel.setText("Error rendering form: "+e);
			ecorecodegenerationEditorPlugin.INSTANCE.log(e);
		}		
	}
	
	private void updateConfiguration(ModelElement modelElement) {
		for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(GENERATION_TARGET_EXTENSION_POINT_ID)) {
			// TODO targets cache to improve performance?
			if ("generation_target".equals(ce.getName())) {
				String qualifiedID = ce.getContributor().getName()+"/"+ce.getAttribute("id");
				if (generatorWritableValue.getValue().getGenerationTargets().contains(qualifiedID)) {
					try {
						((GenerationTarget) ce.createExecutableExtension("class")).updateConfiguration(modelElement);
					} catch (CoreException e) {
						ecorecodegenerationEditPlugin.INSTANCE.log(e);
						e.printStackTrace();
					}
				}
			}
		}		
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
