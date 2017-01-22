/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ModelElementImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__LAST_GENERATION_TARGETS = 4;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl <em>Code Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEcoreCodeGenerator()
	 * @generated
	 */
	int ECORE_CODE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__SELECTED = MODEL_ELEMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__LAST_GENERATION_TARGETS = MODEL_ELEMENT__LAST_GENERATION_TARGETS;

	/**
	 * The feature id for the '<em><b>Package Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__PACKAGE_SOURCES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__PACKAGES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR__GENERATION_TARGETS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR___FIND__EMODELELEMENT_BOOLEAN = MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The operation id for the '<em>Get EPackages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR___GET_EPACKAGES = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR___IS_SELECTED__EMODELELEMENT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR___GET_CONFIGURATION__EMODELELEMENT = MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.EPackageSourceImpl <em>EPackage Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.EPackageSourceImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEPackageSource()
	 * @generated
	 */
	int EPACKAGE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_SOURCE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Ns UR Is</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_SOURCE__NS_UR_IS = 1;

	/**
	 * The number of structural features of the '<em>EPackage Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get EPackages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_SOURCE___GET_EPACKAGES = 0;

	/**
	 * The number of operations of the '<em>EPackage Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_SOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.PackageImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SELECTED = MODEL_ELEMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_GENERATION_TARGETS = MODEL_ELEMENT__LAST_GENERATION_TARGETS;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NS_URI = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___FIND__EMODELELEMENT_BOOLEAN = MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ClassImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SELECTED = MODEL_ELEMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LAST_GENERATION_TARGETS = MODEL_ELEMENT__LAST_GENERATION_TARGETS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___FIND__EMODELELEMENT_BOOLEAN = MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.Member <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.Member
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 10;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SELECTED = MODEL_ELEMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LAST_GENERATION_TARGETS = MODEL_ELEMENT__LAST_GENERATION_TARGETS;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___FIND__EMODELELEMENT_BOOLEAN = MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.StructuralFeature <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.StructuralFeature
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__SELECTED = MEMBER__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__CONFIGURATION = MEMBER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LAST_GENERATION_TARGETS = MEMBER__LAST_GENERATION_TARGETS;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___FIND__EMODELELEMENT_BOOLEAN = MEMBER___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.AttributeImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SELECTED = STRUCTURAL_FEATURE__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = STRUCTURAL_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONFIGURATION = STRUCTURAL_FEATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LAST_GENERATION_TARGETS = STRUCTURAL_FEATURE__LAST_GENERATION_TARGETS;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___FIND__EMODELELEMENT_BOOLEAN = STRUCTURAL_FEATURE___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ReferenceImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SELECTED = STRUCTURAL_FEATURE__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DESCRIPTION = STRUCTURAL_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONFIGURATION = STRUCTURAL_FEATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LAST_GENERATION_TARGETS = STRUCTURAL_FEATURE__LAST_GENERATION_TARGETS;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___FIND__EMODELELEMENT_BOOLEAN = STRUCTURAL_FEATURE___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.OperationImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SELECTED = MEMBER__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONFIGURATION = MEMBER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LAST_GENERATION_TARGETS = MEMBER__LAST_GENERATION_TARGETS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___FIND__EMODELELEMENT_BOOLEAN = MEMBER___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ParameterImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SELECTED = MODEL_ELEMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Last Generation Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LAST_GENERATION_TARGETS = MODEL_ELEMENT__LAST_GENERATION_TARGETS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_NS_URI = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MANY = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___FIND__EMODELELEMENT_BOOLEAN = MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.ConfigurationEntryImpl <em>Configuration Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.ConfigurationEntryImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getConfigurationEntry()
	 * @generated
	 */
	int CONFIGURATION_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ENTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ENTRY__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Configuration Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl <em>Code Generator Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEcoreCodeGeneratorConfiguration()
	 * @generated
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Target Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION__TARGET_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION__SOURCE_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION__BASE_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Code Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Code Generator Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_CODE_GENERATOR_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator <em>Code Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Generator</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator
	 * @generated
	 */
	EClass getEcoreCodeGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackageSources <em>Package Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Sources</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackageSources()
	 * @see #getEcoreCodeGenerator()
	 * @generated
	 */
	EReference getEcoreCodeGenerator_PackageSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#getPackages()
	 * @see #getEcoreCodeGenerator()
	 * @generated
	 */
	EReference getEcoreCodeGenerator_Packages();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getGenerationTargets <em>Generation Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generation Targets</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#getGenerationTargets()
	 * @see #getEcoreCodeGenerator()
	 * @generated
	 */
	EAttribute getEcoreCodeGenerator_GenerationTargets();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getEPackages() <em>Get EPackages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EPackages</em>' operation.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#getEPackages()
	 * @generated
	 */
	EOperation getEcoreCodeGenerator__GetEPackages();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#isSelected(org.eclipse.emf.ecore.EModelElement) <em>Is Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Selected</em>' operation.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#isSelected(org.eclipse.emf.ecore.EModelElement)
	 * @generated
	 */
	EOperation getEcoreCodeGenerator__IsSelected__EModelElement();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.EcoreCodeGenerator#getConfiguration(org.eclipse.emf.ecore.EModelElement) <em>Get Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Configuration</em>' operation.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGenerator#getConfiguration(org.eclipse.emf.ecore.EModelElement)
	 * @generated
	 */
	EOperation getEcoreCodeGenerator__GetConfiguration__EModelElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.EPackageSource <em>EPackage Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Source</em>'.
	 * @see org.nasdanika.codegen.ecore.EPackageSource
	 * @generated
	 */
	EClass getEPackageSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.EPackageSource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.codegen.ecore.EPackageSource#getLocation()
	 * @see #getEPackageSource()
	 * @generated
	 */
	EAttribute getEPackageSource_Location();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ecore.EPackageSource#getNsURIs <em>Ns UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ns UR Is</em>'.
	 * @see org.nasdanika.codegen.ecore.EPackageSource#getNsURIs()
	 * @see #getEPackageSource()
	 * @generated
	 */
	EAttribute getEPackageSource_NsURIs();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.EPackageSource#getEPackages() <em>Get EPackages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EPackages</em>' operation.
	 * @see org.nasdanika.codegen.ecore.EPackageSource#getEPackages()
	 * @generated
	 */
	EOperation getEPackageSource__GetEPackages();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.ModelElement#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement#isSelected()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.ModelElement#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement#getConfiguration()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Configuration();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.codegen.ecore.ModelElement#getLastGenerationTargets <em>Last Generation Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Last Generation Targets</em>'.
	 * @see org.nasdanika.codegen.ecore.ModelElement#getLastGenerationTargets()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_LastGenerationTargets();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.ModelElement#find(org.eclipse.emf.ecore.EModelElement, boolean) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.nasdanika.codegen.ecore.ModelElement#find(org.eclipse.emf.ecore.EModelElement, boolean)
	 * @generated
	 */
	EOperation getModelElement__Find__EModelElement_boolean();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.nasdanika.codegen.ecore.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.Package#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see org.nasdanika.codegen.ecore.Package#getNsURI()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_NsURI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.nasdanika.codegen.ecore.Package#getClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.nasdanika.codegen.ecore.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.Class#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.codegen.ecore.Class#getMembers()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see org.nasdanika.codegen.ecore.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.nasdanika.codegen.ecore.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.codegen.ecore.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.nasdanika.codegen.ecore.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.codegen.ecore.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.codegen.ecore.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.codegen.ecore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.Parameter#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.nasdanika.codegen.ecore.Parameter#getTypeName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.Parameter#getTypeNsURI <em>Type Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ns URI</em>'.
	 * @see org.nasdanika.codegen.ecore.Parameter#getTypeNsURI()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypeNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.Parameter#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.nasdanika.codegen.ecore.Parameter#isMany()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Many();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.codegen.ecore.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.ConfigurationEntry <em>Configuration Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Entry</em>'.
	 * @see org.nasdanika.codegen.ecore.ConfigurationEntry
	 * @generated
	 */
	EClass getConfigurationEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.ConfigurationEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.codegen.ecore.ConfigurationEntry#getId()
	 * @see #getConfigurationEntry()
	 * @generated
	 */
	EAttribute getConfigurationEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.ConfigurationEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.codegen.ecore.ConfigurationEntry#getName()
	 * @see #getConfigurationEntry()
	 * @generated
	 */
	EAttribute getConfigurationEntry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.codegen.ecore.ConfigurationEntry#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.ConfigurationEntry#getConfiguration()
	 * @see #getConfigurationEntry()
	 * @generated
	 */
	EReference getConfigurationEntry_Configuration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration <em>Code Generator Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Generator Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration
	 * @generated
	 */
	EClass getEcoreCodeGeneratorConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getTargetProject <em>Target Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Project</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getTargetProject()
	 * @see #getEcoreCodeGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getEcoreCodeGeneratorConfiguration_TargetProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getSourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Folder</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getSourceFolder()
	 * @see #getEcoreCodeGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getEcoreCodeGeneratorConfiguration_SourceFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getBasePackage()
	 * @see #getEcoreCodeGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getEcoreCodeGeneratorConfiguration_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration#getDescription()
	 * @see #getEcoreCodeGeneratorConfiguration()
	 * @generated
	 */
	EAttribute getEcoreCodeGeneratorConfiguration_Description();

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
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl <em>Code Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEcoreCodeGenerator()
		 * @generated
		 */
		EClass ECORE_CODE_GENERATOR = eINSTANCE.getEcoreCodeGenerator();
		/**
		 * The meta object literal for the '<em><b>Package Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_CODE_GENERATOR__PACKAGE_SOURCES = eINSTANCE.getEcoreCodeGenerator_PackageSources();
		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_CODE_GENERATOR__PACKAGES = eINSTANCE.getEcoreCodeGenerator_Packages();
		/**
		 * The meta object literal for the '<em><b>Generation Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_CODE_GENERATOR__GENERATION_TARGETS = eINSTANCE.getEcoreCodeGenerator_GenerationTargets();
		/**
		 * The meta object literal for the '<em><b>Get EPackages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_CODE_GENERATOR___GET_EPACKAGES = eINSTANCE.getEcoreCodeGenerator__GetEPackages();
		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_CODE_GENERATOR___IS_SELECTED__EMODELELEMENT = eINSTANCE.getEcoreCodeGenerator__IsSelected__EModelElement();
		/**
		 * The meta object literal for the '<em><b>Get Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECORE_CODE_GENERATOR___GET_CONFIGURATION__EMODELELEMENT = eINSTANCE.getEcoreCodeGenerator__GetConfiguration__EModelElement();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.EPackageSourceImpl <em>EPackage Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.EPackageSourceImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEPackageSource()
		 * @generated
		 */
		EClass EPACKAGE_SOURCE = eINSTANCE.getEPackageSource();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_SOURCE__LOCATION = eINSTANCE.getEPackageSource_Location();
		/**
		 * The meta object literal for the '<em><b>Ns UR Is</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_SOURCE__NS_UR_IS = eINSTANCE.getEPackageSource_NsURIs();
		/**
		 * The meta object literal for the '<em><b>Get EPackages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_SOURCE___GET_EPACKAGES = eINSTANCE.getEPackageSource__GetEPackages();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ModelElementImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();
		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__SELECTED = eINSTANCE.getModelElement_Selected();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();
		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONFIGURATION = eINSTANCE.getModelElement_Configuration();
		/**
		 * The meta object literal for the '<em><b>Last Generation Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__LAST_GENERATION_TARGETS = eINSTANCE.getModelElement_LastGenerationTargets();
		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN = eINSTANCE.getModelElement__Find__EModelElement_boolean();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.PackageImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();
		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NS_URI = eINSTANCE.getPackage_NsURI();
		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ClassImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();
		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.StructuralFeature <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.StructuralFeature
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.AttributeImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ReferenceImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.OperationImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ParameterImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();
		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_NAME = eINSTANCE.getParameter_TypeName();
		/**
		 * The meta object literal for the '<em><b>Type Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_NS_URI = eINSTANCE.getParameter_TypeNsURI();
		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MANY = eINSTANCE.getParameter_Many();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.Member <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.Member
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.ConfigurationEntryImpl <em>Configuration Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.ConfigurationEntryImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getConfigurationEntry()
		 * @generated
		 */
		EClass CONFIGURATION_ENTRY = eINSTANCE.getConfigurationEntry();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ENTRY__ID = eINSTANCE.getConfigurationEntry_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ENTRY__NAME = eINSTANCE.getConfigurationEntry_Name();
		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ENTRY__CONFIGURATION = eINSTANCE.getConfigurationEntry_Configuration();
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl <em>Code Generator Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.impl.EcorePackageImpl#getEcoreCodeGeneratorConfiguration()
		 * @generated
		 */
		EClass ECORE_CODE_GENERATOR_CONFIGURATION = eINSTANCE.getEcoreCodeGeneratorConfiguration();
		/**
		 * The meta object literal for the '<em><b>Target Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_CODE_GENERATOR_CONFIGURATION__TARGET_PROJECT = eINSTANCE.getEcoreCodeGeneratorConfiguration_TargetProject();
		/**
		 * The meta object literal for the '<em><b>Source Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_CODE_GENERATOR_CONFIGURATION__SOURCE_FOLDER = eINSTANCE.getEcoreCodeGeneratorConfiguration_SourceFolder();
		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_CODE_GENERATOR_CONFIGURATION__BASE_PACKAGE = eINSTANCE.getEcoreCodeGeneratorConfiguration_BasePackage();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_CODE_GENERATOR_CONFIGURATION__DESCRIPTION = eINSTANCE.getEcoreCodeGeneratorConfiguration_Description();

	}

} //EcorePackage
