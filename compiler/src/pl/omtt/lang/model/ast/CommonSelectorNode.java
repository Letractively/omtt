package pl.omtt.lang.model.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.ISymbolTableDualParticipant;
import pl.omtt.lang.analyze.ISymbolTableOwnerForRightNode;
import pl.omtt.lang.analyze.Symbol;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.types.ErrorType;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public abstract class CommonSelectorNode extends CommonNode implements
		IExpression, ISymbolTableOwnerForRightNode, ISymbolTableDualParticipant {

	IType fType;
	IType fSelectorType;
	IType fOriginalType;

	Symbol fItSymbol;
	Symbol fAliasSymbol;

	public CommonSelectorNode(Token token) {
		super(token);
	}

	@Override
	public IType getExpressionType() {
		return fType;
	}

	public IType getOriginalType() {
		return fOriginalType;
	}

	protected abstract IType getOriginalType(SymbolTable symbolTable)
			throws TypeException;

	@Override
	public void setExpressionType(SymbolTable symbolTable) throws TypeException {
		// it is done by takeSymbolTable()
	}

	private void presetExpressionType(SymbolTable symbolTable)
			throws TypeException {
		try {
			fOriginalType = getOriginalType(symbolTable);
		} catch (TypeException e) {
			fOriginalType = new ErrorType();
			fType = new ErrorType();
			throw e;
		}

		TypeReference typeSelector = getTypeSelectorNode();
		if (typeSelector != null) {
			fSelectorType = typeSelector.get(symbolTable);
			fType = fSelectorType;
			if (fOriginalType.isSequence())
				fType.setSequence();

			// check possibility of cast
			if (!fSelectorType.isSubtypeOf(fOriginalType)
					&& !fOriginalType.isSubtypeOf(fSelectorType)) {
				throw new TypeException(typeSelector, "type "
						+ fOriginalType.singleToString()
						+ " is not convertable to " + fSelectorType);
			}
		} else {
			fType = fOriginalType.dup();
			if (getSequenceSelectorNode() != null)
				fType.unsetNotNull();
		}
	}

	@Override
	public Tree getTreePrecedingParticipatingST() {
		return getBaseNode();
	}

	public abstract IExpression getBaseNode();

	@Override
	public Tree getTreeFollowingParticipatingST() {
		return getSequenceSelectorNode();
	}

	@Override
	public void takeSymbolTable(SymbolTable symbolTable) throws TypeException {
		presetExpressionType(symbolTable);
		try {
			setExpressionType(symbolTable);
		} catch (TypeException e) {
			throw e;
		} finally {
			IType singleType = getExpressionType().dup();
			singleType.unsetSequence();
			fItSymbol = new Symbol("it", singleType);
			symbolTable.put(fItSymbol);

			if (getAliasNode() != null) {
				fAliasSymbol = new Symbol(getAliasNode().getText(),
						getExpressionType());
				symbolTable.getParent().put(fAliasSymbol);
			}
		}
	}

	public TypeReference getTypeSelectorNode() {
		Tree typeSelector = getFirstChildWithType(OmttParser.TYPE_SELECT);
		if (typeSelector == null)
			return null;
		return (TypeReference) typeSelector.getChild(0);
	}

	public IExpression getSequenceSelectorNode() {
		Tree seqSelector = getFirstChildWithType(OmttParser.SEQUENCE_SELECT);
		if (seqSelector == null)
			return null;
		return (IExpression) seqSelector.getChild(0);
	}

	public Tree getAliasNode() {
		Tree alias = getFirstChildWithType(OmttParser.AS);
		if (alias == null)
			return null;
		return alias.getChild(0);
	}

	public Symbol getItSymbol() {
		return fItSymbol;
	}

	public Symbol getAliasSymbol() {
		return fAliasSymbol;
	}
}
