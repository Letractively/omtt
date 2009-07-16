package pl.omtt.lang.model.nodes;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class CommonNode extends CommonTree {
	Token fTokenStart;
	Token fTokenStop;

	public CommonNode(Token token) {
		super(token);
	}

	public CommonNode(int tokenId) {
		super(new CommonToken(tokenId));
	}

	public CommonNode() {
		super();
	}

	public Token getTokenStart() {
		return fTokenStart;
	}

	public Token getTokenStop() {
		return fTokenStop;
	}

	public void setTokenStart(Token token) {
		fTokenStart = token;
	}

	public void setTokenStop(Token token) {
		fTokenStop = token;
	}

	public boolean hasSourceInfo() {
		return fTokenStart instanceof CommonToken
				&& fTokenStop instanceof CommonToken;
	}

	public int getSourceIndex() {
		if (fTokenStart instanceof CommonToken)
			return ((CommonToken) fTokenStart).getStartIndex();
		else
			return 0;
	}

	public int getSourceLength() {
		if (fTokenStop instanceof CommonToken)
			return ((CommonToken) fTokenStop).getStopIndex() - getSourceIndex() + 1;
		else
			return 0;
	}

	public int getSourceLine() {
		return getLine();
	}
}
