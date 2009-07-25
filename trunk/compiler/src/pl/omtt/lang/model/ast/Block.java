package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;

public class Block extends CommonNode implements ISymbolTableOwner,
		IExpression, IVisitable {
	IType fType;

	public Block(int token) {
		super(new CommonToken(token, "block"));
	}

	public IExpression getInBody () {
		return (IExpression)getChild(getChildCount() - 1);
	}
	
	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) {
		fType = getInBody().getExpressionType();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
