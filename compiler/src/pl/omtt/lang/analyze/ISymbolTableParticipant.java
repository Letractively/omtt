package pl.omtt.lang.analyze;

public interface ISymbolTableParticipant {
	void takeSymbolTable(SymbolTable symbolTable) throws SemanticException;
}
