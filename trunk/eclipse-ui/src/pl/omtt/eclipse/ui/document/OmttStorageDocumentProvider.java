package pl.omtt.eclipse.ui.document;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.StorageDocumentProvider;

import pl.omtt.eclipse.ui.partitioner.OmttPartitioner;

/**
 * @see org.eclipse.ui.editors.text.StorageDocumentProvider#setupDocument(java.lang.Object,
 *      org.eclipse.jface.text.IDocument)
 */
public class OmttStorageDocumentProvider extends StorageDocumentProvider {
	@Override
	protected void setupDocument(Object element, IDocument document) {
		if (document != null) {
			IDocumentPartitioner partitioner = new OmttPartitioner();
			document.setDocumentPartitioner(partitioner);
			partitioner.connect(document);
		}
	}
}
