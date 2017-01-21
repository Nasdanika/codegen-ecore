package org.nasdanika.codegen.ecore.presentation;

import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.ModelElement;

public interface GenerationTarget {
	
	/**
	 * Different targets may require different configurations for different model elements.
	 * This method is invoked by the editor so the generation target may create configurations it requires.
	 * @param modelElement
	 */
	void updateConfiguration(ModelElement modelElement);

	/**
	 * Creates code generation work for a given selected object. 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	Work<?> createWork(Object obj) throws Exception;

}
