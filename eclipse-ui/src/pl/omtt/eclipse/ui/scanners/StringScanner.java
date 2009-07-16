package pl.omtt.eclipse.ui.scanners;

import org.eclipse.jface.text.rules.RuleBasedScanner;

public class StringScanner extends RuleBasedScanner {
	public StringScanner(TokenProvider provider) {
		this.setDefaultReturnToken(provider.get(ITokens.DATA_STRING));
	}
}
