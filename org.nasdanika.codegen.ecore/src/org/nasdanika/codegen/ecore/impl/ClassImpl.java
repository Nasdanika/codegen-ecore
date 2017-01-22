/**
 */
package org.nasdanika.codegen.ecore.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.codegen.ecore.Attribute;
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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.impl.ClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ModelElementImpl implements org.nasdanika.codegen.ecore.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eGet(EcorePackage.Literals.CLASS__MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelElement find(EModelElement eModelElement, boolean create) {
		if (eModelElement instanceof EStructuralFeature) {
			for (Member m: getMembers()) {
				if (m instanceof StructuralFeature && m.getName().equals(((EStructuralFeature) eModelElement).getName())) {
					return m;
				}
			}
			if (!create) {
				return null;				
			}
			
			if (eModelElement instanceof EReference) {
				Reference ref = EcoreFactory.eINSTANCE.createReference();
				ref.setName(((EReference) eModelElement).getName());
				getMembers().add(ref);
				return ref;
			}
			if (eModelElement instanceof EAttribute) {
				Attribute attr = EcoreFactory.eINSTANCE.createAttribute();
				attr.setName(((EAttribute) eModelElement).getName());
				getMembers().add(attr);
				return attr;
			}
			throw new IllegalArgumentException("EStructuralFeature is neither EReference nor EAttribute, how can it be: "+eModelElement);
		}
		
		if (eModelElement instanceof EOperation) {
			EOperation eOperation = (EOperation) eModelElement;
			M: for (Member m: getMembers()) {
				if (m instanceof Operation 
						&& m.getName().equals(eOperation.getName()) 
						&& ((Operation) m).getParameters().size() == eOperation.getEParameters().size()) { 
					
					for (int i=0; i < eOperation.getEParameters().size(); ++i) {
						EParameter ep = eOperation.getEParameters().get(i);
						Parameter p = ((Operation) m).getParameters().get(i);
						if (!ep.getEType().getEPackage().getNsURI().equals(p.getTypeNsURI())) {
							continue M;
						}
						if (!ep.getEType().getName().equals(p.getTypeName())) {
							continue M;
						}
						if (ep.isMany() != p.isMany()) {
							continue M;
						}
					}
					
					return m;
				}
			}
			
			if (!create) {
				return null;
			}
			
			Operation op = EcoreFactory.eINSTANCE.createOperation();
			op.setName(eOperation.getName());
			for (EParameter ep: eOperation.getEParameters()) {
				Parameter p = EcoreFactory.eINSTANCE.createParameter();
				p.setTypeNsURI(ep.getEType().getEPackage().getNsURI());
				p.setTypeName(ep.getEType().getName());
				p.setMany(ep.isMany());
			}
			getMembers().add(op);
			return op;
		}
		
		if (eModelElement instanceof EParameter) {			
			EOperation eOp = (EOperation) eModelElement.eContainer();
			Operation op = (Operation) find(eOp, create);
			return op == null ? null : op.getParameters().get(eOp.getEParameters().indexOf(eModelElement));
		}
		
		return null;
	}

} //ClassImpl
