package pl.omtt.lang.model.nodes;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class Cast extends CommonNode implements IExpression, IVisitable {
	IType fType;

	public Cast(int token) {
		super(new CommonToken(token, "cast"));
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	public TypeReference getTypeNode() {
		return (TypeReference) getChild(0);
	}

	public IExpression getBodyNode() {
		return (IExpression) getChild(1);
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		fType = TypeUnifier.preserveAttributes(getTypeNode().get(symbolTable),
				getBodyNode().getExpressionType());
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
