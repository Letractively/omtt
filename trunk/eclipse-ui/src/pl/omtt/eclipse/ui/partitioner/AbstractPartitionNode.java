package pl.omtt.eclipse.ui.partitioner;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TypedRegion;

import pl.omtt.eclipse.util.stream.DocumentRawStream;
import pl.omtt.eclipse.util.stream.IDocumentStream;

abstract public class AbstractPartitionNode extends
		AbstractTreeNode<AbstractPartitionNode> {

	protected int fStickyStart = 0;
	protected int fStickyEnd = 0;

	public int getStickyStart() {
		return fStickyStart;
	}

	public int getStickyEnd() {
		return fStickyEnd;
	}

	public IRegion textChanged(IDocument document, int offset, int oldLength,
			int newLength) {

		IDocumentStream stream = new DocumentRawStream(document,
				new SimpleOmttTagLexer());

		IRegion region = update(stream, offset, oldLength, newLength);
		if (DEBUG > 1)
			System.out.println("# returned " + region);
		return region;
	}

	public int getStartLength() {
		return 1;
	}

	public int getEndLength() {
		return 1;
	}

	protected int locateRepartitionLength(int offset, int length) {
		if (fLength - getEndLength() < offset + length)
			return -1;
		else
			return length;
	}

	protected IRegion update(IDocumentStream stream, int localOffset,
			int oldLength, int newLength) {

		if (DEBUG == 3) {
			System.out
					.printf(
							"# update localOffset:%d, oldLength:%d, newLength:%d streamIndex:%d\n",
							localOffset, oldLength, newLength, stream.index());
		}

		/*
		 * gapLength: correction of offset for areas lying after localOffset +
		 * newLength updated: area of updated partitioning waiting: area which
		 * we recognized that should be partitioned or -1 if not exist (expected
		 * value at the end of algorithm)
		 */
		int gapLength = oldLength - newLength, updatedStart = -1, updatedLength = -1, waitingStart = localOffset, waitingLength = locateRepartitionLength(
				waitingStart, newLength), streamOffset = stream.index();

		fLength -= gapLength;

		List<AbstractPartitionNode> oldChildren = fChildren;
		fChildren = new ArrayList<AbstractPartitionNode>(oldChildren.size());

		for (int i = 0; i <= oldChildren.size(); i++)
		// i == oldChildren.size() is a special token meaning END
		{
			AbstractPartitionNode child = i < oldChildren.size() ? oldChildren
					.get(i) : null;

			if (DEBUG == 3) {
				System.out.println("* inside child " + i + ": " + child + " "
						+ this);
				System.out.printf("  waiting: %d - %d\n", waitingStart,
						waitingLength);
			}

			if (child != null
					&& child.fOffset + child.fLength + child.fStickyEnd <= waitingStart)
			// whole the child lies before area of change, so we do nothing
			{
				if (DEBUG == 3)
					System.out.println("  before");

				if (child.fOffset >= updatedStart + updatedLength)
					fChildren.add(child);

				continue;
			}

			else if (child != null && waitingStart >= 0
					&& waitingStart > child.fOffset - child.fStickyStart
					&& updatedStart + updatedLength < child.fOffset)
			// area of change begins _inside_ the child
			// (if we are lucky all we have to do is to tell the child about it)
			{
				assert waitingStart < child.fOffset + child.fLength;

				if (DEBUG == 3)
					System.out.println("  inside");

				int oldChildLength = child.fLength - gapLength;

				if (DEBUG > 2)
					System.out
							.printf(
									"  gonna update child length:%d correctedLength:%d...\n",
									child.fLength, oldChildLength);
				stream.seek(streamOffset + child.fOffset);
				IRegion updatedRegion = child.update(stream, localOffset
						- child.fOffset, oldLength, newLength);

				if (updatedRegion == null)
				// child should be deleted
				{
					waitingStart = child.fOffset;
					waitingLength = locateRepartitionLength(child.fOffset, Math
							.max(child.fLength, localOffset + newLength
									- child.fOffset));
				} else
				// child updated itself
				{
					fChildren.add(child);

					updatedStart = child.fOffset + updatedRegion.getOffset();
					updatedLength = updatedRegion.getLength();

					if (DEBUG > 2)
						System.out
								.printf(
										"  ...done: childLength:%d waitingStart:%d waitingLength:%d updatedStart:%d updatedLength:%d\n",
										child.fLength, waitingStart,
										waitingLength, updatedStart,
										updatedLength);

					if (updatedStart + updatedLength < waitingStart
							+ waitingLength)
					// not the whole waiting region was repartitioned
					{
						if (DEBUG > 2)
							System.out
									.println("  not the whole waiting region was repartitioned");
						waitingStart = updatedStart + updatedLength;
						waitingLength = waitingLength - updatedLength;
						if (child.fOffset + oldChildLength > waitingStart
								+ waitingLength)
						// in addition, child lowered its size
						{
							waitingLength = child.fOffset + oldChildLength
									- waitingStart;
						}
					}

					else if (child.fLength < oldChildLength)
					// child lowered its length, we need to repartition the rest
					{
						if (DEBUG > 2)
							System.out
									.println("  child lowered its length, we need to repartition the rest");
						waitingStart = child.fOffset + child.fLength;
						waitingLength = oldChildLength - child.fLength;
					}

					else
					// Whole the waiting region was repartitioned by child...
					{
						if (DEBUG > 2)
							System.out
									.println("  whole the waiting region was repartitioned by child");
						int repartitionLength = locateRepartitionLength(
								updatedStart + updatedLength, 0);
						if (repartitionLength == 0)
						// ... and everything is done.
						{
							waitingStart = waitingLength = -1;
						} else
						// ... and repartitioned critical fragment of our node.
						{
							waitingStart = updatedStart + updatedLength;
							waitingLength = repartitionLength;
						}
					}
				}

				continue;
			}

			else if (waitingStart >= 0)
			// we found area that lies strictly in our node
			// (i.e. outside any of our children) and needs updating
			{
				assert child == null || waitingStart <= child.fOffset;

				if (child != null)
					child.fOffset -= gapLength;

				if (DEBUG == 3)
					System.out.printf("  outside\n");

				stream.seek(streamOffset + waitingStart);
				int stop = waitingLength >= 0 ? streamOffset + waitingStart
						+ waitingLength : -1;
				int result = partition(stream, streamOffset, stop,
						getLastChild(), child);
				if (result < 0)
				// our node should be deleted
				{
					System.out.println("# i'm gonna be deleted");
					return null;
				}

				if (updatedStart < 0) {
					updatedStart = waitingStart;
					updatedLength = stream.index() - streamOffset
							- waitingStart;
				} else {
					updatedLength += stream.index() - streamOffset
							- waitingStart;
				}

				waitingStart = waitingLength = -1;
			}

			else if (child != null) {
				assert waitingStart < 0;
				child.fOffset -= gapLength;
			}

			if (child == null)
				// all is done!
				break;

			// main part was done
			// lastly we update the offset of the current child
			// note that there is no waiting area
			assert child != null && waitingStart < 0 && updatedLength >= 0;

			if (child.fOffset >= fLength)
			// just drop the child
			{
				continue;
			}

			else if (child.fOffset < updatedStart + updatedLength)
			// child covers repartitioned region, so we remove it
			{
				waitingStart = updatedStart + updatedLength;
				waitingLength = child.fOffset + child.fLength - waitingStart;

				if (waitingLength <= 0)
					waitingStart = waitingLength = -1;
			}

			else {
				fChildren.add(child);
			}
		}

		if (DEBUG > 1)
			System.out.println("# update ended");
		return new Region(updatedStart, updatedLength);
	}

	protected int createChild(AbstractPartitionNode node,
			IDocumentStream stream, int localOffset) {
		if (DEBUG > 1)
			System.out.printf("# creating child %s at offset %d, global %d\n",
					node.getClass().toString(), localOffset, stream.index());

		node.fOffset = localOffset;
		int result = node.partition(stream);
		if (result >= 0)
			fChildren.add(node);
		return result;
	}

	/**
	 * Partitions the node from the beginning. Updates node parameters.
	 * 
	 * @see AbstractPartitionNode#partition(IDocument, int, int, int, int)
	 */
	private int partition(IDocumentStream stream) {
		fChildren = new ArrayList<AbstractPartitionNode>();
		return partition(stream, stream.index(), -1, null, null);
	}

	/**
	 * Raw method that repartitions given area in specific for the node way.<br/>
	 * <u>Warning</u>: Doesn't care about node parameters such as offset, length
	 * and children array.
	 * 
	 * @param document
	 *            partitioning document
	 * @param localOffset
	 *            offset of partitioning start within node
	 * @param globalOffset
	 *            offset of partitioning start within document
	 * @param length
	 *            expecting length of text to partition, may be -1 when
	 *            expecting to partition to the end of the node
	 * @param previousChild
	 * @param followingChild
	 * @return partitioning information
	 */
	abstract protected int partition(IDocumentStream stream, int start,
			int stop, AbstractPartitionNode previousChild,
			AbstractPartitionNode followingChild);

	abstract protected String getContentType();

	public String toString() {
		return "(" + fOffset + " : " + fLength + ", type " + getContentType()
				+ ", sticky end:" + fStickyEnd + ")";
	}

	public PositionInParitionNode findPositionInNode(int offset) {
		if (offset < 0 || offset > fLength)
			return null;

		AbstractPartitionNode child = findUpperChild(offset);
		if (child != null && child.contains(offset))
			return child.findPositionInNode(offset - child.fOffset);
		else
			return new PositionInParitionNode(this, offset);
	}

	protected void collectRegions(List<TypedRegion> list, int startOffset,
			int start, int end) {
		if (0 >= end || fLength <= start)
			return;

		int i = 0;
		for (AbstractPartitionNode child : fChildren) {
			if (DEBUG > 1) {
				// System.out.printf("## collection %s", child.toString());
				System.out.printf("## collection %d:%d \t%s \tsticky:%d\n",
						startOffset + child.fOffset, child.fLength, child
								.getContentType(), child.fStickyEnd);
			}

			if (child.fOffset > i && child.fOffset > start && i < end) {
				list.add(new TypedRegion(startOffset + i, child.fOffset - i,
						getContentType()));
			}
			child.collectRegions(list, startOffset + child.fOffset, start
					- child.fOffset, end - child.fOffset);
			i = child.fOffset + child.fLength;
		}
		if (fLength > i && fLength > start && i < end) {
			list.add(new TypedRegion(startOffset + i, fLength - i,
					getContentType()));
		}
	}

	protected TypedRegion getRegion(int position, int globalOffset) {
		AbstractPartitionNode lowerChild, upperChild;
		upperChild = findUpperChild(position);
		lowerChild = findLowerChild(position);

		if (lowerChild == null && upperChild == null) {
			return new TypedRegion(globalOffset, fLength, getContentType());
		} else if (lowerChild == upperChild) {
			int nposition = position - upperChild.fOffset;
			int noffset = globalOffset + upperChild.fOffset;
			return upperChild.getRegion(nposition, noffset);
		} else if (lowerChild == null) {
			return new TypedRegion(globalOffset, upperChild.fOffset,
					getContentType());
		} else if (upperChild == null) {
			int offset = lowerChild.fOffset + lowerChild.fLength;
			int length = fLength - offset;
			return new TypedRegion(globalOffset + offset, length,
					getContentType());
		} else {
			int offset = lowerChild.fOffset + lowerChild.fLength;
			int length = upperChild.fOffset - offset;
			return new TypedRegion(globalOffset + offset, length,
					getContentType());
		}
	}
}
