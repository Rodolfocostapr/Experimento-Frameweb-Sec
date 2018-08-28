/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.Annotation;
import br.ufes.inf.nemo.frameweb.model.frameweb.Axiom;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.IRI;
import br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyImpl#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyImpl#getVocabularyIRI <em>Vocabulary IRI</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyImpl#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.VocabularyImpl#getVocabularyDocument <em>Vocabulary Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocabularyImpl extends PackageImpl implements Vocabulary {
	/**
	 * The cached value of the '{@link #getDirectlyImportsDocuments() <em>Directly Imports Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectlyImportsDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<IRI> directlyImportsDocuments;

	/**
	 * The cached value of the '{@link #getVocabularyIRI() <em>Vocabulary IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyIRI()
	 * @generated
	 * @ordered
	 */
	protected IRI vocabularyIRI;

	/**
	 * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<Axiom> axioms;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The default value of the '{@link #getVocabularyDocument() <em>Vocabulary Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCABULARY_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabularyDocument() <em>Vocabulary Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyDocument()
	 * @generated
	 * @ordered
	 */
	protected String vocabularyDocument = VOCABULARY_DOCUMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VOCABULARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRI> getDirectlyImportsDocuments() {
		if (directlyImportsDocuments == null) {
			directlyImportsDocuments = new EObjectContainmentEList<IRI>(IRI.class, this,
					FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS);
		}
		return directlyImportsDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI getVocabularyIRI() {
		if (vocabularyIRI != null && vocabularyIRI.eIsProxy()) {
			InternalEObject oldVocabularyIRI = (InternalEObject) vocabularyIRI;
			vocabularyIRI = (IRI) eResolveProxy(oldVocabularyIRI);
			if (vocabularyIRI != oldVocabularyIRI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.VOCABULARY__VOCABULARY_IRI, oldVocabularyIRI, vocabularyIRI));
			}
		}
		return vocabularyIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI basicGetVocabularyIRI() {
		return vocabularyIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVocabularyIRI(IRI newVocabularyIRI) {
		IRI oldVocabularyIRI = vocabularyIRI;
		vocabularyIRI = newVocabularyIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY__VOCABULARY_IRI,
					oldVocabularyIRI, vocabularyIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Axiom> getAxioms() {
		if (axioms == null) {
			axioms = new EObjectContainmentEList<Axiom>(Axiom.class, this, FramewebPackage.VOCABULARY__AXIOMS);
		}
		return axioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					FramewebPackage.VOCABULARY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVocabularyDocument() {
		return vocabularyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVocabularyDocument(String newVocabularyDocument) {
		String oldVocabularyDocument = vocabularyDocument;
		vocabularyDocument = newVocabularyDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY__VOCABULARY_DOCUMENT,
					oldVocabularyDocument, vocabularyDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS:
			return ((InternalEList<?>) getDirectlyImportsDocuments()).basicRemove(otherEnd, msgs);
		case FramewebPackage.VOCABULARY__AXIOMS:
			return ((InternalEList<?>) getAxioms()).basicRemove(otherEnd, msgs);
		case FramewebPackage.VOCABULARY__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
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
		case FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS:
			return getDirectlyImportsDocuments();
		case FramewebPackage.VOCABULARY__VOCABULARY_IRI:
			if (resolve)
				return getVocabularyIRI();
			return basicGetVocabularyIRI();
		case FramewebPackage.VOCABULARY__AXIOMS:
			return getAxioms();
		case FramewebPackage.VOCABULARY__ANNOTATIONS:
			return getAnnotations();
		case FramewebPackage.VOCABULARY__VOCABULARY_DOCUMENT:
			return getVocabularyDocument();
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
		case FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS:
			getDirectlyImportsDocuments().clear();
			getDirectlyImportsDocuments().addAll((Collection<? extends IRI>) newValue);
			return;
		case FramewebPackage.VOCABULARY__VOCABULARY_IRI:
			setVocabularyIRI((IRI) newValue);
			return;
		case FramewebPackage.VOCABULARY__AXIOMS:
			getAxioms().clear();
			getAxioms().addAll((Collection<? extends Axiom>) newValue);
			return;
		case FramewebPackage.VOCABULARY__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case FramewebPackage.VOCABULARY__VOCABULARY_DOCUMENT:
			setVocabularyDocument((String) newValue);
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
		case FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS:
			getDirectlyImportsDocuments().clear();
			return;
		case FramewebPackage.VOCABULARY__VOCABULARY_IRI:
			setVocabularyIRI((IRI) null);
			return;
		case FramewebPackage.VOCABULARY__AXIOMS:
			getAxioms().clear();
			return;
		case FramewebPackage.VOCABULARY__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case FramewebPackage.VOCABULARY__VOCABULARY_DOCUMENT:
			setVocabularyDocument(VOCABULARY_DOCUMENT_EDEFAULT);
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
		case FramewebPackage.VOCABULARY__DIRECTLY_IMPORTS_DOCUMENTS:
			return directlyImportsDocuments != null && !directlyImportsDocuments.isEmpty();
		case FramewebPackage.VOCABULARY__VOCABULARY_IRI:
			return vocabularyIRI != null;
		case FramewebPackage.VOCABULARY__AXIOMS:
			return axioms != null && !axioms.isEmpty();
		case FramewebPackage.VOCABULARY__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case FramewebPackage.VOCABULARY__VOCABULARY_DOCUMENT:
			return VOCABULARY_DOCUMENT_EDEFAULT == null ? vocabularyDocument != null
					: !VOCABULARY_DOCUMENT_EDEFAULT.equals(vocabularyDocument);
		}
		return super.eIsSet(featureID);
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
		result.append(" (vocabularyDocument: ");
		result.append(vocabularyDocument);
		result.append(')');
		return result.toString();
	}

} //VocabularyImpl
