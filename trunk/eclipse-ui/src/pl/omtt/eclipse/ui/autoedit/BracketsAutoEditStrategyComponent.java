package pl.omtt.eclipse.ui.autoedit;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

import pl.omtt.eclipse.ui.scanners.IdDetector;

public class BracketsAutoEditStrategyComponent {

	Map<Character, Character> fBrackets;

	public BracketsAutoEditStrategyComponent() {
		fBrackets = new TreeMap<Character, Character>();
	}

	public void addBracket(char open, char close) {
		fBrackets.put(open, close);
	}

	public void customize(IDocument document, DocumentCommand command) {
		// check following char - return if is name char
		try {
			int fchar = document.getChar(command.offset);
			if (IdDetector.isIdChar(fchar))
				return;
		} catch (BadLocationException e) {
		}

		// Bracket auto-insert
		if (command.text.length() == 1) {
			char c = command.text.charAt(0);
			if (fBrackets.containsKey(c)) {
				command.text += fBrackets.get(c);
				setCursor(command);
			}
		}

		// Bracket auto-removal
		else if (command.text.length() == 0 && command.length == 1) {
			try {
				char c = document.getChar(command.offset);
				if (fBrackets.containsKey(c)
						&& fBrackets.get(c) == document.getChar(command.offset + 1))
					command.length = 2;
			} catch (BadLocationException e) {
				return;
			}
		}
	}

	private void setCursor(DocumentCommand command) {
		command.caretOffset = command.offset + 1;
		command.shiftsCaret = false;
	}
}
