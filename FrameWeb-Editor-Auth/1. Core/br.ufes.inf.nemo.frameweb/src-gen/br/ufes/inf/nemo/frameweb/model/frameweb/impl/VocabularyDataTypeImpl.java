/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyDataType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyDataTypeImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyDataTypeImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabularyDataTypeImpl extends VocabularyEntityImpl implements VocabularyDataType {
	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttributes;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VOCABULARY_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentWithInverseEList.Resolving<Property>(Property.class, this,
					FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE, UMLPackage.PROPERTY__DATATYPE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList.Resolving<Operation>(Operation.class, this,
					FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION, UMLPackage.OPERATION__DATATYPE);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttributes()).basicAdd(otherEnd, msgs);
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			return ((InternalEList<?>) getOwnedAttributes()).basicRemove(otherEnd, msgs);
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			return ((InternalEList<?>) getOwnedOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			return getOwnedAttributes();
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			return getOwnedOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			getOwnedAttributes().clear();
			getOwnedAttributes().addAll((Collection<? extends Property>) newValue);
			return;
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			getOwnedOperations().clear();
			getOwnedOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			getOwnedAttributes().clear();
			return;
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			getOwnedOperations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
			return ownedAttributes != null && !ownedAttributes.isEmpty();
		case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
			return ownedOperations != null && !ownedOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
			case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE:
				return UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE;
			case FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION:
				return UMLPackage.DATA_TYPE__OWNED_OPERATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_ATTRIBUTE;
			case UMLPackage.DATA_TYPE__OWNED_OPERATION:
				return FramewebPackage.VOCABULARY_DATA_TYPE__OWNED_OPERATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseOperationID) {
			case UMLPackage.DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
				return FramewebPackage.VOCABULARY_DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;
			case UMLPackage.DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
				return FramewebPackage.VOCABULARY_DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FramewebPackage.VOCABULARY_DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
			return createOwnedAttribute((String) arguments.get(0), (Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
		case FramewebPackage.VOCABULARY_DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
			return createOwnedOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation createOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

} //VocabularyDataTypeImpl
