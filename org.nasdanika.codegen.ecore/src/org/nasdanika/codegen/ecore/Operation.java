/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Corresponds to EOperation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.Operation#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Member {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Operation
