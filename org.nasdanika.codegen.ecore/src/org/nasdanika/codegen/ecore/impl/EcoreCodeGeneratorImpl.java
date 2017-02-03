/**
 */
package org.nasdanika.codegen.ecore.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.codegen.ecore.ConfigurationEntry;
import org.nasdanika.codegen.ecore.EPackageSource;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl#getPackageSources <em>Package Sources</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl#getGenerationTargets <em>Generation Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoreCodeGeneratorImpl extends ModelElementImpl implements EcoreCodeGenerator {
	
	private ResourceSetImpl resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreCodeGeneratorImpl() {
		super();
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ECORE_CODE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EPackageSource> getPackageSources() {
		return (EList<EPackageSource>)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR__PACKAGE_SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.codegen.ecore.Package> getPackages() {
		return (EList<org.nasdanika.codegen.ecore.Package>)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR__PACKAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationTargets() {
		return (EList<String>)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR__GENERATION_TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EPackage> getEPackages() {
		EList<EPackage> ret = ECollections.newBasicEList();
		for (EPackageSource ps: getPackageSources()) {
			ret.addAll(ps.getEPackages(resourceSet));
		}		
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSelected(EModelElement eModelElement) {
		if (isSelected()) {
			return true;
		}
		ModelElement me = find(eModelElement, false);
		if (me != null && me.isSelected()) {
			return true;
		}
		
		TreeIterator<EObject> cit = eModelElement.eAllContents();
		while (cit.hasNext()) {
			EObject next = cit.next();
			if (next instanceof EModelElement) {
				me = find((EModelElement) next, false);
				if (me != null && me.isSelected()) {
					return true;
				}
			}
		}
		
		for (EObject container = eModelElement.eContainer(); container instanceof EModelElement; container = container.eContainer()) {
			me = find((EModelElement) container, false);
			if (me != null && me.isSelected()) {
				return true;
			}			
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, EObject> getConfiguration(EModelElement eModelElement) {
		if (isSelected(eModelElement)) {
			Map<String, EObject> ret = new HashMap<>();
			ModelElement me = find(eModelElement, false);
			if (me != null) {
				for (ConfigurationEntry ce: me.getConfiguration()) {
					ret.put(ce.getId(), ce.getConfiguration());
				}
			}
			return ret;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getConfiguration(String id) {
		for (ConfigurationEntry ce: getConfiguration()) {
			if (ce.getId().equals(id)) {
				return ce.getConfiguration();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelElement find(EModelElement eModelElement, boolean create) {
		if (eModelElement instanceof EPackage) {			
			for (org.nasdanika.codegen.ecore.Package pkg: getPackages()) {
				if (((EPackage) eModelElement).getNsURI().equals(pkg.getNsURI())) {
					return pkg;
				}
			}
			if (!create) {
				return null;
			}
			org.nasdanika.codegen.ecore.Package pkg = EcoreFactory.eINSTANCE.createPackage();
			pkg.setName(((EPackage) eModelElement).getName());
			pkg.setNsURI(((EPackage) eModelElement).getNsURI());
			getPackages().add(pkg);
			return pkg;
		}
		
		for (EObject c = eModelElement.eContainer(); c != null; c = c.eContainer()) {
			if (c instanceof EPackage) {
				org.nasdanika.codegen.ecore.Package pkg = (org.nasdanika.codegen.ecore.Package) find((EPackage) c, create);
				return pkg == null ? null : pkg.find(eModelElement, create);
			}			
		}
		
		// TODO - sometimes proxies are not resolved. 
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.ECORE_CODE_GENERATOR___GET_EPACKAGES:
				return getEPackages();
			case EcorePackage.ECORE_CODE_GENERATOR___IS_SELECTED__EMODELELEMENT:
				return isSelected((EModelElement)arguments.get(0));
			case EcorePackage.ECORE_CODE_GENERATOR___GET_CONFIGURATION__EMODELELEMENT:
				return getConfiguration((EModelElement)arguments.get(0));
			case EcorePackage.ECORE_CODE_GENERATOR___GET_CONFIGURATION__STRING:
				return getConfiguration((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EcoreCodeGeneratorImpl
