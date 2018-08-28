/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DI Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getInterfaceTemplate <em>Interface Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getInterfaceExtension <em>Interface Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getServiceClassInjectionTemplate <em>Service Class Injection Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.DITemplateImpl#getDaoClassInjectionTemplate <em>Dao Class Injection Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DITemplateImpl extends FrameworkProfileImpl implements DITemplate {
	/**
	 * The default value of the '{@link #getInterfaceTemplate() <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceTemplate() <em>Interface Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected String interfaceTemplate = INTERFACE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceExtension() <em>Interface Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceExtension() <em>Interface Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceExtension()
	 * @generated
	 * @ordered
	 */
	protected String interfaceExtension = INTERFACE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected String classExtension = CLASS_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String classTemplate = CLASS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceClassInjectionTemplate() <em>Service Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassInjectionTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CLASS_INJECTION_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceClassInjectionTemplate() <em>Service Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassInjectionTemplate()
	 * @generated
	 * @ordered
	 */
	protected String serviceClassInjectionTemplate = SERVICE_CLASS_INJECTION_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaoClassInjectionTemplate() <em>Dao Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoClassInjectionTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String DAO_CLASS_INJECTION_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaoClassInjectionTemplate() <em>Dao Class Injection Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoClassInjectionTemplate()
	 * @generated
	 * @ordered
	 */
	protected String daoClassInjectionTemplate = DAO_CLASS_INJECTION_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DITemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DI_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceTemplate() {
		return interfaceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceTemplate(String newInterfaceTemplate) {
		String oldInterfaceTemplate = interfaceTemplate;
		interfaceTemplate = newInterfaceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE,
					oldInterfaceTemplate, interfaceTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceExtension() {
		return interfaceExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceExtension(String newInterfaceExtension) {
		String oldInterfaceExtension = interfaceExtension;
		interfaceExtension = newInterfaceExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__INTERFACE_EXTENSION,
					oldInterfaceExtension, interfaceExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassExtension() {
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassExtension(String newClassExtension) {
		String oldClassExtension = classExtension;
		classExtension = newClassExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION,
					oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassTemplate() {
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassTemplate(String newClassTemplate) {
		String oldClassTemplate = classTemplate;
		classTemplate = newClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE,
					oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceClassInjectionTemplate() {
		return serviceClassInjectionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassInjectionTemplate(String newServiceClassInjectionTemplate) {
		String oldServiceClassInjectionTemplate = serviceClassInjectionTemplate;
		serviceClassInjectionTemplate = newServiceClassInjectionTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.DI_TEMPLATE__SERVICE_CLASS_INJECTION_TEMPLATE, oldServiceClassInjectionTemplate,
					serviceClassInjectionTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaoClassInjectionTemplate() {
		return daoClassInjectionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaoClassInjectionTemplate(String newDaoClassInjectionTemplate) {
		String oldDaoClassInjectionTemplate = daoClassInjectionTemplate;
		daoClassInjectionTemplate = newDaoClassInjectionTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.DI_TEMPLATE__DAO_CLASS_INJECTION_TEMPLATE, oldDaoClassInjectionTemplate,
					daoClassInjectionTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			return getInterfaceTemplate();
		case FramewebPackage.DI_TEMPLATE__INTERFACE_EXTENSION:
			return getInterfaceExtension();
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.DI_TEMPLATE__SERVICE_CLASS_INJECTION_TEMPLATE:
			return getServiceClassInjectionTemplate();
		case FramewebPackage.DI_TEMPLATE__DAO_CLASS_INJECTION_TEMPLATE:
			return getDaoClassInjectionTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__INTERFACE_EXTENSION:
			setInterfaceExtension((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__SERVICE_CLASS_INJECTION_TEMPLATE:
			setServiceClassInjectionTemplate((String) newValue);
			return;
		case FramewebPackage.DI_TEMPLATE__DAO_CLASS_INJECTION_TEMPLATE:
			setDaoClassInjectionTemplate((String) newValue);
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
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			setInterfaceTemplate(INTERFACE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__INTERFACE_EXTENSION:
			setInterfaceExtension(INTERFACE_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__SERVICE_CLASS_INJECTION_TEMPLATE:
			setServiceClassInjectionTemplate(SERVICE_CLASS_INJECTION_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.DI_TEMPLATE__DAO_CLASS_INJECTION_TEMPLATE:
			setDaoClassInjectionTemplate(DAO_CLASS_INJECTION_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.DI_TEMPLATE__INTERFACE_TEMPLATE:
			return INTERFACE_TEMPLATE_EDEFAULT == null ? interfaceTemplate != null
					: !INTERFACE_TEMPLATE_EDEFAULT.equals(interfaceTemplate);
		case FramewebPackage.DI_TEMPLATE__INTERFACE_EXTENSION:
			return INTERFACE_EXTENSION_EDEFAULT == null ? interfaceExtension != null
					: !INTERFACE_EXTENSION_EDEFAULT.equals(interfaceExtension);
		case FramewebPackage.DI_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.DI_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.DI_TEMPLATE__SERVICE_CLASS_INJECTION_TEMPLATE:
			return SERVICE_CLASS_INJECTION_TEMPLATE_EDEFAULT == null ? serviceClassInjectionTemplate != null
					: !SERVICE_CLASS_INJECTION_TEMPLATE_EDEFAULT.equals(serviceClassInjectionTemplate);
		case FramewebPackage.DI_TEMPLATE__DAO_CLASS_INJECTION_TEMPLATE:
			return DAO_CLASS_INJECTION_TEMPLATE_EDEFAULT == null ? daoClassInjectionTemplate != null
					: !DAO_CLASS_INJECTION_TEMPLATE_EDEFAULT.equals(daoClassInjectionTemplate);
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
		result.append(" (interfaceTemplate: ");
		result.append(interfaceTemplate);
		result.append(", interfaceExtension: ");
		result.append(interfaceExtension);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", classTemplate: ");
		result.append(classTemplate);
		result.append(", serviceClassInjectionTemplate: ");
		result.append(serviceClassInjectionTemplate);
		result.append(", daoClassInjectionTemplate: ");
		result.append(daoClassInjectionTemplate);
		result.append(')');
		return result.toString();
	}

} //DITemplateImpl
