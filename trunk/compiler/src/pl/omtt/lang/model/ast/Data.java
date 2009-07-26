package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;

public class Data extends CommonNode implements IExpression, IVisitable {
	public Data(Token token) {
		super(token);
	}

	@Override
	public IType getExpressionType() {
		return new StringDataType().setNotNull();
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		for (int i = 0; i < getChildCount(); i++) {
			IExpression expr = (IExpression) getChild(i);
			if (expr.getExpressionType().isFunction())
				throw new TypeException(expr,
						"function casts to data are not allowed");
		}
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String toString() {
		return "data";
	}
}
