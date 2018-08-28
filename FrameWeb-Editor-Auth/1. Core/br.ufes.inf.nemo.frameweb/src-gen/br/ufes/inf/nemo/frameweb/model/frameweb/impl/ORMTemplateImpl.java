/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORM Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAttributeTemplate <em>Attribute Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getMethodTemplate <em>Method Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ORMTemplateImpl#getAbstractMethodTemplate <em>Abstract Method Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORMTemplateImpl extends FrameworkProfileImpl implements ORMTemplate {
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
	 * The default value of the '{@link #getAttributeTemplate() <em>Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeTemplate() <em>Attribute Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTemplate()
	 * @generated
	 * @ordered
	 */
	protected String attributeTemplate = ATTRIBUTE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodTemplate() <em>Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodTemplate() <em>Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected String methodTemplate = METHOD_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractMethodTemplate() <em>Abstract Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_METHOD_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractMethodTemplate() <em>Abstract Method Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodTemplate()
	 * @generated
	 * @ordered
	 */
	protected String abstractMethodTemplate = ABSTRACT_METHOD_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ORM_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE,
					oldClassTemplate, classTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION,
					oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeTemplate() {
		return attributeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeTemplate(String newAttributeTemplate) {
		String oldAttributeTemplate = attributeTemplate;
		attributeTemplate = newAttributeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE,
					oldAttributeTemplate, attributeTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodTemplate() {
		return methodTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodTemplate(String newMethodTemplate) {
		String oldMethodTemplate = methodTemplate;
		methodTemplate = newMethodTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE,
					oldMethodTemplate, methodTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractMethodTemplate() {
		return abstractMethodTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractMethodTemplate(String newAbstractMethodTemplate) {
		String oldAbstractMethodTemplate = abstractMethodTemplate;
		abstractMethodTemplate = newAbstractMethodTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE, oldAbstractMethodTemplate,
					abstractMethodTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			return getAttributeTemplate();
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			return getMethodTemplate();
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			return getAbstractMethodTemplate();
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			setAttributeTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			setMethodTemplate((String) newValue);
			return;
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			setAbstractMethodTemplate((String) newValue);
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			setAttributeTemplate(ATTRIBUTE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			setMethodTemplate(METHOD_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			setAbstractMethodTemplate(ABSTRACT_METHOD_TEMPLATE_EDEFAULT);
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
		case FramewebPackage.ORM_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.ORM_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.ORM_TEMPLATE__ATTRIBUTE_TEMPLATE:
			return ATTRIBUTE_TEMPLATE_EDEFAULT == null ? attributeTemplate != null
					: !ATTRIBUTE_TEMPLATE_EDEFAULT.equals(attributeTemplate);
		case FramewebPackage.ORM_TEMPLATE__METHOD_TEMPLATE:
			return METHOD_TEMPLATE_EDEFAULT == null ? methodTemplate != null
					: !METHOD_TEMPLATE_EDEFAULT.equals(methodTemplate);
		case FramewebPackage.ORM_TEMPLATE__ABSTRACT_METHOD_TEMPLATE:
			return ABSTRACT_METHOD_TEMPLATE_EDEFAULT == null ? abstractMethodTemplate != null
					: !ABSTRACT_METHOD_TEMPLATE_EDEFAULT.equals(abstractMethodTemplate);
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
		result.append(" (classTemplate: ");
		result.append(classTemplate);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", attributeTemplate: ");
		result.append(attributeTemplate);
		result.append(", methodTemplate: ");
		result.append(methodTemplate);
		result.append(", abstractMethodTemplate: ");
		result.append(abstractMethodTemplate);
		result.append(')');
		return result.toString();
	}

} //ORMTemplateImpl
