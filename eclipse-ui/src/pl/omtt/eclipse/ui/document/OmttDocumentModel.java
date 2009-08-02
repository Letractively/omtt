package pl.omtt.eclipse.ui.document;

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

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.compiler.reporting.PrintProblemCollector;
import pl.omtt.core.Debugging;
import pl.omtt.eclipse.model.IDocumentModelListener;
import pl.omtt.eclipse.model.IModelChangeListener;
import pl.omtt.eclipse.model.OmttModelManager;
import pl.omtt.eclipse.model.OmttProjectModel;
import pl.omtt.eclipse.util.stream.DocumentRawStream;
import pl.omtt.lang.analyze.SymbolTableCreator;
import pl.omtt.lang.code.CodeGenerator;
import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.PrintTreeVisitor;
import pl.omtt.lang.model.ast.Program;

@SuppressWarnings("unused")
public class OmttDocumentModel implements IModelChangeListener {
	final IDocument fDocument;
	final IFile fFile;

	OmttProjectModel fOmttProjectModel;
	Program fDocumentTree;

	ProblemAnnotationCollector fProblemAnnotationCollector;
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
		fOmttProjectModel.addModelChangeListener(this, file);
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
		fProblemAnnotationCollector = new ProblemAnnotationCollector(
				annotationModel);
		fEditorInput = editorInput;
	}

	synchronized public void updateDocumentTree(Program tree) {
		fDocumentTree = tree;
		doReconcile();
	}

	synchronized public void reconcile() {
		IProblemCollector problemCollector;
		if (fProblemAnnotationCollector != null)
			problemCollector = fProblemAnnotationCollector;
		else
			problemCollector = new PrintProblemCollector();

		final DocumentRawStream stream = new DocumentRawStream(fDocument);
		stream.setLocation(fFile.getLocationURI());

		fDocumentTree = fOmttProjectModel
				.parse(fFile, stream, problemCollector);
		if (fProblemAnnotationCollector != null)
			fProblemAnnotationCollector.apply();

		if (Debugging.DEBUG > 0) {
			System.out.println("new tree: ");
			new PrintTreeVisitor().run(fDocumentTree);
		}
		doReconcile();
	}

	private void doReconcile() {
		fireDocumentModelChanged(false);
	}

	public void dispose() {
		fOmttProjectModel.removeModelChangeListener(this, fFile);
		fDocumentTree = null;
		fListeners = null;
	}

	@Override
	public void notifyChange(IResource resource) {
		if (resource.equals(fFile))
			reconcile();
	}
}
