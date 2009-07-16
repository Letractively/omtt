package pl.omtt.eclipse.ui.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;

public class DataScanner extends RuleBasedScanner {
	
	public DataScanner (TokenProvider tokenProvider) {
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new XmlNameRule(tokenProvider.get(ITokens.DATA_XML_TAG_NAME)));
		this.setRules(rules.toArray(new IRule[rules.size()]));

		this.setDefaultReturnToken(tokenProvider.get(ITokens.DATA_DEFAULT));
	}
}
