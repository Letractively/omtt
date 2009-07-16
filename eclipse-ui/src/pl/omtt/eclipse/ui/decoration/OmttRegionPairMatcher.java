package pl.omtt.eclipse.ui.decoration;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

import pl.omtt.eclipse.ui.partitioner.OmttPartitioner;
import pl.omtt.eclipse.ui.partitioner.PartitionTagNode;
import pl.omtt.eclipse.ui.partitioner.PositionInParitionNode;

public class OmttRegionPairMatcher implements IRegionPairMatcher {

	@Override
	public IRegion match(IDocument document, int offset) {
		IDocumentPartitioner partitioner = document.getDocumentPartitioner();

		if (partitioner instanceof OmttPartitioner) {
			PositionInParitionNode pos = ((OmttPartitioner) partitioner)
					.getPositionInNode(offset - 1);

			if (pos == null)
				return null;

			if (pos.fNode instanceof PartitionTagNode) {
				PartitionTagNode node = (PartitionTagNode) pos.fNode;

				if (node.isSingle() || node.getStickyEnd() > 0)
					return null;
				
				// Inside tag node always show end.
				// Check if char at position offset is in new line.
				try {
					int c = document.getChar(offset - 1);
					if (c == '\n' || c == '\r')
						return null;
				} catch (BadLocationException e) {
					return null;
				}

				if (pos.fOffset >= node.getIndentation()
						&& pos.fOffset < pos.fNode.getStartLength()) {
					return endRegion(offset, pos);
				} else if (pos.fOffset >= pos.fNode.getLength()
						- pos.fNode.getEndLength()) {
					return new Region(offset - pos.fOffset - 1 + node.getIndentation(),
							pos.fNode.getStartLength() - node.getIndentation());
				}
			}

			else {
				if (pos.fOffset < pos.fNode.getStartLength()) {
					return endRegion(offset, pos);
				} else if (pos.fOffset >= pos.fNode.getLength()
						- pos.fNode.getEndLength()) {
					return startRegion(offset, pos);
				}
			}
		}
		return null;
	}

	private IRegion startRegion(int offset, PositionInParitionNode pos) {
		return new Region(offset - pos.fOffset - 1, pos.fNode.getStartLength());
	}

	private IRegion endRegion(int offset, PositionInParitionNode pos) {
		int end = offset + pos.fNode.getLength() - pos.fOffset - pos.fNode.getEndLength();
		return new Region(end - 1, pos.fNode.getEndLength());
	}
}
