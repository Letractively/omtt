package pl.omtt.eclipse.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeIterator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.MarkerAnnotation;

import pl.omtt.compiler.reporting.PrintProblemCollector;
import pl.omtt.eclipse.util.stream.DocumentRawStream;
import pl.omtt.lang.analyze.SymbolTableCreator;
import pl.omtt.lang.code.CodeGenerator;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.PrintTreeVisitor;
import pl.omtt.lang.model.ast.Program;

@SuppressWarnings("unused")
public class OmttDocumentModel {
	final IDocument fDocument;
	final IFile fFile;

	OmttProjectModel fOmttProjectModel;
	Program fDocumentTree;

	// annotations
	IAnnotationModel fAnnotationModel;
	Set<Annotation> fAnnotations;

	IEditorInput fEditorInput;

	Set<IDocumentModelListener> fListeners = new HashSet<IDocumentModelListener>();

	public OmttDocumentModel(IDocument document) {
		this(document, null);
	}

	public OmttDocumentModel(IDocument document, IFile file) {
		fDocument = document;
		fFile = file;

		fOmttProjectModel = OmttModelManager.getOmttModelManager()
				.getProjectModel(file.getProject());
		if (fOmttProjectModel != null)
			fOmttProjectModel.registerDocumentModel(this);
		
		reconcile();
	}

	public IDocument getDocument() {
		return fDocument;
	}

	public IFile getFile() {
		return fFile;
	}

	public Program getDocumentTree() {
		return fDocumentTree;
	}

	public TokenStream getDocumentTokens() {
		return fDocumentTree.getTokenStream();
	}

	public Tree getNodeAt(int offset, int length) {
		CommonTree current = fDocumentTree;
		boolean finishFlag = false;
		while (!finishFlag) {
			finishFlag = true;
			for (int i = 0; i < current.getChildCount(); i++) {
				Tree child = current.getChild(i);
				try {
					CommonToken start = (CommonToken) getDocumentTokens().get(
							child.getTokenStartIndex());
					CommonToken stop = (CommonToken) getDocumentTokens().get(
							child.getTokenStopIndex());

					if (start.getStartIndex() <= offset
							&& stop.getStopIndex() >= offset + length) {
						current = (CommonTree) child;
						finishFlag = false;
						break;
					}
				} catch (Exception e) {
				}
			}
		}
		return current;
	}

	public CommonTree getNodeAnchoredAt(int offset, int length) {
		TreeIterator itor = new TreeIterator(getDocumentTree());
		while (itor.hasNext()) {
			Object o = itor.next();
			if (o instanceof CommonTree) {
				if (((CommonTree) o).getToken() instanceof CommonToken) {
					CommonToken token = (CommonToken) ((CommonTree) o)
							.getToken();
					if (token.getStartIndex() <= offset
							&& token.getStopIndex() >= offset + length)
						return (CommonTree) o;
				}
			}
		}
		return null;
	}

	public void addDocumentModelListener(IDocumentModelListener listener) {
		fListeners.add(listener);
	}

	public void removeDocumentModelListener(IDocumentModelListener listener) {
		fListeners.remove(listener);
	}

	private void fireDocumentModelChanged(boolean persistent) {
		for (IDocumentModelListener listener : fListeners)
			listener.documentModelChanged(persistent);
	}

	public void setEditor(IEditorInput editorInput,
			IAnnotationModel annotationModel) {
		fAnnotations = new HashSet<Annotation>();
		fAnnotationModel = annotationModel;
		fEditorInput = editorInput;
	}

	synchronized public void updateDocumentTree(Program tree) {
		fDocumentTree = tree;
		doReconcile();
	}

	synchronized public void reconcile() {
		System.err.println("reconcile...");
		fDocumentTree = fOmttProjectModel.parse(this,
				new PrintProblemCollector());
		System.out.println("new tree: ");
		new PrintTreeVisitor().run(fDocumentTree);
		doReconcile();
	}

	private void doReconcile() {
		System.err.println("doReconcile");
		fireDocumentModelChanged(false);
	}

	@SuppressWarnings("unchecked")
	private void updateAnnotations() {
		Map<Annotation, Position> deletedProblems = new HashMap<Annotation, Position>();

		Iterator<Annotation> annItor = fAnnotationModel.getAnnotationIterator();
		while (annItor.hasNext()) {
			Annotation annotation = annItor.next();
			if (!(annotation instanceof MarkerAnnotation))
				continue;

			if (annotation.isMarkedDeleted())
				continue;

			Position position = fAnnotationModel.getPosition(annotation);
			EclipseProblem problem = new EclipseProblem(position, annotation);
			// if (fInEditorProblems.contains(problem)) {
			// MarkerAnnotation ma = (MarkerAnnotation) annotation;
			// fInEditorProblems.ceiling(problem).attachMarker(ma.getMarker());
			// } else {
			// fAnnotationModel.removeAnnotation(annotation);
			// annotation.markDeleted(true);
			// deletedProblems.put(annotation, position);
			// }
		}
		/*
		 * if (fAnnotationModel instanceof IAnnotationModelExtension) {
		 * IAnnotationModelExtension ext = (IAnnotationModelExtension)
		 * fAnnotationModel; Map<Annotation, Position> activeProblems =
		 * fInEditorProblems .toAnnotationMap();
		 * ext.replaceAnnotations(fAnnotations .toArray(new
		 * Annotation[fAnnotations.size()]), activeProblems); fAnnotations =
		 * activeProblems.keySet(); }
		 */
	}

	public void dispose() {
		fAnnotations = null;
		fDocumentTree = null;
		fListeners = null;
	}
}
