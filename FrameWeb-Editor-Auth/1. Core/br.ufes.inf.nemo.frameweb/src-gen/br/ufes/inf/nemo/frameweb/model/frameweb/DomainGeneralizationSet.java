/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.GeneralizationSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralizationSet#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainGeneralizationSet()
 * @model
 * @generated
 */
public interface DomainGeneralizationSet extends GeneralizationSet {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.InheritanceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.InheritanceMapping
	 * @see #setMapping(InheritanceMapping)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainGeneralizationSet_Mapping()
	 * @model
	 * @generated
	 */
	InheritanceMapping getMapping();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralizationSet#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.InheritanceMapping
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(InheritanceMapping value);

} // DomainGeneralizationSet
