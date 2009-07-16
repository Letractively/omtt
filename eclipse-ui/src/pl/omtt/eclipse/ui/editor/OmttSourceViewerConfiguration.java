package pl.omtt.eclipse.ui.editor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import pl.omtt.eclipse.ui.OmttUI;
import pl.omtt.eclipse.ui.autoedit.*;
import pl.omtt.eclipse.ui.decoration.*;
import pl.omtt.eclipse.ui.partitioner.OmttPartitioner;
import pl.omtt.eclipse.ui.scanners.*;

public class OmttSourceViewerConfiguration extends SourceViewerConfiguration {
	private TokenProvider fTokenProvider;
	private OmttEditor fEditor;

	public OmttSourceViewerConfiguration(OmttEditor editor,
			OmttColorProvider colorProvider) {
		fEditor = editor;

		IPreferenceStore preferenceStore = OmttUI.getDefault().getPreferenceStore();
		fTokenProvider = new TokenProvider(preferenceStore, colorProvider);
	}

	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {

		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				OmttPartitioner.COMMENT, OmttPartitioner.TAG, OmttPartitioner.DATA,
				OmttPartitioner.STRING, OmttPartitioner.EXPRESSION, OmttPartitioner.JAVADOC };
	}

	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(
				new RuleBasedScanner());
		reconciler.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);

		DefaultDamagerRepairer tagDR = new DefaultDamagerRepairer(
				new TagScanner(fTokenProvider));
		reconciler.setRepairer(tagDR, OmttPartitioner.TAG);
		reconciler.setDamager(tagDR, OmttPartitioner.TAG);

		DefaultDamagerRepairer expressionDR = new DefaultDamagerRepairer(
				new ExpressionScanner(fTokenProvider));
		reconciler.setRepairer(expressionDR, OmttPartitioner.EXPRESSION);
		reconciler.setDamager(expressionDR, OmttPartitioner.EXPRESSION);

		DefaultDamagerRepairer dataDR = new DefaultDamagerRepairer(
				new DataScanner(fTokenProvider));
		reconciler.setRepairer(dataDR, OmttPartitioner.DATA);
		reconciler.setDamager(dataDR, OmttPartitioner.DATA);

		DefaultDamagerRepairer stringDR = new DefaultDamagerRepairer(
				new StringScanner(fTokenProvider));
		reconciler.setRepairer(stringDR, OmttPartitioner.STRING);
		reconciler.setDamager(stringDR, OmttPartitioner.STRING);

		DefaultDamagerRepairer commentDR = new DefaultDamagerRepairer(
				new CommentScanner(fTokenProvider));
		reconciler.setRepairer(commentDR, OmttPartitioner.COMMENT);
		reconciler.setDamager(commentDR, OmttPartitioner.COMMENT);

		DefaultDamagerRepairer javadocDR = new DefaultDamagerRepairer(
				new JavaDocScanner(fTokenProvider));
		reconciler.setRepairer(javadocDR, OmttPartitioner.JAVADOC);
		reconciler.setDamager(javadocDR, OmttPartitioner.JAVADOC);
		return reconciler;
	}

	public IAutoEditStrategy[] getAutoEditStrategies(
			ISourceViewer sourceViewer, String contentType) {
		IAutoEditStrategy strategy;

		if (OmttPartitioner.EXPRESSION.equals(contentType))
			strategy = new ExpressionAutoEditStrategy();
		else if (OmttPartitioner.TAG.equals(contentType))
			strategy = new TagAutoEditStrategy();
		else if (OmttPartitioner.DATA.equals(contentType))
			strategy = new DataAutoEditStrategy();
		else if (OmttPartitioner.STRING.equals(contentType))
			strategy = new DataAutoEditStrategy();
		else
			strategy = new DefaultIndentLineAutoEditStrategy();

		return new IAutoEditStrategy[] { strategy };
	}

	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		IReconcilingStrategy strategy = new OmttReconcilingStrategy(fEditor);
		return new MonoReconciler(strategy, false);
	}

	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return new OmttAnnotationHover();
	}

	@Override
	public ITextHover getTextHover (ISourceViewer sourceViewer, String contentType) {
		if (OmttPartitioner.EXPRESSION.equals(contentType) || OmttPartitioner.TAG.equals(contentType))
			return new OmttTextHover(fEditor);
		else
			return null;
	}
}