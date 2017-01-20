/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getTargetProject <em>Target Project</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getSourceFolder <em>Source Folder</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGeneratorConfiguration()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EcoreCodeGeneratorConfiguration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Target Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Project</em>' attribute.
	 * @see #setTargetProject(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGeneratorConfiguration_TargetProject()
	 * @model
	 * @generated
	 */
	String getTargetProject();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getTargetProject <em>Target Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Project</em>' attribute.
	 * @see #getTargetProject()
	 * @generated
	 */
	void setTargetProject(String value);

	/**
	 * Returns the value of the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Folder</em>' attribute.
	 * @see #setSourceFolder(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGeneratorConfiguration_SourceFolder()
	 * @model
	 * @generated
	 */
	String getSourceFolder();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getSourceFolder <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Folder</em>' attribute.
	 * @see #getSourceFolder()
	 * @generated
	 */
	void setSourceFolder(String value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGeneratorConfiguration_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGeneratorConfiguration_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // EcoreCodeGeneratorConfiguration
