package pl.omtt.lang.model;

import java.util.Stack;

import org.antlr.runtime.tree.Tree;

public class AbstractTreeWalker extends AbstractTreeVisitor implements IVisitor {
	private int fIndex;

	@Override
	public void run(Tree root) {
		apply(root);
	}

	protected boolean first() {
		return fIndex == 0;
	}

	protected final void apply(Tree node) {
		if (node == null)
			return;

		fStack.push(node);
		if (node instanceof IVisitable) {
			((IVisitable) node).accept(this);
			fIndex++;
		} else {
			apply();
		}
		fStack.pop();
	}

	protected final void apply(Class<?> type, boolean recursively) {
		Tree current = fStack.peek();
		Stack<Tree> stack = new Stack<Tree>();

		for (int i = current.getChildCount() - 1; i >= 0; i--)
			stack.push(current.getChild(i));

		while (!stack.isEmpty()) {
			Tree child = stack.pop();
			if (type.isAssignableFrom(child.getClass())) {
				apply(child);
			} else if (recursively) {
				fIndex = 0;
				for (int i = child.getChildCount() - 1; i >= 0; i--) {
					stack.push(child.getChild(i));
				}
			}
		}
	}

	protected final void apply(Object node, Class<?> type) {
		if (node instanceof Tree && type.isAssignableFrom(node.getClass()))
			apply((Tree) node);
	}

	protected final void apply(Object node) {
		if (node instanceof Tree)
			apply((Tree) node);
	}

	protected final void apply(Class<?> type) {
		apply(type, true);
	}

	protected final void applyChildren(Class<?> type) {
		apply(type, false);
	}

	protected final void apply() {
		apply(IVisitable.class);
	}
}
