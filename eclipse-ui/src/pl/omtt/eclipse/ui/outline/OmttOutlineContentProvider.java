package pl.omtt.eclipse.ui.outline;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import pl.omtt.lang.grammar.OmttLexer;

public class OmttOutlineContentProvider implements ITreeContentProvider {

	public OmttOutlineContentProvider() {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getChildren(Object obj) {
		if (!(obj instanceof Tree))
			return new Object[] {};

		Tree node = (Tree) obj;
		ArrayList<Tree> children = new ArrayList<Tree>();
		for (int i = 0; i < node.getChildCount(); i++) {
			Tree child = node.getChild(i);
			if (isSupportedType(child.getType()))
				children.add(child);
		}

		return children.toArray();
	}

	@Override
	public Object getParent(Object obj) {
		if (!(obj instanceof Tree))
			return null;
		return ((Tree) obj).getParent();
	}

	@Override
	public boolean hasChildren(Object obj) {
		if (!(obj instanceof Tree))
			return false;

		Tree node = (Tree) obj;
		switch (node.getType()) {
		case OmttLexer.USES:
		case OmttLexer.IMPORTS:
			for (int i = 0; i < node.getChildCount(); i++) {
				Tree child = node.getChild(i);
				if (isSupportedType(child.getType()))
					return true;
			}
		}
		return false;
	}

	@Override
	public Object[] getElements(Object node) {
		return getChildren(node);
	}

	public boolean isSupportedType(int type) {
		switch (type) {
		case OmttLexer.DEF:
		case OmttLexer.USES:
		case OmttLexer.USE:
		case OmttLexer.IMPORTS:
		case OmttLexer.IMPORT:
		case OmttLexer.MODULE:
			return true;
		default:
			return false;
		}
	}
}
