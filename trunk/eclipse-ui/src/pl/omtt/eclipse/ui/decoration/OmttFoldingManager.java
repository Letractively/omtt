package pl.omtt.eclipse.ui.decoration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import pl.omtt.eclipse.model.IDocumentModelListener;
import pl.omtt.eclipse.ui.IOmttPreferenceConstants;
import pl.omtt.eclipse.ui.OmttUI;
import pl.omtt.eclipse.ui.document.OmttDocumentModel;
import pl.omtt.eclipse.ui.partitioner.AbstractPartitionNode;
import pl.omtt.eclipse.ui.partitioner.OmttPartitioner;
import pl.omtt.eclipse.ui.partitioner.PartitionTagNode;
import pl.omtt.eclipse.ui.partitioner.TreeIterator;

public class OmttFoldingManager implements IDocumentModelListener,
		IPropertyChangeListener {
	OmttDocumentModel fDocumentModel;

	ProjectionViewer fProjectionViewer;
	Map<AbstractPartitionNode, ProjectionAnnotation> fProjectionAnnotations;

	public OmttFoldingManager(ProjectionViewer viewer) {
		fProjectionViewer = viewer;
		fProjectionAnnotations = new HashMap<AbstractPartitionNode, ProjectionAnnotation>();

		IPreferenceStore store = OmttUI.getDefault().getPreferenceStore();
		if (store.getBoolean(IOmttPreferenceConstants.FOLDING))
			viewer.doOperation(ProjectionViewer.TOGGLE);
		store.addPropertyChangeListener(this);
	}

	public void setDocumentModel(OmttDocumentModel model) {
		if (fDocumentModel != null) {
			fDocumentModel.removeDocumentModelListener(this);
			fProjectionAnnotations.clear();
		}

		fDocumentModel = model;
		updateFolding();
		fDocumentModel.addDocumentModelListener(this);
	}

	@Override
	public void documentModelChanged(boolean persistent) {
		updateFolding();
	}

	public void dispose() {
		fDocumentModel.removeDocumentModelListener(this);
		fDocumentModel = null;
		fProjectionAnnotations = null;
	}

	private void updateFolding() {
		ProjectionAnnotationModel model = fProjectionViewer.getProjectionAnnotationModel();
		
		if (model == null)
			return;

		IDocumentPartitioner partitioner = fDocumentModel.getDocument()
				.getDocumentPartitioner();
		if (partitioner instanceof OmttPartitioner) {
			OmttPartitioner omttPartitioner = (OmttPartitioner) partitioner;

			Map<AbstractPartitionNode, ProjectionAnnotation> old = fProjectionAnnotations;
			fProjectionAnnotations = new HashMap<AbstractPartitionNode, ProjectionAnnotation>();

			HashMap<ProjectionAnnotation, Position> collected = new HashMap<ProjectionAnnotation, Position>();

			TreeIterator<AbstractPartitionNode> itor = omttPartitioner.iterator();
			while (itor.hasNext()) {
				AbstractPartitionNode node = itor.next();
				if (!(node instanceof PartitionTagNode)
						|| ((PartitionTagNode) node).isSingle())
					continue;

				if (old != null && old.containsKey(node)) {
					ProjectionAnnotation annotation = old.remove(node);
					Position position = model.getPosition(annotation);
					if (position != null) {
						position.setOffset(itor.offset());
						position.setLength(node.getLength());
					}
					fProjectionAnnotations.put(node, annotation);
				} else {
					ProjectionAnnotation annotation = new ProjectionAnnotation();
					Position position = new Position(itor.offset(), node
							.getLength());
					collected.put(annotation, position);
					fProjectionAnnotations.put(node, annotation);
				}
			}

			Annotation[] oldAnnotations = null;
			if (old != null)
				oldAnnotations = old.values().toArray(
						new Annotation[old.size()]);
			model.modifyAnnotations(oldAnnotations,	collected, null);
		}
	}

	public void propertyChange(PropertyChangeEvent propertyEvent) {
		if (IOmttPreferenceConstants.FOLDING.equals(propertyEvent.getProperty())) {
			boolean value = (Boolean)propertyEvent.getNewValue();
			if (value ^ fProjectionViewer.isProjectionMode()) {
				fProjectionViewer.doOperation(ProjectionViewer.TOGGLE);
				fProjectionAnnotations.clear();
			}
		}
	}
}
