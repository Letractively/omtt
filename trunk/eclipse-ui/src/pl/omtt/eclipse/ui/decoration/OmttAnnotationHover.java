package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.text.source.DefaultAnnotationHover;

import org.eclipse.jface.text.source.Annotation;

public class OmttAnnotationHover extends DefaultAnnotationHover {

	@Override
	protected boolean isIncluded(Annotation annotation) {
		return annotation.getType().startsWith("pl.omtt.");
	}
}
