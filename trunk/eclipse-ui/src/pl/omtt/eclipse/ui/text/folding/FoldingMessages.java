package pl.omtt.eclipse.ui.text.folding;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class FoldingMessages {
	private static final String BUNDLE_NAME= "pl.omtt.eclipse.ui.text.folding.FoldingMessages";

	private static final ResourceBundle RESOURCE_BUNDLE= ResourceBundle.getBundle(BUNDLE_NAME);

	private FoldingMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
	public static ResourceBundle getResourceBundle() {
		return RESOURCE_BUNDLE;
	}
	
	public static String getFormattedString(String key, Object arg) {
		return getFormattedString(key, new Object[] { arg });
	}
	
	public static String getFormattedString(String key, Object[] args) {
		return MessageFormat.format(getString(key), args);	
	}	
}
