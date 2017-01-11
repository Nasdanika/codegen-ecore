/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Corresponds to EClass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.Class#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getClass_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // Class
