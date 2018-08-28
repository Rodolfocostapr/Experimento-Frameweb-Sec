/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI#getIri <em>Iri</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI#getIriVersion <em>Iri Version</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getIRI()
 * @model extendedMetaData="name='IRI'"
 * @generated
 */
public interface IRI extends Property {
	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getIRI_Iri()
	 * @model required="true"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Iri Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iri Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri Version</em>' attribute.
	 * @see #setIriVersion(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getIRI_IriVersion()
	 * @model
	 * @generated
	 */
	String getIriVersion();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.IRI#getIriVersion <em>Iri Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri Version</em>' attribute.
	 * @see #getIriVersion()
	 * @generated
	 */
	void setIriVersion(String value);

} // IRI
