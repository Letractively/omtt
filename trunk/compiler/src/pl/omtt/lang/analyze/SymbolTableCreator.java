package pl.omtt.lang.analyze;

import java.net.URI;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.lang.model.AbstractTreeWalker;
import pl.omtt.lang.model.ast.*;
import pl.omtt.lang.model.types.TypeException;

public class SymbolTableCreator extends AbstractTreeWalker {
	Stack<SymbolTable> fSymbolTableStack = new Stack<SymbolTable>();

	URI fURI;
	IProblemCollector fProblemCollector;
	ClassLoader fClassLoader;
	ILibrarySymbolTableSupplier fLibrarySTSupplier;
	boolean fCollectLibraryReferences;
	boolean fErrors = false;
	boolean fReportErrors = true;

	public SymbolTableCreator(ClassLoader loader,
			ILibrarySymbolTableSupplier librarySymbolTableSupplier, URI uri,
			IProblemCollector problemCollector, boolean collectLibraryReferences) {
		fClassLoader = loader;
		fLibrarySTSupplier = librarySymbolTableSupplier;
		fURI = uri;
		fProblemCollector = problemCollector;
		fCollectLibraryReferences = collectLibraryReferences;
	}

	private SymbolTable ST() {
		return fSymbolTableStack.peek();
	}

	private void pushST(SymbolTable st) {
		fSymbolTableStack.push(st);
	}

	private SymbolTable popST() {
		return fSymbolTableStack.pop();
	}

	@Override
	public void run(Tree root) {
		if (root instanceof Program) {
			Program program = (Program) root;

			ModuleDeclaration md = program.getModuleDeclaration();
			BaseSymbolTable baseST = new BaseSymbolTable(md.getPackageName()
					+ "." + md.getModuleName(), fClassLoader,
					fLibrarySTSupplier);
			if (fCollectLibraryReferences)
				baseST.collectReferences();
			pushST(baseST);
			super.run(root);
		}
	}

	private void visitUpdater(ISymbolTableParticipant updater) {
		if (updater instanceof ISymbolTableDualParticipant) {
			if (updater instanceof ISymbolTableOwnerForRightNode) {
				SymbolTable ST = fSymbolTableStack.pop();
				apply(((ISymbolTableDualParticipant) updater)
						.getTreePrecedingParticipatingST());
				fSymbolTableStack.push(ST);
			} else {
				apply(((ISymbolTableDualParticipant) updater)
						.getTreePrecedingParticipatingST());
			}
		}

		try {
			updater.takeSymbolTable(ST());
		} catch (TypeException e) {
			if (fReportErrors)
				fProblemCollector.reportError(fURI, e);
			fErrors = true;
		} catch (Exception e) {
			e.printStackTrace();
			fErrors = true;
		}

		if (updater instanceof ISymbolTableDualParticipant)
			apply(((ISymbolTableDualParticipant) updater)
					.getTreeFollowingParticipatingST());
		else
			apply();
	}

	private void visitExpression(IExpression expr)
			throws ForceSymbolTableRecalculatingException {
		try {
			expr.setExpressionType(ST());
		} catch (TypeException e) {
			if (fReportErrors)
				fProblemCollector.reportError(fURI, e);
			fErrors = true;
		} catch (ForceSymbolTableRecalculatingException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			fErrors = true;
		}
	}

	@Override
	public void defaultVisit(Tree node) {
		if (node instanceof ISymbolTableOwner)
			pushST(ST().createChildTable());

		if (node instanceof ISymbolTableParticipant)
			visitUpdater((ISymbolTableParticipant) node);
		else
			apply();

		try {
			if (node instanceof IExpression)
				visitExpression((IExpression) node);

			if (node instanceof ISymbolTableOwner)
				popST();
		} catch (ForceSymbolTableRecalculatingException e) {
			System.err.println("recalc");
			if (node instanceof ISymbolTableOwner)
				popST();
			boolean beforeReportErrors = fReportErrors;
			fReportErrors = false;
			defaultVisit(node);
			fReportErrors = beforeReportErrors;
		}
	}
}
