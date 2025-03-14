/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaC.OverrideModifier#getInputparamsOverride <em>Inputparams Override</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaC.SmaCPackage#getOverrideModifier()
 * @model
 * @generated
 */
public interface OverrideModifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Inputparams Override</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smaC.InputParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputparams Override</em>' containment reference list.
   * @see org.xtext.smaC.SmaCPackage#getOverrideModifier_InputparamsOverride()
   * @model containment="true"
   * @generated
   */
  EList<InputParam> getInputparamsOverride();

} // OverrideModifier
