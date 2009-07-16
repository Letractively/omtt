package pl.omtt.lang.model.ast;

public interface IFoldExpression extends IExpression {
	boolean isItemSequence();

	public IExpression getBaseNode();
}
