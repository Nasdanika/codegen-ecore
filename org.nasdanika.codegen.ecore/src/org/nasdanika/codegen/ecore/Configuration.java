/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For each generator configuration a tab is displayed in the generator editor. Generation targets may share configurations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.Configuration#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.Configuration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getConfiguration()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Configuration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getConfiguration_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Configuration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Configuration
