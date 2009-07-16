package pl.omtt.core.stdlib;

import java.util.Collection;

public class TextBuffer {
	StringBuffer fBuffer = new StringBuffer ();

	@SuppressWarnings("unchecked")
	public TextBuffer append (Collection col) {
		for (Object o : col)
			append(o);
		return this;
	}
	
	public TextBuffer append (Object o) {
		fBuffer.append(o);
		return this;
	}
	
	public int length () {
		return fBuffer.length();
	}
	
	@Override
	public String toString () {
		return fBuffer.toString();
	}
}
