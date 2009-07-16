package pl.omtt.lang.code;

import java.net.URI;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import pl.omtt.compiler.reporting.IProblemCollector;
import pl.omtt.lang.model.AbstractTreeWalker;
import pl.omtt.lang.model.ast.*;
import pl.omtt.lang.model.types.TypeException;

public class SymbolTableCreator extends AbstractTreeWalker {
	Stack<SymbolTable> fSymbolTableStack = new Stack<SymbolTable>();

	IProblemCollector fProblemCollector;
	URI fURI;
	ClassLoader fClassLoader;

	public SymbolTableCreator(ClassLoader loader, URI uri,
			IProblemCollector problemCollector) {
		fClassLoader = loader;
		fURI = uri;
		fProblemCollector = problemCollector;
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
		pushST(new BaseSymbolTable(fClassLoader));
		super.run(root);
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
			fProblemCollector.reportError(fURI, e);
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
			fProblemCollector.reportError(fURI, e);
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
			if (node instanceof ISymbolTableOwner)
				popST();

			defaultVisit(node);
		}
	}
}
