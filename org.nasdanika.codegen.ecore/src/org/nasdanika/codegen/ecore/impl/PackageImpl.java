/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EParameter;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.PackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ModelElementImpl implements org.nasdanika.codegen.ecore.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsURI() {
		return (String)eGet(EcorePackage.Literals.PACKAGE__NS_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(String newNsURI) {
		eSet(EcorePackage.Literals.PACKAGE__NS_URI, newNsURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.codegen.ecore.Class> getClasses() {
		return (EList<org.nasdanika.codegen.ecore.Class>)eGet(EcorePackage.Literals.PACKAGE__CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelElement find(EModelElement eModelElement, boolean create) {
		if (eModelElement instanceof EClass) {
			for (org.nasdanika.codegen.ecore.Class cls: getClasses()) {
				if (cls.getName().equals(((EClass) eModelElement).getName())) {
					return cls;
				}
			}
			if (!create) {
				return null;
			}
			org.nasdanika.codegen.ecore.Class cls = EcoreFactory.eINSTANCE.createClass();
			cls.setName(((EClass) eModelElement).getName());
			getClasses().add(cls);
			return cls;
		}
		
		if (eModelElement.eContainer() instanceof EClass) {
			org.nasdanika.codegen.ecore.Class cls = (org.nasdanika.codegen.ecore.Class) find((EClass) eModelElement.eContainer(), create);
			return cls == null ? null : cls.find(eModelElement, create);
		}
		
		if (eModelElement instanceof EParameter) {
			org.nasdanika.codegen.ecore.Class cls = (org.nasdanika.codegen.ecore.Class) find((EClass) eModelElement.eContainer().eContainer(), create);
			return cls == null ? null : cls.find(eModelElement, create);			
		}
		
		return null;
	}

} //PackageImpl
