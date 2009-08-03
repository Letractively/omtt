package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.AnyType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.NullType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class LambdaMatch extends CommonNode implements IExpression,
		ISymbolTableOwner, IVisitable {
	IType fType;

	public LambdaMatch(Token token) {
		super(token);
	}

	public LambdaMatch(int token) {
		super(new CommonToken(token, "lambda match expression"));
	}

	public int getItemLength () {
		return getChildCount();
	}
	
	public LambdaMatchItem getItemNode(int i) {
		if (getChildCount() <= i)
			return null;
		return (LambdaMatchItem)getChild(i);
	}
	
	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable ST) throws TypeException {
		FunctionType ftype = new FunctionType();
		ftype.setNotNull();
		ftype.putArgument(Symbol.IT, new AnyType(), false);
		
		IType cur = new NullType();
		for (int i = 0; i < getItemLength(); i++) {
			IType type = getItemNode(i).getExpressionType();
			cur = TypeUnifier.intersect(cur, type);
			if (type.isSequence())
				cur.setSequence();
		}
		ftype.setReturnType(cur);
		fType = ftype;
		fType.freeze();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "lambda match of " + fType;
	}
}
