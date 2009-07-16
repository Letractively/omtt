package pl.omtt.eclipse.ui.partitioner;

import org.antlr.runtime.Token;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public class PartitionTagNode extends AbstractPartitionNode {

	boolean fOuter = true;
	boolean fSingle = false;

	private int fStartLength = 0;
	private int fEndLength = 0;
	private int fIndentation;

	public PartitionTagNode() {
		this.fStickyEnd = 1;
	}

	public PartitionTagNode(boolean outer) {
		this();
		fOuter = outer;
	}

	public boolean isSingle() {
		return fSingle;
	}

	@Override
	public int getStartLength() {
		return fStartLength;
	}

	@Override
	public int getEndLength() {
		return fEndLength;
	}

	public int getIndentation() {
		return fIndentation;
	}

	@Override
	protected int partition(IDocumentStream stream, int start, int stop,
			AbstractPartitionNode previousChild, AbstractPartitionNode followingChild) {

		if (DEBUG > 10)
			System.out.println("% tag partition localOffset:" + (stream.index() - start)
					+ " outer:" + fOuter + " previousChild:" + previousChild);

		/*
		 * Phases: 0 - normal 1 - expecting TAG_INNER | TAG_END 2 - expecting
		 * TAG_START 3 - expecting TAG_START | TAG_INNER | TAG_END 4 - expecting
		 * TAG (TAG_INNER | TAG_END) 5 - expecting TAG TAG_START 6 - expecting
		 * TAG (TAG_START | TAG_INNER | TAG_END) 7 - expecting TAG
		 */
		int phase = 0;

		if (previousChild == null)
			stream.seek(start);
		else
			stream.seek(start + previousChild.fOffset + previousChild.fLength);

		if (previousChild == null) {
			phase = fOuter ? 6 : 5;
		} else if (previousChild instanceof PartitionDataNode) {
			PartitionDataNode node = (PartitionDataNode) previousChild;
			if (node.fBracket == PartitionDataNode.TAG) {
				phase = 4;
			}
		} else if (previousChild instanceof PartitionExpressionNode) {
			phase = 6;
		}

		/*
		 * Following child types: 0 - unknown 1 - no following child 2 - data
		 * block 3 - expression block 4 - data string
		 */
		int followingType = 0;
		if (followingChild == null) {
			followingType = 1;
		} else if (followingChild instanceof PartitionDataNode) {
			PartitionDataNode node = (PartitionDataNode) followingChild;
			if (node.fBracket == PartitionDataNode.TAG)
				followingType = 2;
			else
				followingType = 4;
		} else if (followingChild instanceof PartitionExpressionNode) {
			PartitionExpressionNode node = (PartitionExpressionNode) followingChild;
			if (node.fBlock)
				followingType = 3;
		}

		int tagStartIndex = 0, indentation = fIndentation;
		while (true) {
			Token token = stream.nextToken();
			int type = token.getType();

			if (type == IDocumentStream.EOF) {
				fLength = stream.index() - start;
				fStickyEnd = 1;
				return 1;
			}

			else if (phase > 3) {
				if (type == SimpleOmttTagLexer.TAG) {
					fSingle = false;
					tagStartIndex = stream.index() - token.getText().length();

					if (phase == 7) {
						phase = 0;
						continue;
					}

					if (phase > 4)
						indentation = stream.index() - start - 1;
					phase -= 3;

					continue;
				} else if (type == SimpleOmttTagLexer.TAG_SINGLE) {
					fSingle = true;
					tagStartIndex = stream.index() - token.getText().length();
					phase = 0;
					continue;
				} else {
					stream.seek(start);
					return -1;
				}
			}

			else if (phase > 0) {
				boolean inner = (type == SimpleOmttTagLexer.TAG_INNER || type == SimpleOmttTagLexer.TAG_END);
				if ((phase == 1 && !inner) || (phase == 2 && inner)) {
					stream.seek(start);
					return -1;
				}

				if (phase >= 2 && previousChild == null)
					fIndentation = indentation;

				phase = 0;
			}

			assert phase == 0;

			if (!fSingle)
				switch (type) {
				case SimpleOmttTagLexer.TAG_END:
					fLength = stream.index() - start;
					fEndLength = stream.index() - tagStartIndex;
					fStickyEnd = 0;
					return 1;

				case SimpleOmttTagLexer.NEWLINE:
					updateStartLength(stream, start);

					if (followingType == 2 && stream.index() >= stop
							&& followingChild.fOffset + start == stream.index())
						return 1;

					createChild(new PartitionDataNode(PartitionDataNode.TAG), stream,
							stream.index() - start);
					phase = 4;
					break;

				case SimpleOmttTagLexer.EXPRESSION_NEWLINE:
					updateStartLength(stream, start);

					if (followingType == 3 && stream.index() >= stop
							&& followingChild.fOffset + start == stream.index())
						return 1;

					// System.out.println("expr tag");
					createChild(new PartitionExpressionNode(true), stream, stream.index()
							- start);
					// System.out.println("ret " + stream.LA(1) + " " + (int)' '
					// + " " + (int) '%');
					phase = 7;
					break;
				}

			else
				// if (fSingle)
				switch (type) {
				case SimpleOmttTagLexer.NEWLINE:
				case SimpleOmttTagLexer.EXPRESSION_NEWLINE:
					fLength = stream.index() - start;
					fEndLength = stream.index() - tagStartIndex;
					fStickyEnd = 0;
					return 1;
				}

			switch (type) {
			case SimpleOmttTagLexer.DATA_PAREN:
			case SimpleOmttTagLexer.LEFT_DATA_PAREN:
				stream.seek(stream.index() - 1);
				if (followingType == 4 && stream.index() >= stop
						&& followingChild.fOffset + start == stream.index())
					return 1;

				createChild(new PartitionDataNode(stream.LA(1)), stream, stream.index()
						- start);
				break;
			} // switch
		} // while (true)
	}

	private void updateStartLength(IDocumentStream stream, int startIndex) {
		stream.mark();
		stream.seek(startIndex);

		for (;;) {
			int LA1 = stream.LA(1);
			switch (LA1) {
			case '\n':
			case '\r':
			case IDocumentStream.EOF:
				break;

			default:
				stream.consume();
				continue;
			}
			break;
		}

		fStartLength = stream.index() - startIndex;

		stream.rewind();
	}

	@Override
	protected String getContentType() {
		return OmttPartitioner.TAG;
	}
}
