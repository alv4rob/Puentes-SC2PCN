package pcn.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import pcn.diagram.edit.policies.PCNDecisionStepCompartmentDecisionProcessTags3CanonicalEditPolicy;
import pcn.diagram.edit.policies.PCNDecisionStepCompartmentDecisionProcessTags3ItemSemanticEditPolicy;
import pcn.diagram.part.Messages;
import pcn.diagram.part.PcnVisualIDRegistry;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTags3EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7033;

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTags3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.PCNDecisionStepCompartmentDecisionProcessTags3EditPart_title;
	}

	/**
	* @generated NOT
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);

		// remove the spacing
		result.getScrollPane().getContents().setBorder(new MarginBorder(0, 0, 0, 0));

		result.setTitleVisibility(false);
		result.setBorder(null);

		// disable scrollpane
		result.getScrollPane().setEnabled(false);
		result.getScrollPane().setScrollBarVisibility(ScrollPane.NEVER);
		result.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
		result.getScrollPane().getViewport().setContentsTracksHeight(true);
		result.getScrollPane().getViewport().setContentsTracksWidth(true);

		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PCNDecisionStepCompartmentDecisionProcessTags3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(PcnVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PCNDecisionStepCompartmentDecisionProcessTags3CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature)
				|| NotationPackage.eINSTANCE.getSize_Height().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_X().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
	}

	/**
	* @generated
	*/
	protected void refreshBounds() {
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(x, y, width, height));
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	/**
	* @generated NOT
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == PcnElementTypes.PCNMonetaryBenefit_3156) {
				return this;
			}
			if (type == PcnElementTypes.PCNMonetaryCost_3157) {
				return this;
			}
			if (type == PcnElementTypes.PCNNonMonetaryBenefit_3158) {
				return this;
			}
			if (type == PcnElementTypes.PCNNonMonetaryCost_3159) {
				return this;
			}
			if (type == PcnElementTypes.PCNTextualTag_3195) {
				return this;
			}
			if (type == PcnElementTypes.PCNProbabilitiesTag_3210) {
				return this;
			}
			if (type == PcnElementTypes.PCNSyncTag_3240) {
				return this;
			}
			//			return getParent().getTargetEditPart(request);
			//Para no tener que seleccionar el nodo a crear:
			return null;
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
