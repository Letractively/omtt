package pl.omtt.eclipse.ui.document;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.eclipse.ui.texteditor.IDocumentProvider;


public class OmttDocumentProvider extends TextFileDocumentProvider {

	OmttDocumentSetupParticipant fDocumentSetupParticipant;

	public OmttDocumentProvider() {
		super();

		IDocumentProvider provider = new TextFileDocumentProvider(
				new OmttStorageDocumentProvider());
		setParentDocumentProvider(provider);

		fDocumentSetupParticipant = new OmttDocumentSetupParticipant();
	}

	@Override
	protected FileInfo createFileInfo(Object element) throws CoreException {
		OmttFileInfo fileInfo = new OmttFileInfo(super.createFileInfo(element));

		IDocument document = fileInfo.fTextFileBuffer.getDocument();
		IFileEditorInput editorInput = element instanceof IFileEditorInput ? (IFileEditorInput) element
				: null;

		if (editorInput != null) {
			fileInfo.fOmttDocumentModel = new OmttDocumentModel(document, editorInput.getFile());
			fileInfo.fOmttDocumentModel.setEditor(editorInput, fileInfo.fModel);
		} else {
			fileInfo.fOmttDocumentModel = new OmttDocumentModel(document, null);
		}

		// Workaround for bug 72598.
		if (document.getDocumentPartitioner() == null)
			fDocumentSetupParticipant.setup(document);

		return fileInfo;
	}

	public OmttDocumentModel getOmttDocumentModel(Object element) {
		FileInfo fileInfo = getFileInfo(element);

		if (fileInfo instanceof OmttFileInfo)
			return ((OmttFileInfo) fileInfo).fOmttDocumentModel;

		return null;
	}

	public class OmttFileInfo extends FileInfo {
		public OmttDocumentModel fOmttDocumentModel;

		public OmttFileInfo(FileInfo fi) {
			fCachedReadOnlyState = fi.fCachedReadOnlyState;
			fCount = fi.fCount;
			fElement = fi.fElement;
			fModel = fi.fModel;
			fTextFileBuffer = fi.fTextFileBuffer;
			fTextFileBufferLocationKind = fi.fTextFileBufferLocationKind;
		}
	}
}
