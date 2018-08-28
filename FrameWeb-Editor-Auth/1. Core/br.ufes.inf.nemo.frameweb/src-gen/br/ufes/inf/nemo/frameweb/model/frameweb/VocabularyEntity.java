/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity#getEntityIRI <em>Entity IRI</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabularyEntity()
 * @model abstract="true"
 * @generated
 */
public interface VocabularyEntity extends Classifier {
	/**
	 * Returns the value of the '<em><b>Entity IRI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity IRI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity IRI</em>' reference.
	 * @see #setEntityIRI(IRI)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabularyEntity_EntityIRI()
	 * @model required="true"
	 * @generated
	 */
	IRI getEntityIRI();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyEntity#getEntityIRI <em>Entity IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity IRI</em>' reference.
	 * @see #getEntityIRI()
	 * @generated
	 */
	void setEntityIRI(IRI value);

} // VocabularyEntity
