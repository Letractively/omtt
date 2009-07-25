package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.ISymbolTableDualParticipant;
import pl.omtt.lang.analyze.ISymbolTableOwnerForRightNode;
import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public class Transformation extends CommonNode implements IFoldExpression,
		ISymbolTableDualParticipant, ISymbolTableOwnerForRightNode, IVisitable {
	IType fType;
	Symbol fItSymbol;

	public Transformation(Token token) {
		super(token);
	}

	public IExpression getSourceNode() {
		return (IExpression) getChild(0);
	}

	public IExpression getTransformationNode() {
		return (IExpression) getChild(1);
	}

	public Symbol getItSymbol() {
		return fItSymbol;
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public boolean isItemSequence() {
		return getTransformationNode().getExpressionType().isSequence();
	}

	@Override
	public IExpression getBaseNode() {
		return getSourceNode();
	}

	@Override
	public void setExpressionType(SymbolTable symbolArray) {
		fType = getTransformationNode().getExpressionType().dup();
		final IType srctype = getSourceNode().getExpressionType();
		final IType transtype = getTransformationNode().getExpressionType();
		if (srctype.isSequence())
			fType.setSequence();
		if (srctype.isNotNull() && transtype.isNotNull())
			fType.isNotNull();
	}

	@Override
	public Tree getTreePrecedingParticipatingST() {
		return getSourceNode();
	}

	@Override
	public Tree getTreeFollowingParticipatingST() {
		return getTransformationNode();
	}

	@Override
	public void takeSymbolTable(SymbolTable symbolTable) throws TypeException {
		IType iterateType = getSourceNode().getExpressionType().dup()
				.setNotNull();
		iterateType.unsetSequence();
		fItSymbol = new Symbol("it", iterateType);
		symbolTable.put(fItSymbol);
	}

	@Override
	public String toString() {
		return "map of " + getExpressionType();
	}
}
