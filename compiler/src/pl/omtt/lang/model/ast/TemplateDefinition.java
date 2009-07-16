package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.code.ForceSymbolTableRecalculatingException;
import pl.omtt.lang.code.ISymbolTableDualParticipant;
import pl.omtt.lang.code.ISymbolTableOwner;
import pl.omtt.lang.code.Symbol;
import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.FlexibleType;
import pl.omtt.lang.model.types.FunctionType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.StringDataType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.model.types.TypeUnifier;

public class TemplateDefinition extends CommonNode implements
		ISymbolTableOwner, ISymbolTableDualParticipant, IExpression, IVisitable {
	IType fType;
	boolean fForceSequenceReturn = false;
	Symbol fSymbol;

	public TemplateDefinition(Token token) {
		super(token);
	}

	public TemplateDefinition(int token) {
		super(new CommonToken(token));
	}

	public TemplateArgument getArgument(int i) {
		return (TemplateArgument) getArgumentsNode().getChild(i);
	}

	public int getArgumentsCount() {
		return getArgumentsNode().getChildCount();
	}

	public Ident getTemplateNameIdent() {
		try {
			return (Ident) getChild(0);
		} catch (Exception e) {
			return null;
		}
	}

	public CommonToken getTemplateNameToken() {
		try {
			return (CommonToken) getTemplateNameIdent().getToken();
		} catch (Exception e) {
			return null;
		}
	}

	public String getTemplateName() {
		return getTemplateNameIdent().getName();
	}

	public Symbol getSymbol() {
		return fSymbol;
	}

	@Override
	public void takeSymbolTable(SymbolTable ST) throws TypeException {
		IType returnType;
		Tree retNode = getReturnsNode();
		if (retNode != null && retNode.getChildCount() > 0) {
			returnType = ((TypeReference) retNode.getChild(0)).get(ST);
		} else if (getBodyNode() instanceof Data) {
			returnType = new StringDataType();
		} else {
			returnType = new FlexibleType();
			if (fForceSequenceReturn)
				returnType.setSequence();
		}

		Tree args = getArgumentsNode();
		if (args == null || args.getChildCount() == 0) {
			fType = returnType;
		} else {
			FunctionType type = new FunctionType();
			for (int i = 0; i < args.getChildCount(); i++) {
				TemplateArgument arg = (TemplateArgument) args.getChild(i);
				type.putArgument(arg.getArgumentName(), arg.getArgumentType(),
						arg.isArgumentOptional());
			}
			type.setReturnType(returnType);
			fType = type;
		}
		fSymbol = new Symbol(getTemplateName(), fType);
		ST.getParent().put(fSymbol);
	}

	@Override
	public Tree getTreePrecedingParticipatingST() {
		return getArgumentsNode();
	}

	@Override
	public Tree getTreeFollowingParticipatingST() {
		return getChild(getChildCount() - 1);
	}

	public Tree getArgumentsNode() {
		return getFirstChildWithType(OmttParser.ARGUMENTS);
	}

	public Tree getReturnsNode() {
		return getFirstChildWithType(OmttParser.RETURNS);
	}

	public IExpression getBodyNode() {
		return (IExpression) getChild(getChildCount() - 1);
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void setExpressionType(SymbolTable symbolTable)
			throws TypeException, ForceSymbolTableRecalculatingException {
		getTemplateNameIdent().setExpressionType(symbolTable);

		IType bodyType = getBodyNode().getExpressionType();
		IType returnType;
		if (fType instanceof FunctionType)
			returnType = ((FunctionType) fType).getReturnType();
		else
			returnType = fType;

		if (bodyType.isSequence() && !returnType.isSequence()) {
			fForceSequenceReturn = true;
			throw new ForceSymbolTableRecalculatingException();
		}

		if (returnType.isFrozen())
			TypeUnifier.unifyLe(returnType, bodyType);
		else
			TypeUnifier.unifyEq(returnType, bodyType);

		if (getParent() instanceof Program)
			fType.freeze();
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "def " + getTemplateName() + " of " + fType;
	}
}
