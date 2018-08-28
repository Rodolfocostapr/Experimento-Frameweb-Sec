/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DI Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceTemplate <em>Interface Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceExtension <em>Interface Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getServiceClassInjectionTemplate <em>Service Class Injection Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getDaoClassInjectionTemplate <em>Dao Class Injection Template</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate()
 * @model
 * @generated
 */
public interface DITemplate extends FrameworkProfile {
	/**
	 * Returns the value of the '<em><b>Interface Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Template</em>' attribute.
	 * @see #setInterfaceTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_InterfaceTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getInterfaceTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceTemplate <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Template</em>' attribute.
	 * @see #getInterfaceTemplate()
	 * @generated
	 */
	void setInterfaceTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Interface Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Extension</em>' attribute.
	 * @see #setInterfaceExtension(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_InterfaceExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getInterfaceExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getInterfaceExtension <em>Interface Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Extension</em>' attribute.
	 * @see #getInterfaceExtension()
	 * @generated
	 */
	void setInterfaceExtension(String value);

	/**
	 * Returns the value of the '<em><b>Class Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Extension</em>' attribute.
	 * @see #setClassExtension(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_ClassExtension()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassExtension();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassExtension <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Extension</em>' attribute.
	 * @see #getClassExtension()
	 * @generated
	 */
	void setClassExtension(String value);

	/**
	 * Returns the value of the '<em><b>Class Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Template</em>' attribute.
	 * @see #setClassTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_ClassTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getClassTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getClassTemplate <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Template</em>' attribute.
	 * @see #getClassTemplate()
	 * @generated
	 */
	void setClassTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Service Class Injection Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class Injection Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Injection Template</em>' attribute.
	 * @see #setServiceClassInjectionTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_ServiceClassInjectionTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getServiceClassInjectionTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getServiceClassInjectionTemplate <em>Service Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class Injection Template</em>' attribute.
	 * @see #getServiceClassInjectionTemplate()
	 * @generated
	 */
	void setServiceClassInjectionTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Dao Class Injection Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao Class Injection Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dao Class Injection Template</em>' attribute.
	 * @see #setDaoClassInjectionTemplate(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getDITemplate_DaoClassInjectionTemplate()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getDaoClassInjectionTemplate();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate#getDaoClassInjectionTemplate <em>Dao Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dao Class Injection Template</em>' attribute.
	 * @see #getDaoClassInjectionTemplate()
	 * @generated
	 */
	void setDaoClassInjectionTemplate(String value);

} // DITemplate
