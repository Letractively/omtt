package pl.omtt.lang.model.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.ISymbolTableParticipant;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.TypeException;

public class Program extends CommonNode implements IVisitable,
		ISymbolTableParticipant {
	BaseSymbolTable fSymbolTable;
	TokenStream fTokenStream;

	public Program(int token) {
		super(new CommonToken(token, "program"));
	}

	public String getResourceId () {
		ModuleDeclaration md = getModuleDeclaration();
		if (md == null)
			return null;
		else
			return md.getModuleId();
	}
	
	public ModuleDeclaration getModuleDeclaration() {
		if (getChild(0) instanceof ModuleDeclaration)
			return (ModuleDeclaration) getChild(0);
		else
			return null;
	}

	public Tree getUsesNode() {
		return getFirstChildWithType(OmttParser.USES);
	}

	public Tree getImportsNode() {
		return getFirstChildWithType(OmttParser.IMPORTS);
	}

	@Override
	public void takeSymbolTable(SymbolTable symbolTable) throws TypeException {
		fSymbolTable = (BaseSymbolTable) symbolTable;
	}

	public BaseSymbolTable getSymbolTable () {
		return fSymbolTable;
	}

	public TokenStream getTokenStream () {
		return fTokenStream;
	}
	
	public void setTokenStream (TokenStream tokenStream) {
		fTokenStream = tokenStream;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
