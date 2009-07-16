package pl.omtt.eclipse.ui.partitioner;

import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TypedRegion;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public class PartitionRootNode extends PartitionLAkTagCarefulNode {

	public PartitionRootNode() {
		super();
		this.fOffset = 0;
	}

	public void collectRegions(List<TypedRegion> list, int start, int length) {
		collectRegions(list, 0, start, start + length);
	}

	public TypedRegion getRegion(int position) {
		return getRegion(position, 0);
	}

	@Override
	protected int matchCharacter(IDocumentStream stream, int localOffset) {
		switch (stream.LA(1)) {
		case '%':
			if (stream.isNewLine()) {
				int rewind = stream.rewindToLineBegin();
				createChild(new PartitionTagNode(true), stream, localOffset - rewind);
			} else
				stream.consume();
			return MATCHED;
		case '/':
			int LA2 = stream.LA(2);
			if (LA2 == '/') {
				if (DEBUG > 10)
					System.out.printf("! creating normal comment at %d\n", localOffset);
				createChild(new PartitionCommentNode(false), stream, localOffset);
				return MATCHED;
			} else if (LA2 == '*') {
				createChild(new PartitionCommentNode(true), stream, localOffset);
				return MATCHED;
			}
		default:
			stream.consume();
			return MATCHED;
		}
	}

	@Override
	public int getStartLength() {
		return 0;
	}

	@Override
	public int getEndLength() {
		return 0;
	}

	@Override
	protected String getContentType() {
		return IDocument.DEFAULT_CONTENT_TYPE;
	}
}
