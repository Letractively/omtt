package pl.omtt.eclipse.ui.document;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;

import pl.omtt.compiler.reporting.AbstractProblemCollector;
import pl.omtt.compiler.reporting.Problem;

public class ProblemAnnotationCollector extends AbstractProblemCollector {
	IAnnotationModel fModel;
	Map<Annotation, Position> fCollectedAnnotations = new HashMap<Annotation, Position>();

	public ProblemAnnotationCollector(IAnnotationModel model) {
		super();
		fModel = model;
	}

	public void apply() {
		clear();
		Iterator<Map.Entry<Annotation, Position>> itor = fCollectedAnnotations
				.entrySet().iterator();
		while (itor.hasNext()) {
			Map.Entry<Annotation, Position> ap = itor.next();
			fModel.addAnnotation(ap.getKey(), ap.getValue());
		}
		fCollectedAnnotations.clear();
	}

	@SuppressWarnings("unchecked")
	public void clear() {
		Iterator<Annotation> itor = fModel.getAnnotationIterator();
		while (itor.hasNext()) {
			Annotation a = itor.next();
			if (OMTT_ANNOTATION_ERROR.equals(a.getType()))
				fModel.removeAnnotation(a);
		}
	}

	/**
	 * @see AbstractProblemCollector#collect(Problem)
	 */
	@Override
	protected void collect(Problem problem) {
		Position p = new Position(problem.getOffset(), problem.getLength());
		Annotation a = new Annotation(true);
		a.setType(OMTT_ANNOTATION_ERROR);
		a.setText(problem.getMessage());		
		fCollectedAnnotations.put(a, p);

		System.err.println(problem);
	}

	public final String OMTT_ANNOTATION_ERROR = "pl.omtt.eclipse.markers.error";
	public final String OMTT_ANNOTATION_WARNING = "pl.omtt.eclipse.markers.warning";
	public final String OMTT_ANNOTATION_INFO = "pl.omtt.eclipse.markers.info";
}
