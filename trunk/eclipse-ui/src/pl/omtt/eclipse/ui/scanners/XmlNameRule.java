package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class XmlNameRule implements IRule {
	final IToken fToken;
	
	public XmlNameRule (IToken token) {
		fToken = token;
	}
	
	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		scanner.unread();
		switch(scanner.read()) {
		case '<':
			break;
		default:
			return Token.UNDEFINED;
		}
		
		int LA1 = scanner.read();
		if ((LA1 < 'a' || LA1 > 'z') && LA1 != '/') {
			scanner.unread();
			return Token.UNDEFINED;
		}
		
		while((LA1 = scanner.read()) != ICharacterScanner.EOF) {
			if(LA1 == ' ' || LA1 == '\t' || LA1 == '\n' || LA1 == '\r' || LA1 == '>')
				break;
		}

		scanner.unread();
		return fToken;
	}

}
