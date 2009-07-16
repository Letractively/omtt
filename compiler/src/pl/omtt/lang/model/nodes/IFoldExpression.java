package pl.omtt.lang.model.nodes;

public interface IFoldExpression extends IExpression {
	boolean isItemSequence();

	public IExpression getBaseNode();
}
