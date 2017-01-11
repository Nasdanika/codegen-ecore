/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.ecore.Configuration;
import org.nasdanika.codegen.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConfigurationImpl extends CDOObjectImpl implements Configuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CONFIGURATION;
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
	public String getId() {
		return (String)eGet(EcorePackage.Literals.CONFIGURATION__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EcorePackage.Literals.CONFIGURATION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EcorePackage.Literals.CONFIGURATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EcorePackage.Literals.CONFIGURATION__NAME, newName);
	}

} //ConfigurationImpl
