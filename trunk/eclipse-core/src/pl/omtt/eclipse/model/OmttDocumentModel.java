package pl.omtt.eclipse.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
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

import pl.omtt.eclipse.util.stream.DocumentRawStream;
import pl.omtt.lang.code.CodeGeneratorVisitor;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.PrintTreeVisitor;
import pl.omtt.lang.symboltable.SymbolTableCreator;

@SuppressWarnings("unused")
public class OmttDocumentModel {
	IDocument fDocument;
	IFile fFile;

	CommonTokenStream fDocumentTokens;
	CommonTree fDocumentTree;
	ProblemMarkerCollector fProblems;

	// annotations
	IAnnotationModel fAnnotationModel;
	Set<Annotation> fAnnotations;

	IEditorInput fEditorInput;
//	IEclipseProblemCollector fInEditorProblems;

	Set<IDocumentModelListener> fListeners = new HashSet<IDocumentModelListener>();

	public OmttDocumentModel(IDocument document) {
		this(document, null);
	}

	public OmttDocumentModel(IDocument document, IFile file) {
		fDocument = document;
		fFile = file;
		fProblems = new ProblemMarkerCollector();

		persist();
	}

	public CommonTree getDocumentTree() {
		return fDocumentTree;
	}

	public Tree getNodeAt(int offset, int length) {
		CommonTree current = fDocumentTree;
		boolean finishFlag = false;
		while (!finishFlag) {
			finishFlag = true;
			for (int i = 0; i < current.getChildCount(); i++) {
				Tree child = current.getChild(i);
				try {
					CommonToken start = (CommonToken) fDocumentTokens.get(child
							.getTokenStartIndex());
					CommonToken stop = (CommonToken) fDocumentTokens.get(child
							.getTokenStopIndex());

					if (start.getStartIndex() <= offset
							&& stop.getStopIndex() >= offset + length) {
						current = (CommonTree)child;
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
		TreeIterator itor = new TreeIterator(fDocumentTree);
		while(itor.hasNext()) {
			Object o = itor.next();
			if (o instanceof CommonTree) {
				if (((CommonTree)o).getToken() instanceof CommonToken) {
					CommonToken token = (CommonToken)((CommonTree)o).getToken();
					if (token.getStartIndex() <= offset && token.getStopIndex() >= offset + length)
						return (CommonTree)o;
				}
			}
		}
		return null;
	}

	public CommonTokenStream getDocumentTokens() {
		return fDocumentTokens;
	}

	public IDocument getDocument() {
		return fDocument;
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
//		fInEditorProblems = new ProblemMarkerCollector();
	}

	public synchronized void persist() {
		if (fFile != null)
			try {
				fFile.deleteMarkers(EclipseProblem.BUILD_PROBLEM_MARKER, false,
						IResource.DEPTH_INFINITE);
			} catch (CoreException e) {
				e.printStackTrace();
				return;
			}

//		fProblems.clear();
//		parse(fProblems);

//		if (fFile != null)
//			fProblems.createMarkers(fFile);

		fireDocumentModelChanged(true);
	}

	synchronized public void reconcile() {
//		fInEditorProblems.clear();
//		parse(fInEditorProblems);

//		updateAnnotations();
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
//			if (fInEditorProblems.contains(problem)) {
//				MarkerAnnotation ma = (MarkerAnnotation) annotation;
//				fInEditorProblems.ceiling(problem).attachMarker(ma.getMarker());
//			} else {
//				fAnnotationModel.removeAnnotation(annotation);
//				annotation.markDeleted(true);
//				deletedProblems.put(annotation, position);
//			}
		}
/*
		if (fAnnotationModel instanceof IAnnotationModelExtension) {
			IAnnotationModelExtension ext = (IAnnotationModelExtension) fAnnotationModel;
			Map<Annotation, Position> activeProblems = fInEditorProblems
					.toAnnotationMap();
			ext.replaceAnnotations(fAnnotations
					.toArray(new Annotation[fAnnotations.size()]),
					activeProblems);
			fAnnotations = activeProblems.keySet();
		}
*/
	}
/*
	private void parse(ProblemMarkerCollector problems) {
		fDocumentTree = null;
		fDocumentTokens = null;

		CharStream stream = new DocumentRawStream(fDocument);
		OmttLexer lexer = new OmttLexer(stream);
		lexer.connectProblemContainer(problems);

		fDocumentTokens = new CommonTokenStream(lexer);
		OmttParser parser = new OmttParser(
				fDocumentTokens);
		parser.connectProblemContainer(problems);
	}
*/
/*
	public IEclipseProblemCollector getProblems() {
		return fProblems;
	}
*/
	public void dispose() {
		fProblems = null;
//		fInEditorProblems = null;
	}
}
