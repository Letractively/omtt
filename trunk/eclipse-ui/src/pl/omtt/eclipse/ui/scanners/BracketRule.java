package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class BracketRule implements IRule {

	final int fStartBracket;
	final int fCloseBracket;
	final IToken fToken;
	
	public BracketRule (int startBracket, int closeBracket, IToken token) {
		fStartBracket = startBracket;
		fCloseBracket = closeBracket;
		fToken = token;
	}
	
	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		int LA1 = scanner.read();
		if(LA1 == fStartBracket || LA1 == fCloseBracket) {
			return fToken;
		} else {
			scanner.unread();
			return Token.UNDEFINED;
		}
	}

}
