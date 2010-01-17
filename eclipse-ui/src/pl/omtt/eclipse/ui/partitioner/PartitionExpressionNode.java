package pl.omtt.eclipse.ui.partitioner;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public class PartitionExpressionNode extends PartitionLAkTagCarefulNode {
	boolean fBlock = false;

	public PartitionExpressionNode() {
		super();
	}

	public PartitionExpressionNode(boolean block) {
		fBlock = block;
		if (fBlock) {
			fStickyStart = 1;
			fStickyEnd = 1;
		}
	}

	@Override
	protected int matchCharacter(IDocumentStream stream, int localOffset) {
		switch (stream.LA(1)) {
		case '}':
			if (!fBlock) {
				stream.consume();
				fStickyEnd = 0;
				return MATCHED_END;
			} else {
				stream.consume();
				return MATCHED;
			}

		case '%':
			if (fBlock && stream.isNewLine()) {
				stream.rewindToLineBegin();
				return MATCHED_END;
			} else {
				stream.consume();
				return MATCHED;
			}

		case '{':
			if (stream.LA(2) == '=') {
				stream.consume(2);
				return MATCHED;
			} else if (!fBlock && localOffset == 0) {
				return NO_MATCH;
			}
		case '"':
		case '\'':
			createChild(new PartitionDataNode(stream.LA(1)), stream,
					localOffset);
			return MATCHED;

		default:
			stream.consume();
			return MATCHED;
		}
	}

	@Override
	public int getStartLength() {
		return fBlock ? 0 : 2;
	}

	@Override
	public int getEndLength() {
		return fBlock || fStickyEnd > 0 ? 0 : 1;
	}

	@Override
	protected String getContentType() {
		return OmttPartitioner.EXPRESSION;
	}
}
