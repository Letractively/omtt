package pl.omtt.core.functions;

import pl.omtt.core.stdlib.TextBuffer;

public interface DataFunction1<A0> extends Function {
	void run (TextBuffer buf, A0 arg0);
}
