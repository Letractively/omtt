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
		Character precedingChar = getChar(document, command.offset - 1);
		Character followingChar = getChar(document, command.offset);

		// Bracket auto-insert
		if (command.text.length() == 1) {
			char c = command.text.charAt(0);

			// check if preceding char is an opening char
			if (precedingChar != null && fBrackets.containsKey(precedingChar)
					&& fBrackets.get(precedingChar) == c)
				return;

			if (fBrackets.values().contains(c)
					&& IdDetector.isIdChar(precedingChar))
				return;

			if (fBrackets.containsKey(c) && !IdDetector.isIdChar(followingChar)) {
				command.text += fBrackets.get(c);
				setCursor(command);
			}
		}

		// Bracket auto-removal
		else if (command.text.length() == 0 && command.length == 1) {
			if (fBrackets.containsKey(followingChar)
					&& fBrackets.get(followingChar) == getChar(document,
							command.offset + 1))
				command.length = 2;
		}
	}

	private void setCursor(DocumentCommand command) {
		command.caretOffset = command.offset + 1;
		command.shiftsCaret = false;
	}

	private Character getChar(IDocument document, int offset) {
		try {
			return document.getChar(offset);
		} catch (BadLocationException e) {
			return null;
		}
	}

	final static int OPEN_BRACKET = 0x01;
	final static int CLOSE_BRACKER = 0x02;
}
