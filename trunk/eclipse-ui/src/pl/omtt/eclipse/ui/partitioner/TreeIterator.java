package pl.omtt.eclipse.ui.partitioner;

import java.util.Iterator;
import java.util.Stack;

public class TreeIterator<T extends AbstractTreeNode<?>> implements Iterator<T> {

	Stack<NodeAndOffset> fStack = new Stack<NodeAndOffset>();
	NodeAndOffset fNodeAndOffset;

	public TreeIterator(T rootNode) {
		fStack.push(new NodeAndOffset(rootNode, 0));
	}

	@Override
	public boolean hasNext() {
		return !fStack.empty();
	}

	@Override
	public T next() {
		fNodeAndOffset = fStack.peek();
		rewind();
		return fNodeAndOffset.fNode;
	}

	public int offset() {
		return fNodeAndOffset.fOffset;
	}

	@SuppressWarnings("unchecked")
	private void rewind() {
		if (fStack.peek().fNode.fChildren.size() == 0) {
			fStack.pop();
		}

		if (fStack.empty())
			return;

		while (fStack.peek().fChildIndex == fStack.peek().fNode.fChildren.size() - 1) {
			fStack.pop();

			if (fStack.empty())
				return;
		}

		assert fStack.peek().fChildIndex < fStack.peek().fNode.fChildren.size() - 1;
		int index = ++fStack.peek().fChildIndex;
		T child = (T) fStack.peek().fNode.fChildren.get(index);
		fStack.push(new NodeAndOffset(child, fStack.peek().fOffset + child.fOffset));
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	public class NodeAndOffset {
		T fNode;
		int fOffset;
		int fChildIndex = -1;

		public NodeAndOffset(T node, int offset) {
			fNode = node;
			fOffset = offset;
		}
	}
}
