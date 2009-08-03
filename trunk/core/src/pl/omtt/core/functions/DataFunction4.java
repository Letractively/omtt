package pl.omtt.core.functions;

import pl.omtt.core.stdlib.TextBuffer;

public interface DataFunction4<A0, A1, A2, A3> extends Function {
	void run (TextBuffer buf, A0 arg0, A1 arg1, A2 arg2, A3 arg3);
}
