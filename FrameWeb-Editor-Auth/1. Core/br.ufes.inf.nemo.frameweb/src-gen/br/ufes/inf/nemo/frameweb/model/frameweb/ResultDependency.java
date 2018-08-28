/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency#getResultDependencyConstraint <em>Result Dependency Constraint</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultDependency()
 * @model
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Result Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Method</em>' reference.
	 * @see #setResultMethod(FrontControllerMethod)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultDependency_ResultMethod()
	 * @model
	 * @generated
	 */
	FrontControllerMethod getResultMethod();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency#getResultMethod <em>Result Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Method</em>' reference.
	 * @see #getResultMethod()
	 * @generated
	 */
	void setResultMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Result Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Dependency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Dependency Constraint</em>' containment reference.
	 * @see #setResultDependencyConstraint(ResultConstraint)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getResultDependency_ResultDependencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ResultConstraint getResultDependencyConstraint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency#getResultDependencyConstraint <em>Result Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Dependency Constraint</em>' containment reference.
	 * @see #getResultDependencyConstraint()
	 * @generated
	 */
	void setResultDependencyConstraint(ResultConstraint value);

} // ResultDependency
