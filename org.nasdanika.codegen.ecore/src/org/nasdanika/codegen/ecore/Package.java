/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Package is an EPackage counterpart in the ecore generator model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.Package#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EPackage namespace URI used by resolve().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getPackage_NsURI()
	 * @model
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Package#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package contains classes. Data types and enums are not supported by the ecore generator model - they are included by reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.codegen.ecore.Class> getClasses();

} // Package
