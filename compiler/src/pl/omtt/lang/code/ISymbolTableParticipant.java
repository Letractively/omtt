package pl.omtt.lang.code;

import pl.omtt.lang.model.types.TypeException;

public interface ISymbolTableParticipant {
	void takeSymbolTable(SymbolTable symbolTable) throws TypeException;
}
