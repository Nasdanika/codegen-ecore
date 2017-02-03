/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.codegen.ecore.Attribute;
import org.nasdanika.codegen.ecore.ConfigurationEntry;
import org.nasdanika.codegen.ecore.EPackageSource;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.Member;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.Operation;
import org.nasdanika.codegen.ecore.Parameter;
import org.nasdanika.codegen.ecore.Reference;
import org.nasdanika.codegen.ecore.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreCodeGeneratorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageSourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEntryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreCodeGeneratorConfigurationEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.codegen.ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreCodeGenerator() {
		return ecoreCodeGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreCodeGenerator_PackageSources() {
		return (EReference)ecoreCodeGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcoreCodeGenerator_Packages() {
		return (EReference)ecoreCodeGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreCodeGenerator_GenerationTargets() {
		return (EAttribute)ecoreCodeGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreCodeGenerator__GetEPackages() {
		return ecoreCodeGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreCodeGenerator__IsSelected__EModelElement() {
		return ecoreCodeGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreCodeGenerator__GetConfiguration__EModelElement() {
		return ecoreCodeGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEcoreCodeGenerator__GetConfiguration__String() {
		return ecoreCodeGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackageSource() {
		return ePackageSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackageSource_Location() {
		return (EAttribute)ePackageSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackageSource_NsURIs() {
		return (EAttribute)ePackageSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEPackageSource__GetEPackages__ResourceSet() {
		return ePackageSourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Selected() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Configuration() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_LastGenerationTargets() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElement__Find__EModelElement_boolean() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_NsURI() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Classes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Members() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_TypeName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_TypeNsURI() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Many() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationEntry() {
		return configurationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationEntry_Id() {
		return (EAttribute)configurationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationEntry_Name() {
		return (EAttribute)configurationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationEntry_Configuration() {
		return (EReference)configurationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreCodeGeneratorConfiguration() {
		return ecoreCodeGeneratorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreCodeGeneratorConfiguration_TargetProject() {
		return (EAttribute)ecoreCodeGeneratorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreCodeGeneratorConfiguration_SourceFolder() {
		return (EAttribute)ecoreCodeGeneratorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreCodeGeneratorConfiguration_BasePackage() {
		return (EAttribute)ecoreCodeGeneratorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEcoreCodeGeneratorConfiguration_Description() {
		return (EAttribute)ecoreCodeGeneratorConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__SELECTED);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONFIGURATION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__LAST_GENERATION_TARGETS);
		createEOperation(modelElementEClass, MODEL_ELEMENT___FIND__EMODELELEMENT_BOOLEAN);

		ecoreCodeGeneratorEClass = createEClass(ECORE_CODE_GENERATOR);
		createEReference(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR__PACKAGE_SOURCES);
		createEReference(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR__PACKAGES);
		createEAttribute(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR__GENERATION_TARGETS);
		createEOperation(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR___GET_EPACKAGES);
		createEOperation(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR___IS_SELECTED__EMODELELEMENT);
		createEOperation(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR___GET_CONFIGURATION__EMODELELEMENT);
		createEOperation(ecoreCodeGeneratorEClass, ECORE_CODE_GENERATOR___GET_CONFIGURATION__STRING);

		ePackageSourceEClass = createEClass(EPACKAGE_SOURCE);
		createEAttribute(ePackageSourceEClass, EPACKAGE_SOURCE__LOCATION);
		createEAttribute(ePackageSourceEClass, EPACKAGE_SOURCE__NS_UR_IS);
		createEOperation(ePackageSourceEClass, EPACKAGE_SOURCE___GET_EPACKAGES__RESOURCESET);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NS_URI);
		createEReference(packageEClass, PACKAGE__CLASSES);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__MEMBERS);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);

		referenceEClass = createEClass(REFERENCE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE_NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE_NS_URI);
		createEAttribute(parameterEClass, PARAMETER__MANY);

		memberEClass = createEClass(MEMBER);

		configurationEntryEClass = createEClass(CONFIGURATION_ENTRY);
		createEAttribute(configurationEntryEClass, CONFIGURATION_ENTRY__ID);
		createEAttribute(configurationEntryEClass, CONFIGURATION_ENTRY__NAME);
		createEReference(configurationEntryEClass, CONFIGURATION_ENTRY__CONFIGURATION);

		ecoreCodeGeneratorConfigurationEClass = createEClass(ECORE_CODE_GENERATOR_CONFIGURATION);
		createEAttribute(ecoreCodeGeneratorConfigurationEClass, ECORE_CODE_GENERATOR_CONFIGURATION__TARGET_PROJECT);
		createEAttribute(ecoreCodeGeneratorConfigurationEClass, ECORE_CODE_GENERATOR_CONFIGURATION__SOURCE_FOLDER);
		createEAttribute(ecoreCodeGeneratorConfigurationEClass, ECORE_CODE_GENERATOR_CONFIGURATION__BASE_PACKAGE);
		createEAttribute(ecoreCodeGeneratorConfigurationEClass, ECORE_CODE_GENERATOR_CONFIGURATION__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.eclipse.emf.ecore.EcorePackage theEcorePackage_1 = (org.eclipse.emf.ecore.EcorePackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.emf.ecore.EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecoreCodeGeneratorEClass.getESuperTypes().add(this.getModelElement());
		packageEClass.getESuperTypes().add(this.getModelElement());
		classEClass.getESuperTypes().add(this.getModelElement());
		structuralFeatureEClass.getESuperTypes().add(this.getMember());
		attributeEClass.getESuperTypes().add(this.getStructuralFeature());
		referenceEClass.getESuperTypes().add(this.getStructuralFeature());
		operationEClass.getESuperTypes().add(this.getMember());
		parameterEClass.getESuperTypes().add(this.getModelElement());
		memberEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Selected(), theEcorePackage_1.getEBoolean(), "selected", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), theEcorePackage_1.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Configuration(), this.getConfigurationEntry(), null, "configuration", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_LastGenerationTargets(), theEcorePackage_1.getEString(), "lastGenerationTargets", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModelElement__Find__EModelElement_boolean(), this.getModelElement(), "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEModelElement(), "eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEBoolean(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ecoreCodeGeneratorEClass, EcoreCodeGenerator.class, "EcoreCodeGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcoreCodeGenerator_PackageSources(), this.getEPackageSource(), null, "packageSources", null, 0, -1, EcoreCodeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcoreCodeGenerator_Packages(), this.getPackage(), null, "packages", null, 0, -1, EcoreCodeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreCodeGenerator_GenerationTargets(), theEcorePackage_1.getEString(), "generationTargets", null, 1, -1, EcoreCodeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEcoreCodeGenerator__GetEPackages(), theEcorePackage_1.getEPackage(), "getEPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreCodeGenerator__IsSelected__EModelElement(), theEcorePackage_1.getEBoolean(), "isSelected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEModelElement(), "eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcoreCodeGenerator__GetConfiguration__EModelElement(), null, "getConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEModelElement(), "eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage_1.getEMap());
		EGenericType g2 = createEGenericType(theEcorePackage_1.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage_1.getEObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEcoreCodeGenerator__GetConfiguration__String(), theEcorePackage_1.getEObject(), "getConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ePackageSourceEClass, EPackageSource.class, "EPackageSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackageSource_Location(), theEcorePackage_1.getEString(), "location", null, 0, 1, EPackageSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackageSource_NsURIs(), ecorePackage.getEString(), "NsURIs", null, 0, -1, EPackageSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEPackageSource__GetEPackages__ResourceSet(), theEcorePackage_1.getEPackage(), "getEPackages", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEResourceSet(), "resourceSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.codegen.ecore.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_NsURI(), theEcorePackage_1.getEString(), "nsURI", null, 0, 1, org.nasdanika.codegen.ecore.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Classes(), this.getClass_(), null, "classes", null, 0, -1, org.nasdanika.codegen.ecore.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.nasdanika.codegen.ecore.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Members(), this.getMember(), null, "members", null, 0, -1, org.nasdanika.codegen.ecore.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_TypeName(), theEcorePackage_1.getEString(), "typeName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_TypeNsURI(), theEcorePackage_1.getEString(), "typeNsURI", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Many(), theEcorePackage_1.getEBoolean(), "many", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationEntryEClass, ConfigurationEntry.class, "ConfigurationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationEntry_Id(), theEcorePackage_1.getEString(), "id", null, 0, 1, ConfigurationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationEntry_Name(), theEcorePackage_1.getEString(), "name", null, 0, 1, ConfigurationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationEntry_Configuration(), theEcorePackage_1.getEObject(), null, "configuration", null, 0, 1, ConfigurationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoreCodeGeneratorConfigurationEClass, EcoreCodeGeneratorConfiguration.class, "EcoreCodeGeneratorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcoreCodeGeneratorConfiguration_TargetProject(), theEcorePackage_1.getEString(), "targetProject", null, 0, 1, EcoreCodeGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreCodeGeneratorConfiguration_SourceFolder(), theEcorePackage_1.getEString(), "sourceFolder", null, 0, 1, EcoreCodeGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreCodeGeneratorConfiguration_BasePackage(), theEcorePackage_1.getEString(), "basePackage", null, 0, 1, EcoreCodeGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcoreCodeGeneratorConfiguration_Description(), theEcorePackage_1.getEString(), "description", null, 0, 1, EcoreCodeGeneratorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (modelElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for ecore generator model elements."
		   });	
		addAnnotation
		  (getModelElement__Find__EModelElement_boolean(), 
		   source, 
		   new String[] {
			 "documentation", "Finds a model element corresponding to the passed EModelElement. Creates a new model element if necessary."
		   });	
		addAnnotation
		  ((getModelElement__Find__EModelElement_boolean()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "EModel element to find a corresponding ecore generator model element for."
		   });	
		addAnnotation
		  ((getModelElement__Find__EModelElement_boolean()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "If true, an element gets created if it is not found."
		   });	
		addAnnotation
		  (getModelElement_Selected(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether this element is supported by the ecore generator model. True indicates that this element and all its children are part of the model. "
		   });	
		addAnnotation
		  (getModelElement_Description(), 
		   source, 
		   new String[] {
			 "documentation", "Model element description, e.g. explanation of supported configuration properties."
		   });	
		addAnnotation
		  (getModelElement_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Model element name.\r\n"
		   });	
		addAnnotation
		  (getModelElement_Configuration(), 
		   source, 
		   new String[] {
			 "documentation", "Model element may contain zero or more generatort configurations. "
		   });	
		addAnnotation
		  (getModelElement_LastGenerationTargets(), 
		   source, 
		   new String[] {
			 "documentation", "Generation targets selected for this element last time."
		   });	
		addAnnotation
		  (ecoreCodeGeneratorEClass, 
		   source, 
		   new String[] {
			 "documentation", "The root of the ecore generator model."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator__GetEPackages(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a list of EPackage\'s referenced by the model."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator__IsSelected__EModelElement(), 
		   source, 
		   new String[] {
			 "documentation", "Returns true if given EModelElement or one of its containers or children or EcoreCodeGenrator is selected.\r\nIn essence, this method returns true if a given element shall participate in code generation, perhaps not fully (some of its children)."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator__GetConfiguration__EModelElement(), 
		   source, 
		   new String[] {
			 "documentation", "Returns configuration for a given EModelElement. Empty collection if element\r\nis selected by there is no configuration. ``null`` if not selected.\r\n\r\nReturn value is a Map with configuration ID\'s as keys and configuration EObject\'s as values."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator__GetConfiguration__String(), 
		   source, 
		   new String[] {
			 "documentation", "Returns this generator configuration for a given key."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator_PackageSources(), 
		   source, 
		   new String[] {
			 "documentation", "Ecore generator contains one or more package sources providing EPackage\'s."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator_Packages(), 
		   source, 
		   new String[] {
			 "documentation", "Ecore generator contains packages referencing EPackages."
		   });	
		addAnnotation
		  (getEcoreCodeGenerator_GenerationTargets(), 
		   source, 
		   new String[] {
			 "documentation", "Generation targets used by this model."
		   });	
		addAnnotation
		  (ePackageSourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "EPackage source defines where to load EPackages from and which packages to load (NsURI\'s)."
		   });	
		addAnnotation
		  (getEPackageSource__GetEPackages__ResourceSet(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a list of referenced EPackage\'s."
		   });	
		addAnnotation
		  ((getEPackageSource__GetEPackages__ResourceSet()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Resource set to load models to."
		   });	
		addAnnotation
		  (getEPackageSource_Location(), 
		   source, 
		   new String[] {
			 "documentation", "URL of the source ECore model. If null or empty then the global registry is used as package source.\r\n"
		   });	
		addAnnotation
		  (getEPackageSource_NsURIs(), 
		   source, 
		   new String[] {
			 "documentation", "NsURIs of EPackages to load."
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "documentation", "Package is an EPackage counterpart in the ecore generator model."
		   });	
		addAnnotation
		  (getPackage_NsURI(), 
		   source, 
		   new String[] {
			 "documentation", "EPackage namespace URI used by resolve()."
		   });	
		addAnnotation
		  (getPackage_Classes(), 
		   source, 
		   new String[] {
			 "documentation", "Package contains classes. Data types and enums are not supported by the ecore generator model - they are included by reference."
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "documentation", "Corresponds to EClass."
		   });	
		addAnnotation
		  (structuralFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for attributes and referenced. Corresponds to EStructuralFeature."
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Corresponds to EAttribute."
		   });	
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Corresponds to EReference."
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Corresponds to EOperation."
		   });	
		addAnnotation
		  (memberEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for class members."
		   });	
		addAnnotation
		  (configurationEntryEClass, 
		   source, 
		   new String[] {
			 "documentation", "For each generator configuration a tab is displayed in the generator editor. Generation targets may share configurations."
		   });
	}

} //EcorePackageImpl
