package pl.omtt.eclipse.ui.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

public abstract class AbstractExpressionScanner extends RuleBasedScanner {

	public AbstractExpressionScanner (TokenProvider tokenProvider) {
		List<IRule> rules = new ArrayList<IRule>();
		setupRules(rules, tokenProvider);		
		this.setRules(rules.toArray(new IRule[rules.size()]));
		this.setDefaultReturnToken(tokenProvider.get(defaultToken()));
	}
	
	protected void setupRules (List<IRule> rules, TokenProvider tokenProvider) {
		rules.add(new KeywordRule(tokenProvider.get(ITokens.EXPR_KEYWORD),
				tokenProvider.get(ITokens.EXPR_KEYWORD_IT)));

		rules.add(new ClassIdRule(tokenProvider.get(ITokens.EXPR_CLASS)));
		rules.add(new NumberRule(tokenProvider.get(ITokens.EXPR_NUMBER)));
		rules.add(new WordRule(new IdDetector(), tokenProvider.get(ITokens.EXPR_IDENT)));
	}

	protected String defaultToken () {
		return ITokens.EXPR_DEFAULT;
	}

	public final static class ClassIdRule implements IRule {
		Token fToken;
		
		public ClassIdRule(Token token) {
			fToken = token;
		}
		
		@Override
		public IToken evaluate(ICharacterScanner scanner) {
			int LA1 = scanner.read();
			if (LA1 < 'A' || LA1 > 'Z') {
				scanner.unread();
				return Token.UNDEFINED;
			}

			LA1 = scanner.read();
			while(LA1 != ICharacterScanner.EOF && Character.isLetter(LA1))
				LA1 = scanner.read();
			if (LA1 != '*')
				scanner.unread();
			return fToken;
		}

	}

	public final static class KeywordRule extends WordRule {
		private static final String[] KEYWORDS =
		{ "def", "and", "in", "end",
		  "if", "else", "map",
		  "match", "case", "default",
		  "is", "as",
		  "module", "use", "import",
		  "or", "xor", "not"
		};

		private static final String[] VALUE_KEYWORDS =
		{ "it" };

		public KeywordRule(Token keywordToken, Token valueKeywordToken) {
			super(new IdDetector());

			for (String keyword : KEYWORDS) {
				this.addWord(keyword, keywordToken);
			}

			for (String keyword : VALUE_KEYWORDS) {
				this.addWord(keyword, valueKeywordToken);
			}
		}
	}
}
