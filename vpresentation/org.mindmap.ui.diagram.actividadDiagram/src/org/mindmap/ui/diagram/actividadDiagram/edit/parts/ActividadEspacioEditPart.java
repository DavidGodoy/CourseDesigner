package org.mindmap.ui.diagram.actividadDiagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ActividadEspacioEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public ActividadEspacioEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.mindmap.ui.diagram.actividadDiagram.edit.policies.ActividadEspacioItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ActividadEspacioFigure();
	}

	/**
	 * @generated
	 */
	public ActividadEspacioFigure getPrimaryShape() {
		return (ActividadEspacioFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart) {
			((org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureActividadEspacioNombreFigure());
			return true;
		}
		if (childEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureActividadLaneFigure_body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureActividadLaneFigure_body();
			pane.remove(((org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart) {
			return getPrimaryShape().getFigureActividadLaneFigure_body();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
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
		return getChildBySemanticHint(org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getType(org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ActividadEspacioFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActividadEspacioNombreFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureActividadLaneFigure_body;

		/**
		 * @generated
		 */
		public ActividadEspacioFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure actividadLaneFigure_name0 = new RectangleFigure();

			this.add(actividadLaneFigure_name0, BorderLayout.TOP);
			actividadLaneFigure_name0.setLayoutManager(new StackLayout());

			fFigureActividadEspacioNombreFigure = new WrappingLabel();

			fFigureActividadEspacioNombreFigure.setText("");

			actividadLaneFigure_name0.add(fFigureActividadEspacioNombreFigure);

			org.mindmap.ui.diagram.actividadDiagram.custom.layout.CenterLayout layoutFFigureActividadEspacioNombreFigure = new org.mindmap.ui.diagram.actividadDiagram.custom.layout.CenterLayout();
			fFigureActividadEspacioNombreFigure
					.setLayoutManager(layoutFFigureActividadEspacioNombreFigure);

			fFigureActividadLaneFigure_body = new RectangleFigure();

			this.add(fFigureActividadLaneFigure_body, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActividadEspacioNombreFigure() {
			return fFigureActividadEspacioNombreFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureActividadLaneFigure_body() {
			return fFigureActividadLaneFigure_body;
		}

	}

}
