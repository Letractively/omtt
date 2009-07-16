package pl.omtt.eclipse.ui.partitioner;

public class PositionInParitionNode {
	public AbstractPartitionNode fNode;
	public int fOffset;

	public PositionInParitionNode (AbstractPartitionNode node, int offset) {
		fNode = node;
		fOffset = offset;
	}
}
