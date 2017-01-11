/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReferenceImpl extends ModelElementImpl implements Reference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelElement find(EModelElement eModelElement, boolean create) {
		throw new UnsupportedOperationException("find() shall not be invoked on leaf model elements");
	}

} //ReferenceImpl
