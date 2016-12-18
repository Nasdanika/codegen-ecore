/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.codegen.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.codegen.ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = org.nasdanika.codegen.ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ECoreCodeGenerationImpl <em>ECore Code Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ECoreCodeGenerationImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getECoreCodeGeneration()
	 * @generated
	 */
	int ECORE_CODE_GENERATION = 0;

	/**
	 * The number of structural features of the '<em>ECore Code Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ECore Code Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.ECoreCodeGeneration <em>ECore Code Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECore Code Generation</em>'.
	 * @see org.nasdanika.codegen.ecore.ECoreCodeGeneration
	 * @generated
	 */
	EClass getECoreCodeGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ECoreCodeGenerationImpl <em>ECore Code Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ECoreCodeGenerationImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getECoreCodeGeneration()
		 * @generated
		 */
		EClass ECORE_CODE_GENERATION = eINSTANCE.getECoreCodeGeneration();

	}

} //EcorePackage
