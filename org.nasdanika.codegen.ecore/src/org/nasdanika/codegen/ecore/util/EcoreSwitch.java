/**
 */
package org.nasdanika.codegen.ecore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.codegen.ecore.Attribute;
import org.nasdanika.codegen.ecore.Configuration;
import org.nasdanika.codegen.ecore.EPackageSource;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcorePackage;
import org.nasdanika.codegen.ecore.Member;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.Operation;
import org.nasdanika.codegen.ecore.Parameter;
import org.nasdanika.codegen.ecore.Reference;
import org.nasdanika.codegen.ecore.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.EcorePackage
 * @generated
 */
public class EcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = EcorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcorePackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.ECORE_CODE_GENERATOR: {
				EcoreCodeGenerator ecoreCodeGenerator = (EcoreCodeGenerator)theEObject;
				T result = caseEcoreCodeGenerator(ecoreCodeGenerator);
				if (result == null) result = caseModelElement(ecoreCodeGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.EPACKAGE_SOURCE: {
				EPackageSource ePackageSource = (EPackageSource)theEObject;
				T result = caseEPackageSource(ePackageSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.PACKAGE: {
				org.nasdanika.codegen.ecore.Package package_ = (org.nasdanika.codegen.ecore.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.CLASS: {
				org.nasdanika.codegen.ecore.Class class_ = (org.nasdanika.codegen.ecore.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseModelElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseMember(structuralFeature);
				if (result == null) result = caseModelElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseStructuralFeature(attribute);
				if (result == null) result = caseMember(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseStructuralFeature(reference);
				if (result == null) result = caseMember(reference);
				if (result == null) result = caseModelElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseMember(operation);
				if (result == null) result = caseModelElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseModelElement(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreCodeGenerator(EcoreCodeGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackageSource(EPackageSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.nasdanika.codegen.ecore.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.nasdanika.codegen.ecore.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcoreSwitch
