package pl.omtt.eclipse.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;

import pl.omtt.eclipse.ui.scanners.ITokens;

public class OmttUIPreferenceInitializer extends AbstractPreferenceInitializer {
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = OmttUI.getDefault().getPreferenceStore();

//		EditorsUI.useAnnotationsPreferencePage(store);
//		EditorsUI.useQuickDiffPreferencePage(store);

		initializeTokenPreferences(store);
		initializeBracketPreferences(store);

		store.setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH, 2);
		store.setDefault(IOmttPreferenceConstants.FOLDING, true);
System.err.println("initializing " + store.getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH));
	}

	private void initializeTokenPreferences(IPreferenceStore store) {
		PreferenceConverter.setDefault(store, ITokens.COMMENT, new RGB(63, 127,
				95));
		PreferenceConverter.setDefault(store, ITokens.COMMENT_JAVADOC, new RGB(
				63, 63, 191));

		PreferenceConverter.setDefault(store, ITokens.DATA_DEFAULT, new RGB(
				104, 104, 104));
		PreferenceConverter.setDefault(store, ITokens.DATA_STRING, new RGB(170,
				137, 30));
		PreferenceConverter.setDefault(store, ITokens.DATA_XML_TAG_NAME,
				new RGB(104, 104, 104));
		PreferenceConverter.setDefault(store, ITokens.DATA_EXPR_BRACKET,
				new RGB(140, 0, 0));
		store.setDefault(ITokens.DATA_XML_TAG_NAME
				+ IOmttPreferenceConstants.BOLD_SUFFIX, true);

		PreferenceConverter.setDefault(store, ITokens.EXPR_DEFAULT, new RGB(0,
				0, 0));
		PreferenceConverter.setDefault(store, ITokens.EXPR_KEYWORD, new RGB(
				140, 0, 0));
		PreferenceConverter.setDefault(store, ITokens.EXPR_KEYWORD_IT, new RGB(
				0, 0, 0));
		PreferenceConverter.setDefault(store, ITokens.EXPR_NUMBER, new RGB(0,
				0, 104));
		PreferenceConverter.setDefault(store, ITokens.EXPR_CLASS, new RGB(0, 0,
				104));
		store.setDefault(ITokens.EXPR_KEYWORD
				+ IOmttPreferenceConstants.BOLD_SUFFIX, true);
		store.setDefault(ITokens.EXPR_KEYWORD_IT
				+ IOmttPreferenceConstants.ITALIC_SUFFIX, true);
		store.setDefault(ITokens.EXPR_CLASS
				+ IOmttPreferenceConstants.ITALIC_SUFFIX, true);

		PreferenceConverter.setDefault(store, ITokens.TAG_OPEN_CHAR, new RGB(
				140, 0, 0));
		PreferenceConverter.setDefault(store, ITokens.TAG_NAME,
				new RGB(0, 0, 0));
		PreferenceConverter.setDefault(store, ITokens.TAG_OUTPUT_MODIFIER,
				new RGB(140, 0, 0));
		store.setDefault(ITokens.TAG_NAME
				+ IOmttPreferenceConstants.BOLD_SUFFIX, true);
	}

	private void initializeBracketPreferences(IPreferenceStore store) {
		store.setDefault(IOmttPreferenceConstants.MATCHING_BRACKETS, true);
		PreferenceConverter.setDefault(store,
				IOmttPreferenceConstants.MATCHING_BRACKETS_COLOR, new RGB(160,
						160, 160));
	}
}
