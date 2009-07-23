package pl.omtt.lang.model.ast;

import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.model.types.IType;
import pl.omtt.lang.model.types.TypeException;
import pl.omtt.lang.symboltable.ForceSymbolTableRecalculatingException;
import pl.omtt.lang.symboltable.SymbolTable;

public interface IExpression extends Tree {
	public IType getExpressionType();

	public void setExpressionType(SymbolTable symbolTable)
			throws TypeException, ForceSymbolTableRecalculatingException;
}
