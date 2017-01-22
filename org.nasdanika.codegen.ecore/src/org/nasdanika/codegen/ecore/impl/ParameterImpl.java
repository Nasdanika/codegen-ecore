/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ParameterImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ParameterImpl#getTypeNsURI <em>Type Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ParameterImpl#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ModelElementImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return (String)eGet(EcorePackage.Literals.PARAMETER__TYPE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		eSet(EcorePackage.Literals.PARAMETER__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeNsURI() {
		return (String)eGet(EcorePackage.Literals.PARAMETER__TYPE_NS_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNsURI(String newTypeNsURI) {
		eSet(EcorePackage.Literals.PARAMETER__TYPE_NS_URI, newTypeNsURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		return (Boolean)eGet(EcorePackage.Literals.PARAMETER__MANY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany) {
		eSet(EcorePackage.Literals.PARAMETER__MANY, newMany);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelElement find(EModelElement eModelElement, boolean create) {
		return null;
	}

} //ParameterImpl
