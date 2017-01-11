/**
 */
package org.nasdanika.codegen.ecore;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EPackage source defines where to load EPackages from and which packages to load (NsURI's).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.EPackageSource#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.EPackageSource#getNsURIs <em>Ns UR Is</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.EcorePackage#getEPackageSource()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EPackageSource extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the source ECore model. If null or empty then the global registry is used as package source.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEPackageSource_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.EPackageSource#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Ns UR Is</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NsURIs of EPackages to load.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns UR Is</em>' attribute list.
	 * @see org.nasdanika.codegen.ecore.EcorePackage#getEPackageSource_NsURIs()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getNsURIs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of referenced EPackage's.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EPackage> getEPackages();

} // EPackageSource
