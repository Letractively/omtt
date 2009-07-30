package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NullType;
import pl.omtt.lang.model.types.TypeUnifier;

public class Sequence extends CommonNode implements IExpression, IVisitable {
	IType fType;

	public Sequence(int token) {
		super(new CommonToken(token, "sequence"));
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	public IExpression getChild(int i) {
		Tree child = super.getChild(i);
		if (child instanceof IExpression)
			return (IExpression) child;
		else
			return null;
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) {
		if (getChildCount() == 0) {
			fType = new NullType();
			fType.setSequence();
			return;
		}

		fType = getChild(0).getExpressionType().dup();
		for (int i = 1; i < getChildCount(); i++)
			fType = TypeUnifier.intersect(fType, getChild(i)
					.getExpressionType());
		fType.setSequence();

		// type is not null if any of child is so
		for (int i = 0; i < getChildCount(); i++)
			if (getChild(i).getExpressionType().isNotNull())
				fType.setNotNull();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "seq of " + fType;
	}
}
