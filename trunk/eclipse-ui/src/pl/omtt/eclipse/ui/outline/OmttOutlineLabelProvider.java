package pl.omtt.eclipse.ui.outline;

import org.antlr.runtime.tree.Tree;
import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.model.ast.ModuleDeclaration;

public class OmttOutlineLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener arg0) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {
	}

	@Override
	public Image getImage(Object obj) {
		if (!(obj instanceof Tree))
			return null;

		if (obj instanceof ModuleDeclaration)
			return JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_PACKAGE);
		
		switch (((Tree) obj).getType()) {
		case OmttLexer.DEF:
			return JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_PUBLIC);
		case OmttLexer.CLASS_ID:
			return JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_CLASS);
		default:
			return null;
		}
	}

	@Override
	public String getText(Object obj) {
		if (!(obj instanceof Tree))
			return null;

		if (obj instanceof ModuleDeclaration)
			return obj.toString();
		
		Tree node = (Tree) obj;		
		
		switch (node.getType()) {
		case OmttLexer.DEF:
			String name = node.getChild(0).getText();
			if (node.getChildCount() > 1
					&& node.getChild(1).getType() == OmttLexer.CLASS_ID)
				name += " <" + node.getChild(1).getText() + ">";
			return name;
		default:
			return node.getText();
		}
	}
}
