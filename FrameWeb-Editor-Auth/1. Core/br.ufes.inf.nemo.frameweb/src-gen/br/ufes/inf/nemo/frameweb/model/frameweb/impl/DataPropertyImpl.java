/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DataProperty;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyAssociation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getNavigableOwnedEnds <em>Navigable Owned End</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DataPropertyImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyImpl extends VocabularyEntityImpl implements DataProperty {
	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnds;

	/**
	 * The cached value of the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnds;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnds() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnds;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElements() {
		// TODO: implement this method to return the 'Related Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndTypes() {
		// TODO: implement this method to return the 'End Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DATA_PROPERTY__IS_DERIVED,
					oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnds() {
		if (memberEnds == null) {
			memberEnds = new EObjectWithInverseResolvingEList<Property>(Property.class, this,
					FramewebPackage.DATA_PROPERTY__MEMBER_END, UMLPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = new EObjectContainmentWithInverseEList.Resolving<Property>(Property.class, this,
					FramewebPackage.DATA_PROPERTY__OWNED_END, UMLPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnds() {
		if (navigableOwnedEnds == null) {
			navigableOwnedEnds = new EObjectResolvingEList<Property>(Property.class, this,
					FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DATA_PROPERTY__PREFIX, oldPrefix,
					prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__SPECIALIZED_END_NUMBER,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "validateSpecializedEndNumber",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndTypes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__SPECIALIZED_END_TYPES,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "validateSpecializedEndTypes",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__BINARY_ASSOCIATIONS,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "validateBinaryAssociations",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnds(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__ASSOCIATION_ENDS,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "validateAssociationEnds",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsMustBeTyped(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__ENDS_MUST_BE_TYPED,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "validateEndsMustBeTyped",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBinary() {
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
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMemberEnds()).basicAdd(otherEnd, msgs);
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedEnds()).basicAdd(otherEnd, msgs);
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
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			return ((InternalEList<?>) getMemberEnds()).basicRemove(otherEnd, msgs);
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			return ((InternalEList<?>) getOwnedEnds()).basicRemove(otherEnd, msgs);
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
		case FramewebPackage.DATA_PROPERTY__RELATED_ELEMENT:
			return getRelatedElements();
		case FramewebPackage.DATA_PROPERTY__END_TYPE:
			return getEndTypes();
		case FramewebPackage.DATA_PROPERTY__IS_DERIVED:
			return isDerived();
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			return getMemberEnds();
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			return getOwnedEnds();
		case FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END:
			return getNavigableOwnedEnds();
		case FramewebPackage.DATA_PROPERTY__PREFIX:
			return getPrefix();
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
		case FramewebPackage.DATA_PROPERTY__IS_DERIVED:
			setIsDerived((Boolean) newValue);
			return;
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			getMemberEnds().clear();
			getMemberEnds().addAll((Collection<? extends Property>) newValue);
			return;
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			getOwnedEnds().clear();
			getOwnedEnds().addAll((Collection<? extends Property>) newValue);
			return;
		case FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END:
			getNavigableOwnedEnds().clear();
			getNavigableOwnedEnds().addAll((Collection<? extends Property>) newValue);
			return;
		case FramewebPackage.DATA_PROPERTY__PREFIX:
			setPrefix((String) newValue);
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
		case FramewebPackage.DATA_PROPERTY__IS_DERIVED:
			setIsDerived(IS_DERIVED_EDEFAULT);
			return;
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			getMemberEnds().clear();
			return;
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			getOwnedEnds().clear();
			return;
		case FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END:
			getNavigableOwnedEnds().clear();
			return;
		case FramewebPackage.DATA_PROPERTY__PREFIX:
			setPrefix(PREFIX_EDEFAULT);
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
		case FramewebPackage.DATA_PROPERTY__RELATED_ELEMENT:
			return !getRelatedElements().isEmpty();
		case FramewebPackage.DATA_PROPERTY__END_TYPE:
			return !getEndTypes().isEmpty();
		case FramewebPackage.DATA_PROPERTY__IS_DERIVED:
			return isDerived != IS_DERIVED_EDEFAULT;
		case FramewebPackage.DATA_PROPERTY__MEMBER_END:
			return memberEnds != null && !memberEnds.isEmpty();
		case FramewebPackage.DATA_PROPERTY__OWNED_END:
			return ownedEnds != null && !ownedEnds.isEmpty();
		case FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END:
			return navigableOwnedEnds != null && !navigableOwnedEnds.isEmpty();
		case FramewebPackage.DATA_PROPERTY__PREFIX:
			return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
			case FramewebPackage.DATA_PROPERTY__RELATED_ELEMENT:
				return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
			case FramewebPackage.DATA_PROPERTY__END_TYPE:
				return UMLPackage.ASSOCIATION__END_TYPE;
			case FramewebPackage.DATA_PROPERTY__IS_DERIVED:
				return UMLPackage.ASSOCIATION__IS_DERIVED;
			case FramewebPackage.DATA_PROPERTY__MEMBER_END:
				return UMLPackage.ASSOCIATION__MEMBER_END;
			case FramewebPackage.DATA_PROPERTY__OWNED_END:
				return UMLPackage.ASSOCIATION__OWNED_END;
			case FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END:
				return UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
			default:
				return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (derivedFeatureID) {
			case FramewebPackage.DATA_PROPERTY__PREFIX:
				return FramewebPackage.VOCABULARY_ASSOCIATION__PREFIX;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT:
				return FramewebPackage.DATA_PROPERTY__RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
			case UMLPackage.ASSOCIATION__END_TYPE:
				return FramewebPackage.DATA_PROPERTY__END_TYPE;
			case UMLPackage.ASSOCIATION__IS_DERIVED:
				return FramewebPackage.DATA_PROPERTY__IS_DERIVED;
			case UMLPackage.ASSOCIATION__MEMBER_END:
				return FramewebPackage.DATA_PROPERTY__MEMBER_END;
			case UMLPackage.ASSOCIATION__OWNED_END:
				return FramewebPackage.DATA_PROPERTY__OWNED_END;
			case UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return FramewebPackage.DATA_PROPERTY__NAVIGABLE_OWNED_END;
			default:
				return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (baseFeatureID) {
			case FramewebPackage.VOCABULARY_ASSOCIATION__PREFIX:
				return FramewebPackage.DATA_PROPERTY__PREFIX;
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
		if (baseClass == Relationship.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseOperationID) {
			case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP:
				return FramewebPackage.DATA_PROPERTY___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP:
				return FramewebPackage.DATA_PROPERTY___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.ASSOCIATION___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return FramewebPackage.DATA_PROPERTY___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.ASSOCIATION___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP:
				return FramewebPackage.DATA_PROPERTY___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.ASSOCIATION___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP:
				return FramewebPackage.DATA_PROPERTY___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.ASSOCIATION___IS_BINARY:
				return FramewebPackage.DATA_PROPERTY___IS_BINARY;
			case UMLPackage.ASSOCIATION___GET_END_TYPES:
				return FramewebPackage.DATA_PROPERTY___GET_END_TYPES;
			default:
				return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (baseOperationID) {
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
		case FramewebPackage.DATA_PROPERTY___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP:
			return validateSpecializedEndNumber((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case FramewebPackage.DATA_PROPERTY___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP:
			return validateSpecializedEndTypes((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case FramewebPackage.DATA_PROPERTY___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
			return validateBinaryAssociations((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case FramewebPackage.DATA_PROPERTY___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP:
			return validateAssociationEnds((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case FramewebPackage.DATA_PROPERTY___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP:
			return validateEndsMustBeTyped((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case FramewebPackage.DATA_PROPERTY___IS_BINARY:
			return isBinary();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

	@Override
	public Type getEndType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getEndType(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getMemberEnd(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getMemberEnd(String name, Type type, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createNavigableOwnedEnd(String name, Type type, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createNavigableOwnedEnd(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getNavigableOwnedEnd(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getNavigableOwnedEnd(String name, Type type, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedEnd(String name, Type type, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedEnd(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedEnd(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedEnd(String name, Type type, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

} //DataPropertyImpl
