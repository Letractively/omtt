package pl.omtt.eclipse.ui.document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;

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
		if (fModel instanceof IAnnotationModelExtension) {
			IAnnotationModelExtension model = (IAnnotationModelExtension) fModel;
			List<Annotation> managed = getManaged();
			model.replaceAnnotations(managed.toArray(new Annotation[managed
					.size()]), fCollectedAnnotations);
			fCollectedAnnotations.clear();
		}
	}

	@SuppressWarnings("unchecked")
	private List<Annotation> getManaged() {
		List<Annotation> managed = new ArrayList<Annotation>();
		Iterator<Annotation> itor = fModel.getAnnotationIterator();
		while (itor.hasNext()) {
			Annotation a = itor.next();
			if (OMTT_ANNOTATION_ERROR.equals(a.getType()))
				managed.add(a);
			else if (OMTT_ANNOTATION_WARNING.equals(a.getType()))
				managed.add(a);
			else if (OMTT_ANNOTATION_INFO.equals(a.getType()))
				managed.add(a);
		}
		return managed;
	}

	public void clear() {
		for (Annotation a : getManaged())
			fModel.removeAnnotation(a);
	}

	/**
	 * @see AbstractProblemCollector#collect(Problem)
	 */
	@Override
	protected void collect(Problem problem) {
		Position p = new Position(problem.getOffset(), problem.getLength());
		Annotation a = new Annotation(true);
		switch (problem.getSeverity()) {
		case Problem.ERROR:
		case Problem.FATAL:
			a.setType(OMTT_ANNOTATION_ERROR);
			break;
		case Problem.WARNING:
			a.setType(OMTT_ANNOTATION_WARNING);
			break;
		case Problem.INFO:
		case Problem.OTHER:
			a.setType(OMTT_ANNOTATION_INFO);
			break;
		}
		a.setText(problem.getMessage());
		fCollectedAnnotations.put(a, p);

		System.err.println(problem);
	}

	public final String OMTT_ANNOTATION_ERROR = "pl.omtt.eclipse.markers.error";
	public final String OMTT_ANNOTATION_WARNING = "pl.omtt.eclipse.markers.warning";
	public final String OMTT_ANNOTATION_INFO = "pl.omtt.eclipse.markers.info";
}
