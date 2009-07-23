package pl.omtt.core.funproto;

import pl.omtt.core.stdlib.TextBuffer;

public interface DataFunction2<A0, A1> extends Function {
	void run (TextBuffer buf, A0 arg0, A1 arg1);
}
