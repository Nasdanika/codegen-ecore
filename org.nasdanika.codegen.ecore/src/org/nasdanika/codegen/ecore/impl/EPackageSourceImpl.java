/**
 */
package org.nasdanika.codegen.ecore.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.ecore.EPackageSource;
import org.nasdanika.codegen.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EPackageSourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EPackageSourceImpl#getNsURIs <em>Ns UR Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageSourceImpl extends CDOObjectImpl implements EPackageSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EPACKAGE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eGet(EcorePackage.Literals.EPACKAGE_SOURCE__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eSet(EcorePackage.Literals.EPACKAGE_SOURCE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getNsURIs() {
		return (EList<String>)eGet(EcorePackage.Literals.EPACKAGE_SOURCE__NS_UR_IS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EPackage> getEPackages() {
		EList<EPackage> ret = ECollections.newBasicEList();
		
		if (getLocation() == null || getLocation().trim().length() == 0) {
			// Global registry
			for (String nsURI: getNsURIs()) {
				EPackage ep = EPackage.Registry.INSTANCE.getEPackage(nsURI);
				if (ep != null) {
					ret.add(ep);
				}
			}			
		} else {		
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			URI uri = URI.createURI(getLocation());
			Resource resource = resourceSet.getResource(uri, true);
			TreeIterator<EObject> cit = resource.getAllContents();
			while (cit.hasNext()) {
				EObject next = cit.next();
				if (next instanceof EPackage && (getNsURIs().isEmpty() || getNsURIs().contains(((EPackage) next).getNsURI()))) {
					ret.add((EPackage) next);
				}
			}
		}

		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.EPACKAGE_SOURCE___GET_EPACKAGES:
				return getEPackages();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EPackageSourceImpl
