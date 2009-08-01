package pl.omtt.eclipse.ui.scanners;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;

import pl.omtt.eclipse.ui.IOmttPreferenceConstants;
import pl.omtt.eclipse.ui.editor.OmttColorProvider;

public class TokenProvider implements IPropertyChangeListener {
	private IPreferenceStore fPreferenceStore;
	private OmttColorProvider fColorProvider;
	private Map<String, Token> fCachedTokens = new HashMap<String, Token>();

	public TokenProvider(IPreferenceStore store, OmttColorProvider colorProvider) {
		fPreferenceStore = store;
		fColorProvider = colorProvider;
		fPreferenceStore.addPropertyChangeListener(this);
	}

	private Token createToken(String token) {
		RGB color = PreferenceConverter.getColor(fPreferenceStore, token);

		if (color == null)
			return new Token(new TextAttribute(fColorProvider.getColor(new RGB(
					0, 0, 0))));

		int style = 0;
		if (fPreferenceStore.getBoolean(token + IOmttPreferenceConstants.BOLD_SUFFIX))
			style |= SWT.BOLD;
		if (fPreferenceStore.getBoolean(token + IOmttPreferenceConstants.ITALIC_SUFFIX))
			style |= SWT.ITALIC;

		return new Token(new TextAttribute(fColorProvider.getColor(color),
				null, style));
	}

	public Token get(String token) {
		if (fCachedTokens.containsKey(token))
			return fCachedTokens.get(token);

		Token t = createToken(token);
		fCachedTokens.put(token, t);
		return t;
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		fCachedTokens.clear();
	}
}
