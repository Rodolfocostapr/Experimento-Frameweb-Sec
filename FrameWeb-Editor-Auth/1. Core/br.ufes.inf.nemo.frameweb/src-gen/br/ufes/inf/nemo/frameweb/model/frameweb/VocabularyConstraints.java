/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyConstraints#getSubPropertyOf <em>Sub Property Of</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabularyConstraints()
 * @model
 * @generated
 */
public interface VocabularyConstraints extends Constraint {
	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' attribute.
	 * @see #setSubPropertyOf(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getVocabularyConstraints_SubPropertyOf()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getSubPropertyOf();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.VocabularyConstraints#getSubPropertyOf <em>Sub Property Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Property Of</em>' attribute.
	 * @see #getSubPropertyOf()
	 * @generated
	 */
	void setSubPropertyOf(String value);

} // VocabularyConstraints
