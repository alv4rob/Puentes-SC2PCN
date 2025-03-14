package pcn.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import pcn.diagram.edit.policies.PCNReference5ItemSemanticEditPolicy;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PCNReference5EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3045;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public PCNReference5EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PCNReference5ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new PCNReferenceFigure();
	}

	/**
	* @generated
	*/
	public PCNReferenceFigure getPrimaryShape() {
		return (PCNReferenceFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNReferenceLetter5EditPart) {
			((PCNReferenceLetter5EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNReferenceLetterFigure());
			return true;
		}
		if (childEditPart instanceof PCNReferenceNumber5EditPart) {
			((PCNReferenceNumber5EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNReferenceNumberFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNReferenceLetter5EditPart) {
			return true;
		}
		if (childEditPart instanceof PCNReferenceNumber5EditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(36, 36);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(PcnVisualIDRegistry.getType(PCNReferenceLetter5EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PCNReferenceFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNReferenceLetterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNReferenceNumberFigure;

		/**
		 * @generated
		 */
		public PCNReferenceFigure() {
			this.setLayoutManager(new XYLayout());
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(36), getMapMode().DPtoLP(36)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(36), getMapMode().DPtoLP(36)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(36), getMapMode().DPtoLP(36)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel pCNReferenceSeparationFigure0 = new WrappingLabel();

			pCNReferenceSeparationFigure0.setText("/");

			pCNReferenceSeparationFigure0.setFont(PCNREFERENCESEPARATIONFIGURE0_FONT);

			this.add(pCNReferenceSeparationFigure0, new Rectangle(getMapMode().DPtoLP(17), getMapMode().DPtoLP(9),
					getMapMode().DPtoLP(4), getMapMode().DPtoLP(15)));

			fFigurePCNReferenceLetterFigure = new WrappingLabel();

			fFigurePCNReferenceLetterFigure.setText("_");

			fFigurePCNReferenceLetterFigure.setFont(FFIGUREPCNREFERENCELETTERFIGURE_FONT);

			this.add(fFigurePCNReferenceLetterFigure, new Rectangle(getMapMode().DPtoLP(6), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(15)));

			fFigurePCNReferenceNumberFigure = new WrappingLabel();

			fFigurePCNReferenceNumberFigure.setText("_");

			fFigurePCNReferenceNumberFigure.setFont(FFIGUREPCNREFERENCENUMBERFIGURE_FONT);

			this.add(fFigurePCNReferenceNumberFigure, new Rectangle(getMapMode().DPtoLP(23), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(15)));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNReferenceLetterFigure() {
			return fFigurePCNReferenceLetterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNReferenceNumberFigure() {
			return fFigurePCNReferenceNumberFigure;
		}

	}

	/**
	* @generated
	*/
	static final Font PCNREFERENCESEPARATIONFIGURE0_FONT = new Font(Display.getCurrent(), "/", 10, SWT.NORMAL);

	/**
	* @generated
	*/
	static final Font FFIGUREPCNREFERENCELETTERFIGURE_FONT = new Font(Display.getCurrent(), "_", 10, SWT.NORMAL);

	/**
	* @generated
	*/
	static final Font FFIGUREPCNREFERENCENUMBERFIGURE_FONT = new Font(Display.getCurrent(), "_", 10, SWT.NORMAL);

}
