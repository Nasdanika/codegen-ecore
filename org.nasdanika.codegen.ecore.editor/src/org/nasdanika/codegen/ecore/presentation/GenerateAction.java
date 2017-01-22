package org.nasdanika.codegen.ecore.presentation;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.GeneratorLabelProvider;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.provider.ecorecodegenerationEditPlugin;
import org.nasdanika.codegen.presentation.CodegenEditorPlugin;
import org.nasdanika.codegen.util.JavaProjectClassLoader;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.Context;

class GenerateAction extends Action implements GeneratorLabelProvider {
	
	private EcoreCodeGenerator generator;
	private EObject selection;
	private AdapterFactory adapterFactory;
	private IProject project;
	
	GenerateAction(IProject project, AdapterFactory adapterFactory) {
		super("Generate code", IAction.AS_PUSH_BUTTON);
		this.project = project;
		this.adapterFactory = adapterFactory;
	}
	
	public void setGenerator(EcoreCodeGenerator generator) {
		this.generator = generator;
	}
	
	public void setSelection(EObject selection) {
		this.selection = selection;
		setEnabled(selection != null);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		if (selection != null) {
			IWorkbench workbench = PlatformUI.getWorkbench();
			Shell shell = workbench.getModalDialogShellProvider().getShell();
						
			Diagnostician diagnostician = new Diagnostician() {
				
				@Override
				public String getObjectLabel(EObject eObject) {
					if (eObject != null && adapterFactory != null && !eObject.eIsProxy()) {
						IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(eObject, IItemLabelProvider.class);
						if (itemLabelProvider != null) {
							return itemLabelProvider.getText(eObject);
						}
					}
					
					return super.getObjectLabel(eObject);
				}
				
			}; 
			
			BasicDiagnostic accumulator = new BasicDiagnostic();
			accumulator.add(diagnostician.validate(selection));
			
			IStatus validationStatus = BasicDiagnostic.toIStatus(accumulator);
			if (validationStatus.getSeverity() == IStatus.ERROR) {
	            ErrorDialog.openError(shell, "Generation model is invalid", "Generation model contains errors", validationStatus);
				CodegenEditorPlugin.getPlugin().getLog().log(validationStatus);
				return;
			}
			
			try {							
				URI resourceURI = selection.eResource().getURI();
				URL baseURL = null;			
				try {
					baseURL = new URL(resourceURI.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Map<String, Object> properties = new HashMap<>();
				properties.put(Configuration.BASE_URL_PROPERTY, baseURL);
								
				ClassLoader[] classLoader = { getClass().getClassLoader() }; 
				
//				IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
//				if (modelFile.exists()) {
//					IProject project = modelFile.getProject();
					IProjectNature javaNature = project.getNature(JavaCore.NATURE_ID);
					if (javaNature instanceof IJavaProject) {
						classLoader[0] = new JavaProjectClassLoader(classLoader[0], (IJavaProject) javaNature);
					}					
//				}
				
				Predicate<Object> overwritePredicate = (obj) -> {
					
					int[] result = { 0 };
				
					shell.getDisplay().syncExec(() -> {
						WorkbenchLabelProvider wlp = new WorkbenchLabelProvider();
						MessageDialog dialog = new MessageDialog(
								shell, 
								"Confirm overwrite "+obj.getClass().getName(), 
								null, 
								"Overwrite "+wlp.getText(obj), MessageDialog.QUESTION_WITH_CANCEL, 
								0, 
								new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL });
						
						result[0] = dialog.open();
 					});
					
					if (result[0] == 2) { // index of the cancel button.
						throw new OperationCanceledException();
					}
					
					return result[0] == 0;
				};
				
				properties.put(ReconcileAction.OVERWRITE_PREDICATE_CONTEXT_PROPERTY_NAME, overwritePredicate);
				properties.put("selection", selection);
				
				// TODO - models and selections as properties plus custom properties.
				
				Context rootContext = new Context() {
	
					@Override
					public Object get(String name) {
						if (properties.containsKey(name)) {
							return properties.get(name);
						}
						
						String[] result = { null };					
						shell.getDisplay().syncExec(() -> {						
						    InputDialog id = new InputDialog(shell, "Property value",  "Provide value for property '"+name+"'", null, null);
					        if (id.open() == Window.OK) {
					        	result[0] = id.getValue();
					        }																		
						});
						properties.put(name, result[0]);
						return result[0];
					}
	
					@Override
					public <T> T get(Class<T> type) {
						
						if (EcoreCodeGenerator.class.equals(type)) {
							return (T) generator;
						}
						
						if (GeneratorLabelProvider.class.equals(type)) {
							return (T) GenerateAction.this;
						}
						
						return null;
					}
	
					@Override
					public ClassLoader getClassLoader() {
						return classLoader[0];
					}
					
				};				
				
				WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
					
					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {	
						try {
							List<Work<?>> allWork = new ArrayList<>();
							int totalWork = 0;
							
							for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(EcoreCodegenForm.GENERATION_TARGET_EXTENSION_POINT_ID)) {
								// TODO targets cache to improve performance?
								if ("generation_target".equals(ce.getName())) {
									String qualifiedID = ce.getContributor().getName()+"/"+ce.getAttribute("id");
									if (generator.getGenerationTargets().contains(qualifiedID)) {
										try {
											Work<?> work = ((GenerationTarget) ce.createExecutableExtension("class")).createWork(generator, selection);
											totalWork += work.size();
											allWork.add(new Work<Object>() {

												@Override
												public int size() {
													return work.size();
												}

												@Override
												public Object execute(Context context, SubMonitor monitor) throws Exception {
													if (adapterFactory != null && !selection.eIsProxy()) {
														IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(selection, IItemLabelProvider.class);
														if (itemLabelProvider != null) {
															monitor.setTaskName("Generating target \"" + ce.getAttribute("name") +"\" for " + itemLabelProvider.getText(selection));
														}
													}
													return work.execute(context, monitor);
												}
												
											});
										} catch (CoreException e) {
											ecorecodegenerationEditPlugin.INSTANCE.log(e);
											e.printStackTrace();
										}
									}
								}
							}		
							SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);
							for (Work<?> work: allWork) {
								work.execute(rootContext, subMonitor);
							}
						} catch (CoreException | InvocationTargetException | InterruptedException | RuntimeException e) {
							throw e;
						} catch (Exception e) {
							throw new InvocationTargetException(e);
						} finally {
							monitor.done();
						}					
					}
					
				};
	
				new ProgressMonitorDialog(shell).run(true, true, operation);
			} catch (Exception exception) {
	            MultiStatus status = createMultiStatus(exception.toString(), exception);
	            ErrorDialog.openError(shell, "Generation error", exception.toString(), status);
				CodegenEditorPlugin.getPlugin().getLog().log(status);
				exception.printStackTrace();
			}
		}
	}
	
	private static MultiStatus createMultiStatus(String msg, Throwable t) {
		List<Status> childStatuses = new ArrayList<>();

		for (StackTraceElement stackTrace : t.getStackTrace()) {
			childStatuses.add(new Status(IStatus.ERROR, "org.nasdanika.codegen.editor", stackTrace.toString()));
		}

		if (t.getCause() != null) {
			childStatuses.add(createMultiStatus("Caused by: " + t.getCause(), t.getCause()));
		}

		for (Throwable s : t.getSuppressed()) {
			childStatuses.add(createMultiStatus("Supressed: " + s, s.getCause()));
		}

		MultiStatus ms = new MultiStatus("org.nasdanika.codegen.editor", IStatus.ERROR,	childStatuses.toArray(new Status[childStatuses.size()]), msg, t);

		return ms;
	}
	
	@Override
	public String getLabel(Generator<?> generator) {		
		if (generator != null && adapterFactory != null && !generator.eIsProxy()) {
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(generator,	IItemLabelProvider.class);
			if (itemLabelProvider != null) {
				return itemLabelProvider.getText(generator);
			}
		}
		
		return null;
	}
	

}
