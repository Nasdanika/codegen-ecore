package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.ModelElement;

public class EcoreCodeGeneratorCheckStateListener implements ICheckStateListener {
	
	private Command refreshCommand;
	private EditingDomain editingDomain;
	private WritableValue<EcoreCodeGenerator> eCoreCodeGeneratorWritableValue;
	private CheckboxTreeViewer checkboxTreeViewer;

	public EcoreCodeGeneratorCheckStateListener(EditingDomain editingDomain, WritableValue<EcoreCodeGenerator> eCoreCodeGeneratorWritableValue, CheckboxTreeViewer checkboxTreeViewer) {
		this.editingDomain = editingDomain;
		this.eCoreCodeGeneratorWritableValue = eCoreCodeGeneratorWritableValue;
		this.checkboxTreeViewer = checkboxTreeViewer;
		refreshCommand = new AbstractCommand() {

				@Override
				public void redo() {
					checkboxTreeViewer.refresh();							
				}

				@Override
				public void undo() {
					checkboxTreeViewer.refresh();
				}

				@Override
				public void execute() {
					// NOP							
				}

				@Override
				protected boolean prepare() {
					return true;
				}

			};
	}
	
	/**
	 * Invokes {@link ModelElement}.setSelected() only if current selection is different from the one specified.
	 * @param modelElement
	 * @param selected
	 */
	private void setSelected(ModelElement modelElement, boolean selected) {
		if (modelElement.isSelected() != selected) {
			modelElement.setSelected(selected);
		}
	}

	@Override
	public void checkStateChanged(CheckStateChangedEvent event) {
		EcoreCodeGenerator eCoreCodeGenerator = eCoreCodeGeneratorWritableValue.getValue();
		if (eCoreCodeGenerator != null) {
			Object element = event.getElement();

			String label = (event.getChecked() ? "check " : "uncheck ") + ((ILabelProvider) checkboxTreeViewer.getLabelProvider()).getText(element);
			RecordingCommand recordingCommand = new RecordingCommand((TransactionalEditingDomain) editingDomain, label) {

				@Override
				protected void doExecute() {
					checkStateChanged(element, null);
				}
								
				/**
				 * Child element reports its check state change to the parent. 
				 * If the parent has handled the state change, this method returns true. 
				 */
				private boolean checkStateChanged(Object element, Object reportingChild) {
					EcoreCodeGenerator eCoreCodeGenerator = eCoreCodeGeneratorWritableValue.getValue();
					if (element != eCoreCodeGenerator) {
						// Reporting to the parent
						Object parent = ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getParent(element);
						if (parent != null && checkStateChanged(parent, element)) {
							return true;
						}
					}
					
					// Handling self
					if (checkboxTreeViewer.getGrayed(element)) {
						if (element == eCoreCodeGenerator) {
							setSelected(eCoreCodeGenerator, false);
						} else if (element instanceof EModelElement) {
							ModelElement me = eCoreCodeGenerator.find((EModelElement) element, false);
							if (me != null) {
								setSelected(me, false);
							}
						}
						
						for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(element)) {				
							if (child != reportingChild && !checkboxTreeViewer.getGrayed(child)) {
								select(child, checkboxTreeViewer.getChecked(child));
							}
						}
						return false;
					}

					return select(element, checkboxTreeViewer.getChecked(element));
				}
				
				/**
				 * Makes a change in the code generator model by unselecting 
				 * all children of the element and either selecting or de-selecting the element.
				 */
				private boolean select(Object element, boolean selected) {
					EcoreCodeGenerator eCoreCodeGenerator = eCoreCodeGeneratorWritableValue.getValue();
					ModelElement me = null;
					if (element == eCoreCodeGenerator) {
						me = eCoreCodeGenerator;
					} else if (element instanceof EModelElement) {
						// No need to create an element if it is not selected
						me = eCoreCodeGenerator.find((EModelElement) element, selected);
					}
					// Either not found or not created
					if (me == null) {
						return !selected;
					}
					
					for (Object child: ((ITreeContentProvider) checkboxTreeViewer.getContentProvider()).getChildren(element)) {
						select(child, false);
					}
					setSelected(me, selected);
					return true;
				}
				
			};

			CompoundCommand compoundCommand = new CompoundCommand(label);
			compoundCommand.append(refreshCommand);
			compoundCommand.append(recordingCommand);
			compoundCommand.append(refreshCommand);

			editingDomain.getCommandStack().execute(compoundCommand);
		}

	}
			
}
