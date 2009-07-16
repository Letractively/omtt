package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.RuleBasedScanner;

public class CommentScanner extends RuleBasedScanner {
	public CommentScanner(TokenProvider tokenProvider) {
		this.setDefaultReturnToken(tokenProvider.get(ITokens.COMMENT));
	}
}
