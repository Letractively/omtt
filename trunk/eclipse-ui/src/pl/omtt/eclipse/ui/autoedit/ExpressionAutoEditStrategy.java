package pl.omtt.eclipse.ui.autoedit;

import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class ExpressionAutoEditStrategy extends DefaultIndentLineAutoEditStrategy
		implements IAutoEditStrategy {

	BracketsAutoEditStrategyComponent fBracketsComponent;

	public ExpressionAutoEditStrategy () {
		fBracketsComponent = new BracketsAutoEditStrategyComponent ();
		fBracketsComponent.addBracket('[', ']');
		fBracketsComponent.addBracket('"', '"');
		fBracketsComponent.addBracket('\'', '\'');
		fBracketsComponent.addBracket('{', '}');
		fBracketsComponent.addBracket('(', ')');
	}

	@Override
	public void customizeDocumentCommand(IDocument document,
			DocumentCommand command) {
		super.customizeDocumentCommand(document, command);
		fBracketsComponent.customize(document, command);
	}
}
