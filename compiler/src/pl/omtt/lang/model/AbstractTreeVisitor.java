package pl.omtt.lang.model;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.model.ast.*;

public class AbstractTreeVisitor implements IVisitor {
	protected Stack<Tree> fStack = new Stack<Tree>();

	protected void run(Tree root) {
		fStack.add(root);
		Set<Tree> visited = new HashSet<Tree>();

		while (!fStack.empty()) {
			Tree node = fStack.peek();
			if (node == null) {
				System.err.println("null node met");
				fStack.pop();
				continue;
			}
			
			if (node instanceof IVisitable)
				((IVisitable) node).accept(this);

			if (node.getChildCount() > 0)
				fStack.add(node.getChild(0));
			else
				while (!fStack.empty()) {
					if (fStack.peek().getChildCount() > node.getChildIndex() + 1) {
						Tree child = fStack.peek().getChild(
								node.getChildIndex() + 1);
						if (!visited.contains(child)) {
							fStack.add(child);
							break;
						} else {
							System.err.println("recursion met: " + child);
						}
					}

					node = fStack.peek();
					visited.add(fStack.peek());
					fStack.pop();
				}
		}
	}

	protected int getDepth() {
		return fStack.size() - 1;
	}

	protected Tree getParent() {
		if (fStack.empty())
			return null;
		else
			return fStack.peek();
	}

	protected void defaultVisit(Tree node) {
		// do nothing
	}

	@Override
	public void visit(Program node) {
		defaultVisit(node);
	}

	@Override
	public void visit(ModuleDeclaration node) {
		defaultVisit(node);
	}

	@Override
	public void visit(UseDeclaration node) {
		defaultVisit(node);
	}

	@Override
	public void visit(ImportDeclaration node) {
		defaultVisit(node);
	}

	@Override
	public void visit(TemplateDefinition node) {
		defaultVisit(node);
	}

	@Override
	public void visit(TemplateArgument node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Block node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Call node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Cast node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Data node) {
		defaultVisit(node);
	}

	@Override
	public void visit(IfElse node) {
		defaultVisit(node);
	}

	@Override
	public void visit(FunExpression node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Transformation node) {
		defaultVisit(node);
	}

	@Override
	public void visit(ArithmeticExpression node) {
		defaultVisit(node);
	}

	@Override
	public void visit(ArithmeticMinus node) {
		defaultVisit(node);
	}

	@Override
	public void visit(BooleanExpression node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Sequence node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Ident node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Range node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Literal node) {
		defaultVisit(node);
	}

	@Override
	public void visit(TypeReference node) {
		defaultVisit(node);
	}

	@Override
	public void visit(AtomSelect node) {
		defaultVisit(node);
	}

	@Override
	public void visit(PropertySelect node) {
		defaultVisit(node);
	}

	@Override
	public void visit(FunctionArgument node) {
		defaultVisit(node);
	}

	@Override
	public void visit(LambdaMatch node) {
		defaultVisit(node);
	}

	@Override
	public void visit(LambdaMatchItem node) {
		defaultVisit(node);
	}

	@Override
	public void visit(Alias node) {
		defaultVisit(node);
	}
}
