package pl.omtt.lang.model.nodes;

import org.antlr.runtime.Token;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.StringDataType;

public class Data extends CommonNode implements IExpression, IVisitable {
	public Data(Token token) {
		super(token);
	}

	@Override
	public IType getExpressionType() {
		return new StringDataType().setNotNull();
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) {
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String toString() {
		return "data";
	}
}
