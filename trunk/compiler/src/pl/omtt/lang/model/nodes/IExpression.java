package pl.omtt.lang.model.nodes;

import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.code.ForceSymbolTableRecalculatingException;
import pl.omtt.lang.code.SymbolTable;
import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;

public interface IExpression extends Tree {
	public IType getExpressionType();

	public void setExpressionType(SymbolTable symbolTable)
			throws TypeException, ForceSymbolTableRecalculatingException;
}
