/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.smaC.Clause;
import org.xtext.smaC.SmaCFactory;
import org.xtext.smaC.SmaCPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.smaC.Clause} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClauseItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClauseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addConstantPropertyDescriptor(object);
			addVirtualPropertyDescriptor(object);
			addVisibilityAccessPropertyDescriptor(object);
			addPersonalizedModifierPropertyDescriptor(object);
			addPredefinedModifierPropertyDescriptor(object);
			addExpressionsPropertyDescriptor(object);
			addPredefinedFunctionsPropertyDescriptor(object);
			addEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_name_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_constant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_constant_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__CONSTANT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_virtual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_virtual_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__VIRTUAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_visibilityAccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_visibilityAccess_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__VISIBILITY_ACCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Personalized Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersonalizedModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_personalizedModifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_personalizedModifier_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__PERSONALIZED_MODIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predefined Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredefinedModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_predefinedModifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_predefinedModifier_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__PREDEFINED_MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expressions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_expressions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_expressions_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__EXPRESSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predefined Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredefinedFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_predefinedFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_predefinedFunctions_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__PREDEFINED_FUNCTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clause_event_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clause_event_feature", "_UI_Clause_type"),
				 SmaCPackage.Literals.CLAUSE__EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_MODIFIER);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__OVERRIDE);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__OUTPUT_PARAMS);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__RESTRICTION);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__CONDITIONS);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__PROPERTIES);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__MAPPING_PROPERTIES);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__UNDETERMINEDLOOPS);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__DETERMINEDLOOPS);
			childrenFeatures.add(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_EVENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Clause.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Clause"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Clause)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Clause_type") :
			getString("_UI_Clause_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Clause.class)) {
			case SmaCPackage.CLAUSE__NAME:
			case SmaCPackage.CLAUSE__CONSTANT:
			case SmaCPackage.CLAUSE__VIRTUAL:
			case SmaCPackage.CLAUSE__VISIBILITY_ACCESS:
			case SmaCPackage.CLAUSE__PREDEFINED_MODIFIER:
			case SmaCPackage.CLAUSE__EXPRESSIONS:
			case SmaCPackage.CLAUSE__PREDEFINED_FUNCTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmaCPackage.CLAUSE__INPUT_PARAMS:
			case SmaCPackage.CLAUSE__INPUT_PARAMS_MODIFIER:
			case SmaCPackage.CLAUSE__OVERRIDE:
			case SmaCPackage.CLAUSE__OUTPUT_PARAMS:
			case SmaCPackage.CLAUSE__RESTRICTION:
			case SmaCPackage.CLAUSE__CONDITIONS:
			case SmaCPackage.CLAUSE__PROPERTIES:
			case SmaCPackage.CLAUSE__MAPPING_PROPERTIES:
			case SmaCPackage.CLAUSE__UNDETERMINEDLOOPS:
			case SmaCPackage.CLAUSE__DETERMINEDLOOPS:
			case SmaCPackage.CLAUSE__INPUT_PARAMS_EVENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS,
				 SmaCFactory.eINSTANCE.createInputParam()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS,
				 SmaCFactory.eINSTANCE.createMappingDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_MODIFIER,
				 SmaCFactory.eINSTANCE.createInputParam()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_MODIFIER,
				 SmaCFactory.eINSTANCE.createMappingDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__OVERRIDE,
				 SmaCFactory.eINSTANCE.createOverrideModifier()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__OUTPUT_PARAMS,
				 SmaCFactory.eINSTANCE.createOutputParam()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__RESTRICTION,
				 SmaCFactory.eINSTANCE.createRestrictionClause()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__RESTRICTION,
				 SmaCFactory.eINSTANCE.createRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__RESTRICTION,
				 SmaCFactory.eINSTANCE.createRestrictionGas()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__RESTRICTION,
				 SmaCFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__CONDITIONS,
				 SmaCFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyString()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyInteger()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyFloat()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyUInteger()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyAddress()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyUser()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyCompany()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__PROPERTIES,
				 SmaCFactory.eINSTANCE.createPropertyBytes()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__MAPPING_PROPERTIES,
				 SmaCFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__UNDETERMINEDLOOPS,
				 SmaCFactory.eINSTANCE.createUnDeterminedLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__UNDETERMINEDLOOPS,
				 SmaCFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__UNDETERMINEDLOOPS,
				 SmaCFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__DETERMINEDLOOPS,
				 SmaCFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_EVENT,
				 SmaCFactory.eINSTANCE.createInputParam()));

		newChildDescriptors.add
			(createChildParameter
				(SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_EVENT,
				 SmaCFactory.eINSTANCE.createMappingDeclaration()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SmaCPackage.Literals.CLAUSE__INPUT_PARAMS ||
			childFeature == SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_MODIFIER ||
			childFeature == SmaCPackage.Literals.CLAUSE__INPUT_PARAMS_EVENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SmaCEditPlugin.INSTANCE;
	}

}
