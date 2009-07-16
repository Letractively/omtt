package pl.omtt.eclipse.ui.partitioner;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.IDocumentPartitionerExtension;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.TypedRegion;

public class OmttPartitioner implements IDocumentPartitioner,
		IDocumentPartitionerExtension, Iterable<AbstractPartitionNode> {
	int DEBUG = 0;

	protected PartitionRootNode fRootNode;
	protected IDocument fDocument;

	@Override
	public ITypedRegion[] computePartitioning(int offset, int length) {

		List<TypedRegion> list = new ArrayList<TypedRegion>();

		long tic = System.nanoTime();
		fRootNode.collectRegions(list, offset, length);
		long toc = System.nanoTime();

		if (DEBUG > 0)
			System.out.printf("computePartitioning %d %d ... %d ns\n", offset,
					length, toc - tic);

		if (DEBUG > 1) {
			for (TypedRegion region : list)
				System.out.printf("region %s: %d -> %d\n", region.getType(),
						region.getOffset(), region.getLength());
			System.out.println("---");
		}
		return list.toArray(new ITypedRegion[list.size()]);
	}

	@Override
	public void connect(IDocument document) {
		assert fDocument == null;
		fDocument = document;

		fRootNode = new PartitionRootNode();
		fRootNode.textChanged(document, 0, 0, document.getLength());
	}

	@Override
	public void disconnect() {
		assert fDocument != null;
		fDocument = null;
		fRootNode = null;
	}

	@Override
	public void documentAboutToBeChanged(DocumentEvent event) {
		if (DEBUG > 1)
			System.out.println("documentAboutToBeChanged " + event);
	}

	@Override
	public IRegion documentChanged2(DocumentEvent event) {
		long tic = System.nanoTime();
		IRegion region = fRootNode.textChanged(event.getDocument(), event
				.getOffset(), event.getLength(), event.getText().length());
		long toc = System.nanoTime();

		if (DEBUG > 0)
			System.out.printf("documentChanged2 ... %d ns = %s\n", toc - tic,
					region.toString());
		return region;
	}

	@Override
	public boolean documentChanged(DocumentEvent event) {
		if (DEBUG > 0)
			System.out.println("documentChanged");
		return this.documentChanged2(event) != null;
	}

	@Override
	public String getContentType(int position) {
		if (DEBUG > 0)
			System.out.printf("getContentType %d\n", position);
		return this.getPartition(position).getType();
	}

	@Override
	public String[] getLegalContentTypes() {
		return TextUtilities.copy(CONTENT_TYPES);
	}

	@Override
	public ITypedRegion getPartition(int position) {
		long tic = System.nanoTime();
		TypedRegion region = fRootNode.getRegion(position);
		long toc = System.nanoTime();

		if (DEBUG > 0)
			System.out.printf("getPartition %d ... %d ns = %s %d %d\n",
					position, toc - tic, region.getType().toString(), region
							.getOffset(), region.getLength());
		return region;
	}

	public PositionInParitionNode getPositionInNode(int offset) {
		return fRootNode.findPositionInNode(offset);
	}

	public PartitionRootNode getRootNode() {
		return fRootNode;
	}

	public TreeIterator<AbstractPartitionNode> iterator () {
		return new TreeIterator<AbstractPartitionNode> (fRootNode);
	}

	public final static String DATA = "__OMTT_Data";
	public final static String STRING = "__OMTT_String";
	public final static String EXPRESSION = "__OMTT_Expression";
	public static final String TAG = "__OMTT_Tag";
	public final static String COMMENT = "__OMTT_Comment";
	public final static String JAVADOC = "__OMTT_Javadoc";
	public final static String[] CONTENT_TYPES = { DATA, STRING, EXPRESSION,
			TAG, COMMENT, JAVADOC };
}
