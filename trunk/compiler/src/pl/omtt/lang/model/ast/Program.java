package pl.omtt.lang.model.ast;

import java.net.URI;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import pl.omtt.core.Constants;
import pl.omtt.lang.analyze.BaseSymbolTable;
import pl.omtt.lang.analyze.ISymbolTableParticipant;
import pl.omtt.lang.analyze.SymbolTable;
import pl.omtt.lang.grammar.OmttParser;
import pl.omtt.lang.model.IVisitable;
import pl.omtt.lang.model.IVisitor;
import pl.omtt.lang.model.types.TypeException;

public class Program extends CommonNode implements IVisitable,
		ISymbolTableParticipant {
	URI fSourceURI;
	BaseSymbolTable fSymbolTable;
	TokenStream fTokenStream;

	public Program(int token) {
		super(new CommonToken(token, "program"));
	}

	public void setSourceURI(URI sourceURI) {
		fSourceURI = sourceURI;
	}

	public String getResourcePackage() {
		if (getModuleDeclaration() == null)
			return Constants.OMTT_LOCAL_PACKAGE;
		else
			return getModuleDeclaration().getModuleName();
	}

	public String getResourceName() {
		if (getModuleDeclaration() == null)
			return resourceNameFromURI();
		else
			return getModuleDeclaration().getModuleName();
	}

	private String resourceNameFromURI() {
		if (fSourceURI == null)
			return null;

		String path = fSourceURI.getRawPath();
		String fname = path.substring(path.lastIndexOf('/') + 1, path
				.lastIndexOf('.'));
		
		if (!fname.matches("[a-zA-Z]+")) {
			System.err.println("file " + path + " has unpermitted name");
			return null;
		}
		return fname;
	}

	public String getResourceId() {
		return getResourcePackage() + "." + getResourceName();
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

	public BaseSymbolTable getSymbolTable() {
		return fSymbolTable;
	}

	public TokenStream getTokenStream() {
		return fTokenStream;
	}

	public void setTokenStream(TokenStream tokenStream) {
		fTokenStream = tokenStream;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
