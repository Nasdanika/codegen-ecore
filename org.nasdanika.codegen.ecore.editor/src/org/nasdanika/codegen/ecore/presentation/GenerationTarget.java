package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.ModelElement;

public interface GenerationTarget {
	
	/**
	 * Different targets may require different configurations for different model elements.
	 * This method is invoked by the editor so the generation target may create configurations it requires.
	 * @param modelElement
	 */
	void updateConfiguration(ModelElement modelElement);
	
	/**
	 * Different targets may operate on different model elements. The tree editor displays only elements supported by at least one target.
	 * @param modelElement
	 * @return
	 */
	boolean isSupported(EModelElement modelElement);

	/**
	 * Creates code generation work for a given selected object. 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	Work<?> createWork(EcoreCodeGenerator generator, EObject selection) throws Exception;

}
