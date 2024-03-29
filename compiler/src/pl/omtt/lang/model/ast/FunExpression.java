package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.ISymbolTableOwner;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class FunExpression extends CommonNode implements IExpression,
		ISymbolTableOwner, IVisitable {
	IType fType;

	public FunExpression(Token token) {
		super(token);
	}

	public FunExpression(int token) {
		super(new CommonToken(token, "lambda expression"));
	}

	public Tree getArgumentsNode() {
		return getChild(0);
	}

	public IExpression getBodyNode() {
		return (IExpression) getChild(1);
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) throws TypeException {
		FunctionType ftype = new FunctionType();

		Tree args = getArgumentsNode();
		for (int i = 0; i < args.getChildCount(); i++) {
			TemplateArgument arg = (TemplateArgument) args.getChild(i);
			ftype.putArgument(arg.getArgumentName(), arg.getArgumentType(), arg
					.isArgumentOptional());
		}

		final IType rettype = ftype.getReturnType();
		final IType bodytype = getBodyNode().getExpressionType();
		
		if (bodytype.isSequence())
			rettype.setSequence();

		TypeUnifier.unifyEq(rettype, bodytype);
		TypeUnifier.preserveAttributes(rettype, bodytype);

		fType = ftype;
		fType.freeze();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "lambda of " + fType;
	}
}
