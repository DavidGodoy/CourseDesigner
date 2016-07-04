package org.mindmap.ui.diagram.conceptsDiagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EnlaceUsaEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public EnlaceUsaEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.mindmap.ui.diagram.conceptsDiagram.edit.policies.EnlaceUsaItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart) {
			((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnlaceUsaEtiquetaFigure());
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
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new EnlaceUsaFigure();
	}

	/**
	 * @generated
	 */
	public EnlaceUsaFigure getPrimaryShape() {
		return (EnlaceUsaFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EnlaceUsaFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnlaceUsaEtiquetaFigure;

		/**
		 * @generated
		 */
		public EnlaceUsaFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEnlaceUsaEtiquetaFigure = new WrappingLabel();

			fFigureEnlaceUsaEtiquetaFigure.setText("");

			this.add(fFigureEnlaceUsaEtiquetaFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnlaceUsaEtiquetaFigure() {
			return fFigureEnlaceUsaEtiquetaFigure;
		}

	}

}
