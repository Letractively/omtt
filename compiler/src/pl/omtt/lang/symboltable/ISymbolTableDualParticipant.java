package pl.omtt.lang.symboltable;

import org.antlr.runtime.tree.Tree;

public interface ISymbolTableDualParticipant extends ISymbolTableParticipant {
	Tree getTreePrecedingParticipatingST ();
	Tree getTreeFollowingParticipatingST ();
}
