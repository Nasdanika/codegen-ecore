package org.nasdanika.codegen.ecore.provider;

import java.util.Collection;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * Fixes delete problem for local CDO models.
 * @author Pavel Vlasov
 *
 */
public class CDOItemProviderAdapterEx extends CDOItemProviderAdapter {
	
	public CDOItemProviderAdapterEx(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) {
		Object parent = super.getParent(object);
		if (parent == null && object instanceof EObject) {
			EObject container = ((EObject) object).eContainer();
			parent = container == null ? ((EObject) object).eResource() : container;
		}
		return parent;
	}
		
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}	

	/**
	 * Collects compatible children from all models in the global registry except this one.  
	 * This behavior allows extending config/codegen editor with new model elements by simply installing
	 * new models into IDE.
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		
		// TODO - Implement iteration over registered models and collection of compatible children.
		// TODO - Perhaps iterate and collect in a constructor and here just add to the list of new child descriptors.
	}	

}
