/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration;
import org.nasdanika.codegen.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Generator Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl#getTargetProject <em>Target Project</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl#getSourceFolder <em>Source Folder</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.EcoreCodeGeneratorConfigurationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoreCodeGeneratorConfigurationImpl extends CDOObjectImpl implements EcoreCodeGeneratorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreCodeGeneratorConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetProject() {
		return (String)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__TARGET_PROJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProject(String newTargetProject) {
		eSet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__TARGET_PROJECT, newTargetProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFolder() {
		return (String)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__SOURCE_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFolder(String newSourceFolder) {
		eSet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__SOURCE_FOLDER, newSourceFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return (String)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__BASE_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		eSet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__BASE_PACKAGE, newBasePackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(EcorePackage.Literals.ECORE_CODE_GENERATOR_CONFIGURATION__DESCRIPTION, newDescription);
	}

} //EcoreCodeGeneratorConfigurationImpl
