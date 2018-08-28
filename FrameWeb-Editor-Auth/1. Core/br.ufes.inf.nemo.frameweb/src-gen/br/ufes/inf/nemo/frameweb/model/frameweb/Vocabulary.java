/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getVocabularyIRI <em>Vocabulary IRI</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getVocabularyDocument <em>Vocabulary Document</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary()
 * @model
 * @generated
 */
public interface Vocabulary extends org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Directly Imports Documents</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directly Imports Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directly Imports Documents</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary_DirectlyImportsDocuments()
	 * @model containment="true"
	 * @generated
	 */
	EList<IRI> getDirectlyImportsDocuments();

	/**
	 * Returns the value of the '<em><b>Vocabulary IRI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabulary IRI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary IRI</em>' reference.
	 * @see #setVocabularyIRI(IRI)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary_VocabularyIRI()
	 * @model required="true"
	 * @generated
	 */
	IRI getVocabularyIRI();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getVocabularyIRI <em>Vocabulary IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary IRI</em>' reference.
	 * @see #getVocabularyIRI()
	 * @generated
	 */
	void setVocabularyIRI(IRI value);

	/**
	 * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.Axiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axioms</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary_Axioms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Axiom> getAxioms();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.model.frameweb.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Vocabulary Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabulary Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary Document</em>' attribute.
	 * @see #setVocabularyDocument(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabulary_VocabularyDocument()
	 * @model
	 * @generated
	 */
	String getVocabularyDocument();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.Vocabulary#getVocabularyDocument <em>Vocabulary Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary Document</em>' attribute.
	 * @see #getVocabularyDocument()
	 * @generated
	 */
	void setVocabularyDocument(String value);

} // Vocabulary
