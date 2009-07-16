package pl.omtt.eclipse.ui.scanners;

import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

public class TagScanner extends AbstractExpressionScanner {
	public TagScanner(TokenProvider tokenProvider) {
		super(tokenProvider);
	}

	@Override
	protected void setupRules(List<IRule> rules, TokenProvider tokenProvider) {
		super.setupRules(rules, tokenProvider);
		
		rules.add(new WordRule(new OpenCharDetector(),
				tokenProvider.get(ITokens.TAG_OPEN_CHAR)));
		rules.add(new OutputModifierDetector(tokenProvider.get(ITokens.TAG_OUTPUT_MODIFIER)));
	}
	
	public class OpenCharDetector implements IWordDetector {
		@Override
		public boolean isWordPart(char c) {
			return false;
		}

		@Override
		public boolean isWordStart(char c) {
			return c == '%';
		}
	}
	
	public class OutputModifierDetector implements IRule {
		IToken fToken;
		
		OutputModifierDetector(IToken token) {
			fToken = token;
		}
		
		@Override
		public IToken evaluate(ICharacterScanner scanner) {
			switch(scanner.read()) {
			case '"':
			case '=':
				switch(scanner.read()) {
				case '\n':
				case '\r':
					scanner.unread();
					return fToken;
				default:
					scanner.unread();
					scanner.unread();
					return Token.UNDEFINED;
				}

			default:
				scanner.unread();
				return Token.UNDEFINED;
			}
		}
		
	}
}
