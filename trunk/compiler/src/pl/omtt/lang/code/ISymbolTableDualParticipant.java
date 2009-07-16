package pl.omtt.lang.code;

import org.antlr.runtime.tree.Tree;

public interface ISymbolTableDualParticipant extends ISymbolTableParticipant {
	Tree getTreePrecedingParticipatingST ();
	Tree getTreeFollowingParticipatingST ();
}
