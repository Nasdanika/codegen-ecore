package org.nasdanika.codegen.ecore.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Composite;

/**
 * Configuration renderer extensions shall implement this interface.
 * @author Pavel
 *
 */
public interface ConfigurationRenderer {
	
	/**
	 * Renders UI for configuration.
	 * @param parent Parent composite.
	 * @param configuration Configuration to render UI for.
	 * @param editingDomain Editing domain to possibly use in setting data bindings. 
	 * @throws Exception
	 */
	void render(Composite parent, EObject configuration, EditingDomain editingDomain) throws Exception;

}
