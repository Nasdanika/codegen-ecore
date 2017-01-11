/**
 */
package org.nasdanika.codegen.ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.Parameter#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.Parameter#getTypeNsURI <em>Type Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.Parameter#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getParameter_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Parameter#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Type Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ns URI</em>' attribute.
	 * @see #setTypeNsURI(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getParameter_TypeNsURI()
	 * @model
	 * @generated
	 */
	String getTypeNsURI();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Parameter#getTypeNsURI <em>Type Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ns URI</em>' attribute.
	 * @see #getTypeNsURI()
	 * @generated
	 */
	void setTypeNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getParameter_Many()
	 * @model
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Parameter#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

} // Parameter
