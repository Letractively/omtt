package pl.omtt.eclipse.ui.partitioner;

import pl.omtt.eclipse.util.stream.IDocumentStream;

public abstract class PartitionLAkTagCarefulNode extends PartitionLAkNode {
	@Override
	protected int partition(IDocumentStream stream, int start, int stop,
			AbstractPartitionNode previousChild, AbstractPartitionNode followingChild) {

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
			int LA1 = stream.LA(1);
			if (LA1 == IDocumentStream.EOF) {
				fStickyEnd = 1;
				fLength = stream.index() - start;
				return MATCHED;
			}
			else if (stream.index() >= stop + lak() - 1 && stream.index() - start < fLength) {
				if (LA1 != ' ' && LA1 != '\t' && LA1 != '%')
					return MATCHED;
			}

			int match = matchCharacter(stream, stream.index() - start);

			if (DEBUG > 11)
				System.out
						.printf(
								"match ret:%d char:%c offset:%d localOffset:%d globalOffset:%d\n",
								match, (char)LA1, start, stream.index() - start, stream
										.index());

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
}
