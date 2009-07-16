package pl.omtt.eclipse.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

import pl.omtt.compiler.reporting.Problem;

@SuppressWarnings("unused")
public class EclipseProblem {

	protected int fLength;
	protected int fOffset;
	protected int fLineNumber;
	protected String fText;
	protected int fType;

	protected IMarker fAttachedMarker;

	public EclipseProblem(Position p, Annotation a) {
		fOffset = p.offset;
		fLength = p.length;
		fText = a.getText();

		String type = a.getType();
//		if (type.equals(ANNOTATION_TYPE_ERROR))
//			fType = ERROR;
//		else if (type.equals(ANNOTATION_TYPE_WARNING))
//			fType = WARNING;
//		else
//			fType = INFO;

		System.out.println("setting " + this);
	}

	public EclipseProblem(int type, int offset, int length, int lineNumber,
			String text) {
		fType = type;
		fOffset = offset;
		fLength = length;
		fLineNumber = lineNumber;
		fText = text;
	}

	public IMarker createMarker(IResource resource) {
		IMarker marker;
		try {
			marker = resource.createMarker(BUILD_PROBLEM_MARKER);
/*
			switch (fType) {
			case ERROR:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				break;
			case WARNING:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				break;
			default:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
				break;
			}
*/
			marker.setAttribute(IMarker.CHAR_START, fOffset);
			marker.setAttribute(IMarker.CHAR_END, fOffset + fLength);
			marker.setAttribute(IMarker.LINE_NUMBER, fLineNumber + 1);
			marker.setAttribute(IMarker.LOCATION, "line " + (fLineNumber + 1));
			marker.setAttribute(IMarker.MESSAGE, fText);

			return marker;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void attachMarker(IMarker marker) {
		fAttachedMarker = marker;
	}

	public IMarker getAttachedMarker() {
		return fAttachedMarker;
	}

	@Override
	public String toString() {
		return String.format("%s at [%d+%d]: %s", fType, fOffset, fLength,
				fText);
	}

	public Annotation toAnnotation() {
		Annotation a = new Annotation(false);
/*		if (fType == ERROR)
			a.setType(ANNOTATION_TYPE_ERROR);
		else if (fType == WARNING)
			a.setType(ANNOTATION_TYPE_WARNING);
		else
			a.setType(ANNOTATION_TYPE_INFO);*/
		a.setText(fText);
		return a;
	}

	public Position toPosition() {
		return new Position(fOffset, fLength);
	}

	public final static String BUILD_PROBLEM_MARKER = "pl.omtt.eclipse.buildproblemmarker";

	public final static String ANNOTATION_TYPE_ERROR = "pl.omtt.eclipse.markers.error";
	public final static String ANNOTATION_TYPE_WARNING = "pl.omtt.eclipse.markers.warning";
	public final static String ANNOTATION_TYPE_INFO = "pl.omtt.eclipse.markers.info";
}
