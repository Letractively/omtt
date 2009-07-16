package pl.omtt.eclipse.ui.editor;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import pl.omtt.compiler.reporting.IAntlrProblemCollector;
import pl.omtt.compiler.reporting.Problem;
import pl.omtt.eclipse.model.OmttDocumentModel;
import pl.omtt.eclipse.model.ProblemMarkerCollector;
import pl.omtt.lang.grammar.OmttLexer;

@SuppressWarnings("unused")
public class OmttReconcilingStrategy implements IReconcilingStrategy,
		IReconcilingStrategyExtension {

	private OmttEditor fEditor;

	public OmttReconcilingStrategy(OmttEditor editor) {
		fEditor = editor;
	}

	@Override
	public void initialReconcile() {
	}

	@Override
	public void reconcile(IRegion region) {
		OmttDocumentModel model = fEditor.getOmttDocumentModel();
		if (model != null)
			model.reconcile();
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion region) {
		reconcile(region);
	}

	@Override
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
	}

	@Override
	public void setDocument(IDocument document) {
	}
}
