package pl.omtt.lang.model.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.ISymbolTableOwner;
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
	List<IType> fItemTypes = new ArrayList<IType>();

	public LambdaMatch(Token token) {
		super(token);
	}

	public LambdaMatch(int token) {
		super(new CommonToken(token, "lambda match expression"));
	}

	public int getItemLength () {
		return getChildCount();
	}
	
	public TypeReference getItemTypeNode(int i) {
		if (getChildCount() <= i)
			return null;
		return (TypeReference)getChild(i).getChild(0);
	}
	
	public IType getItemType(int i) {
		if (getChildCount() <= i)
			return null;
		return fItemTypes.get(i);
	}

	public IExpression getBodyNode(int i) {
		if (getChildCount() <= i)
			return null;
		return (IExpression)getChild(i).getChild(1);
	}
	
	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable ST) throws TypeException {
		for (int i = 0; i < getItemLength(); i++)
			fItemTypes.add(getItemTypeNode(i).get(ST));
		
		FunctionType ftype = new FunctionType();
		ftype.setNotNull();
		ftype.putArgument("it", new AnyType(), false);
		
		IType cur = new NullType();
		for (int i = 0; i < getItemLength(); i++) {
			IType type = getBodyNode(i).getExpressionType();
			cur = TypeUnifier.intersect(cur, type);
			if (type.isSequence())
				cur.setSequence();
			System.err.println(cur);
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
