package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;

import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.symboltable.ISymbolTableDualParticipant;
import pl.omtt.lang.symboltable.ISymbolTableOwner;
import pl.omtt.lang.symboltable.SymbolTable;

public class AtomSelect extends CommonSelectorNode implements IFoldExpression,
		ISymbolTableOwner, ISymbolTableDualParticipant, IVisitable {
	public AtomSelect(int token) {
		super(new CommonToken(token, "atom select"));
	}

	@Override
	public IExpression getBaseNode() {
		return (IExpression)this.getChild(0);
	}

	@Override
	protected IType getOriginalType(SymbolTable symbolTable)
			throws TypeException {
		return getBaseNode().getExpressionType();
	}

	@Override
	public boolean isItemSequence() {
		return false;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "atom select of " + getExpressionType();
	}
}
