package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.ModelElement;

public class EcoreCodeGeneratorCheckStateProvider implements ICheckStateProvider {

	private WritableValue<EcoreCodeGenerator> eCoreCodeGeneratorWritableValue;
	ITreeContentProvider contentProvider;

	public EcoreCodeGeneratorCheckStateProvider(WritableValue<EcoreCodeGenerator> eCoreCodeGeneratorWritableValue, ITreeContentProvider contentProvider) {
		this.eCoreCodeGeneratorWritableValue = eCoreCodeGeneratorWritableValue;
		this.contentProvider = contentProvider;
	}
	
	private boolean hasSelectedChildren(Object element) {
		for (Object child: contentProvider.getChildren(element)) {
			ModelElement modelElement = eCoreCodeGeneratorWritableValue.getValue().find((EModelElement) child, false); 
			if (modelElement != null && modelElement.isSelected()) {
				return true;
			}
			if (hasSelectedChildren(child)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean hasUnselectedChildren(Object element) {
		for (Object child: contentProvider.getChildren(element)) {
			ModelElement modelElement = eCoreCodeGeneratorWritableValue.getValue().find((EModelElement) child, false); 
			if (modelElement == null || !modelElement.isSelected()) {
				return true;
			}
			if (hasUnselectedChildren(child)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isSelfOrParentSelected(Object element) {		
		EcoreCodeGenerator eCoreCodeGenerator = eCoreCodeGeneratorWritableValue.getValue();
		if (eCoreCodeGenerator.isSelected() || element == eCoreCodeGenerator || element == null) {
			return eCoreCodeGenerator.isSelected();
		}
		if (element instanceof EModelElement) {
			ModelElement modelElement = eCoreCodeGenerator.find((EModelElement) element, false);
			if (modelElement != null && modelElement.isSelected()) {
				return true;
			}
		}
		return isSelfOrParentSelected(contentProvider.getParent(element));		
	}

	/**
	 * Element is checked if it is selected of any of its children is selected or any of its parents is selected.
	 */
	@Override
	public boolean isChecked(Object element) {
		return isSelfOrParentSelected(element) || hasSelectedChildren(element);
	}

	@Override
	public boolean isGrayed(Object element) {
		return !isSelfOrParentSelected(element) && hasSelectedChildren(element) && hasUnselectedChildren(element);
	}

}
