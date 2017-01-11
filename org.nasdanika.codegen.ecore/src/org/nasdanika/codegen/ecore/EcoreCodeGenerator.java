/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root of the ecore generator model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackageSources <em>Package Sources</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getGenerationTargets <em>Generation Targets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGenerator()
 * @model
 * @generated
 */
public interface EcoreCodeGenerator extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Package Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.EPackageSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ecore generator contains one or more package sources providing EPackage's.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Sources</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGenerator_PackageSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPackageSource> getPackageSources();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.codegen.ecore.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ecore generator contains packages referencing EPackages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGenerator_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.codegen.ecore.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Generation Targets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generation targets used by this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation Targets</em>' attribute list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEcoreCodeGenerator_GenerationTargets()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getGenerationTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of EPackage's referenced by the model.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EPackage> getEPackages();
} // EcoreCodeGenerator
