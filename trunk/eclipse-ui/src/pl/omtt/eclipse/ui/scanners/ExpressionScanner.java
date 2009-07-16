package pl.omtt.eclipse.ui.scanners;

import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class ExpressionScanner extends AbstractExpressionScanner {
	public ExpressionScanner(TokenProvider tokenProvider) {
		super(tokenProvider);
	}

	@Override
	protected void setupRules(List<IRule> rules, TokenProvider tokenProvider) {
		super.setupRules(rules, tokenProvider);
		rules.add(new BracketRule('{', '}', tokenProvider.get(ITokens.DATA_EXPR_BRACKET)));		
	}
	
	public class TagOpenCharRule implements IRule {
		IToken fToken;
		
		public TagOpenCharRule (IToken token) {
			fToken = token;
		}

		@Override
		public IToken evaluate(ICharacterScanner scanner) {
			if (scanner.read() == '%') {
				return fToken;
			}
			else {
				scanner.unread();
				return Token.UNDEFINED;
			}
		}		
	}
}
