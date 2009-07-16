package pl.omtt.eclipse.ui.autoedit;

import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class TagAutoEditStrategy extends ExpressionAutoEditStrategy
		implements IAutoEditStrategy {

	public TagAutoEditStrategy () {
		super();
	}

	@Override
	public void customizeDocumentCommand(IDocument document,
			DocumentCommand command) {
		super.customizeDocumentCommand(document, command);
	}
}
