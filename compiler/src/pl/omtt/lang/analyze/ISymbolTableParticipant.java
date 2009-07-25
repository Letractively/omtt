package pl.omtt.lang.analyze;

import pl.omtt.lang.model.types.TypeException;

public interface ISymbolTableParticipant {
	void takeSymbolTable(SymbolTable symbolTable) throws TypeException;
}
