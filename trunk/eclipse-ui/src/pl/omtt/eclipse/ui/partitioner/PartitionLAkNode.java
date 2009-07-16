package pl.omtt.eclipse.ui.partitioner;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public abstract class PartitionLAkNode extends AbstractPartitionNode {
	@Override
	protected int partition(IDocumentStream stream, int start, int stop,
			AbstractPartitionNode previousChild,
			AbstractPartitionNode followingChild) {

		if (stop < 0 || stop - start + getEndLength() >= fLength)
			stop = stream.size();

		if (stream.index() > start
				&& (previousChild == null || previousChild.fOffset
						+ previousChild.fLength < stream.index() - start))
			// start from the previous character
			stream.seek(stream.index() - 1);

		if (DEBUG > 2)
			System.out
					.printf(
							". partition localOffset:%d start:%d stop:%d streamOffset:%d\n",
							stream.index() - start, start, stop, stream.index());

		while (true) {
			if (stream.index() >= stop + lak() - 1
					&& stream.index() - start < fLength) {
				return MATCHED;
			} else if (stream.LA(1) == IDocumentStream.EOF) {
				fStickyEnd = 1;
				fLength = stream.index() - start;
				return MATCHED;
			}

			int match = matchCharacter(stream, stream.index() - start);

			if (DEBUG > 11)
				System.out
						.printf(
								"match i:%d char:%d localOffset:%d globalOffset:%d %s\n",
								start, match, stream.index() - start, stream
										.index(), this.getClass().toString());

			switch (match) {
			case NO_MATCH:
				stream.seek(start);
				return NO_MATCH;
			case MATCHED_END:
				fLength = stream.index() - start;
				return MATCHED_END;
			}
		}
	}

	/**
	 * Look-Ahead k parameter. By default set to 1.
	 * 
	 * @return k parameter of node
	 */
	protected int lak() {
		return 1;
	}

	abstract protected int matchCharacter(IDocumentStream stream,
			int localOffset);

	protected static final int NO_MATCH = -1;
	protected static final int MATCHED = 1;
	protected static final int MATCHED_END = 2;
}
