package pl.omtt.eclipse.ui.partitioner;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public class PartitionDataNode extends PartitionLAkTagCarefulNode {
	protected int fBracket;

	public PartitionDataNode(int bracket) {
		super();
		fBracket = bracket;
		if (fBracket == TAG)
			fStickyStart = 1;
		fStickyEnd = 1;
	}

	@Override
	protected int matchCharacter(IDocumentStream stream, int localOffset) {
		int LA1 = stream.LA(1);
		if (localOffset == 0) {
			if (fBracket == TAG) {
				// normal matching
			} else if (LA1 == fBracket) {
				stream.consume();
				return MATCHED;
			} else {
				return NO_MATCH;
			}
		}

		switch (LA1) {
		case '=':
			if(fBracket == '{' && localOffset == 1)
				return NO_MATCH;
			stream.consume();
			return MATCHED;
			
		case '\\':
			stream.consume(2);
			return MATCHED;

		case '%':
			if ((fBracket == TAG || fBracket == '{') && stream.isNewLine()) {
				int rewind = stream.rewindToLineBegin();
				int child = createChild(new PartitionTagNode(false), stream,
						localOffset - rewind);
				if (child < 0)
					return MATCHED_END;
				else
					return MATCHED;
			} else {
				stream.consume();
				return MATCHED;
			}

		case '}':
			stream.consume();
			if (fBracket == '{') {
				fStickyEnd = 0;
				return MATCHED_END;
			} else
				return MATCHED;

		case '"':
		case '\'':
			if (LA1 == fBracket) {
				stream.consume();
				fStickyEnd = 0;
				return MATCHED_END;
			} else {
				createChild(new PartitionDataNode(LA1), stream, localOffset);
				return MATCHED;
			}

		case '{':
			if (stream.LA(2) == '=')
				createChild(new PartitionExpressionNode(), stream, localOffset);
			else
				createChild(new PartitionDataNode('{'), stream, localOffset);
			return MATCHED;

		case '\n':
		case '\r':
			if (fBracket == '"' || fBracket == '\'') {
				fStickyEnd = 1;
				return MATCHED_END;
			} else {
				stream.consume();
				return MATCHED;
			}

		default:
			stream.consume();
			return MATCHED;
		}
	}

	@Override
	protected int lak () {
		return 2;
	}
	
	@Override
	public int getStartLength() {
		return fBracket == TAG ? 0 : 1;
	}

	public int getEndLength() {
		return fBracket == TAG || fStickyEnd > 0 ? 0 : 1;
	}

	@Override
	protected String getContentType() {
		if (fBracket == '"' || fBracket == '\'')
			return OmttPartitioner.STRING;
		else
			return OmttPartitioner.DATA;
	}

	public final static int TAG = '%';
}
