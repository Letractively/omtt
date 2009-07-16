package pl.omtt.eclipse.ui.partitioner;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public class PartitionCommentNode extends PartitionLAkNode {
	protected boolean fMultiline;
	protected boolean fJavaDoc = false;

	public PartitionCommentNode(boolean multiline) {
		super();
		fMultiline = multiline;
		fStickyEnd = 0;
	}

	@Override
	public int getStartLength () {
		return fJavaDoc ? 3 : 2;
	}
	@Override
	public int getEndLength () {
		return fMultiline ? 2 : 0;
	}
	
	@Override
	protected int matchCharacter(IDocumentStream stream, int localOffset) {
		if (DEBUG > 2)
			System.out.printf("! matching comment %d %d\n", stream.index(),
					localOffset);
		int start = stream.index() - localOffset;

		// check Javadoc settings
		// localOffset == 1 means that something changed at position 2
		if (localOffset == 1) {
			int LA2 = stream.LA(2);
			if (LA2 == '*' && !fJavaDoc)
				return NO_MATCH;
			else if(LA2 != '*' && fJavaDoc)
				return NO_MATCH;
		}

		if (localOffset == 0)
			switch (stream.LA(1)) {
			case '/':
				int LA2 = stream.LA(2);
				if (LA2 == '/' && !fMultiline) {
					stream.consume(2);
					return MATCHED;
				} else if (LA2 == '*' && fMultiline) {
					stream.consume(2);
					return MATCHED;
				}
			default:
				return NO_MATCH;
			}

		else
			switch (stream.LA(1)) {
			case '*':
				if (fMultiline && stream.LA(2) == '/') {
					stream.consume(2);
					fStickyEnd = 0;
					return MATCHED_END;
				}
				break;
			case '\n':
			case '\r':
				if (!fMultiline) {
					stream.consume();
					fStickyEnd = 0;
					return MATCHED_END;
				}
				break;
			}

		if (stream.index() - start == 2) {
			if (stream.LA(1) == '*') {
				fJavaDoc = true;
			} else if (fJavaDoc)
				return NO_MATCH;
		}

		stream.consume();
		return MATCHED;
	}

	@Override
	protected String getContentType() {
		if (fJavaDoc)
			return OmttPartitioner.JAVADOC;
		else
			return OmttPartitioner.COMMENT;
	}
}
