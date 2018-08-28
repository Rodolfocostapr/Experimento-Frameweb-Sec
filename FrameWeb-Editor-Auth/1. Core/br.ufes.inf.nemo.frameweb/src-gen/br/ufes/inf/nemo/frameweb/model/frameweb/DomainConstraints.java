/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getCollection <em>Collection</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getFetch <em>Fetch</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getOrder <em>Order</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getCascade <em>Cascade</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainConstraints()
 * @model
 * @generated
 */
public interface DomainConstraints extends Constraint {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Collection
	 * @see #setCollection(Collection)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainConstraints_Collection()
	 * @model
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Collection
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.Fetch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Fetch
	 * @see #setFetch(Fetch)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainConstraints_Fetch()
	 * @model
	 * @generated
	 */
	Fetch getFetch();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Fetch
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(Fetch value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Order
	 * @see #setOrder(Order)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainConstraints_Order()
	 * @model
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.model.frameweb.Cascade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Cascade
	 * @see #setCascade(Cascade)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDomainConstraints_Cascade()
	 * @model
	 * @generated
	 */
	Cascade getCascade();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DomainConstraints#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.Cascade
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(Cascade value);

} // DomainConstraints
