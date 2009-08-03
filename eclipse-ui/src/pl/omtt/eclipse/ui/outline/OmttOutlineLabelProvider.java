package pl.omtt.eclipse.ui.outline;

import org.antlr.runtime.tree.Tree;
import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import pl.omtt.lang.grammar.OmttLexer;
import pl.omtt.lang.model.ast.ImportDeclaration;
import pl.omtt.lang.model.ast.ModuleDeclaration;
import pl.omtt.lang.model.ast.TemplateDefinition;
import pl.omtt.lang.model.ast.UseDeclaration;

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
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_PACKDECL);

		switch (((Tree) obj).getType()) {
		case OmttLexer.DEF:
			if (obj instanceof TemplateDefinition
					&& ((TemplateDefinition) obj).getTemplateName().startsWith(
							"@"))
				return JavaUI.getSharedImages().getImage(
						ISharedImages.IMG_OBJS_PRIVATE);
			else
				return JavaUI.getSharedImages().getImage(
						ISharedImages.IMG_OBJS_PUBLIC);
		case OmttLexer.CLASS_ID:
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_CLASS);
		case OmttLexer.USES:
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_IMPCONT);
		case OmttLexer.USE:
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_IMPDECL);
		case OmttLexer.IMPORTS:
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_EXTERNAL_ARCHIVE);
		case OmttLexer.IMPORT:
			return JavaUI.getSharedImages().getImage(
					ISharedImages.IMG_OBJS_IMPDECL);
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
		case OmttLexer.USES:
			return "use declarations";
		case OmttLexer.USE:
			return ((UseDeclaration) node).getUseId();
		case OmttLexer.IMPORTS:
			return "import declarations";
		case OmttLexer.IMPORT:
			return ((ImportDeclaration) node).getImportingClasses();
		default:
			return node.toString();
		}
	}
}
