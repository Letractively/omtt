package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.RuleBasedScanner;

public class JavaDocScanner extends RuleBasedScanner {
	public JavaDocScanner(TokenProvider tokenProvider) {
		this.setDefaultReturnToken(tokenProvider.get(ITokens.COMMENT_JAVADOC));
	}
}
