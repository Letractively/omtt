package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.ISymbolTableParticipant;
import pl.omtt.lang.analyze.SemanticException;
import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class LambdaMatchItem extends CommonNode implements IExpression,
		ISymbolTableOwner, IVisitable, ISymbolTableParticipant {
	IType fType;
	IType fExpectingType;
	Symbol fContextSymbol;

	public LambdaMatchItem(Token token) {
		super(token);
	}

	public LambdaMatchItem(int token) {
		super(new CommonToken(token, "lambda match item"));
	}

	public IType getExpectingType () {
		return fExpectingType;
	}
	
	public Symbol getContextSymbol () {
		return fContextSymbol;
	}
	
	public TypeReference getTypeNode() {
		if (getChildCount() > 0 && getChild(0) instanceof TypeReference)
			return (TypeReference) getChild(0);
		else
			return null;
	}

	public IExpression getBodyNode() {
		if (getChildCount() > 1)
			return (IExpression) getChild(1);
		else
			return null;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void takeSymbolTable(SymbolTable ST)
			throws SemanticException {
		fExpectingType = getTypeNode().get(ST);
		fContextSymbol = new Symbol(Symbol.CONTEXT, fExpectingType);
		ST.put(fContextSymbol);
	}

	@Override
	public void setExpressionType(SymbolTable ST) throws TypeException {
		fType = getBodyNode().getExpressionType();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "lambda match item of " + fType;
	}
}
