/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for ecore generator model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.ModelElement#isSelected <em>Selected</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.ModelElement#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.ModelElement#getLastGenerationTargets <em>Last Generation Targets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ModelElement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this element is supported by the ecore generator model. True indicates that this element and all its children are part of the model. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.ModelElement#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model element description, e.g. explanation of supported configuration properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.ModelElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model element name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.ConfigurationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model element may contain zero or more generatort configurations. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationEntry> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generation targets selected for this element last time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Generation Targets</em>' attribute list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getModelElement_LastGenerationTargets()
	 * @model
	 * @generated
	 */
	EList<String> getLastGenerationTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds a model element corresponding to the passed EModelElement. Creates a new model element if necessary.
	 * @param eModelElement EModel element to find a corresponding ecore generator model element for.
	 * @param create If true, an element gets created if it is not found.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	ModelElement find(EModelElement eModelElement, boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getConfiguration(String id);

} // ModelElement
