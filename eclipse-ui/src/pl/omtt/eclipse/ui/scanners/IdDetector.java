package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.IWordDetector;

public final class IdDetector implements IWordDetector {
	@Override
	public boolean isWordPart(char c) {
		return isIdChar(c);
	}

	@Override
	public boolean isWordStart(char c) {
		return isIdChar(c) || c == '@';
	}

	public static boolean isIdChar(int c) {
		return Character.isLetterOrDigit(c) || c == '_';
	}
}
