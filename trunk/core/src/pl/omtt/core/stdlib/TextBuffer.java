package pl.omtt.core.stdlib;

import java.util.Collection;

public class TextBuffer {
	StringBuffer fBuffer = new StringBuffer();

	public TextBuffer append(Object o) {
		if (o != null)
			fBuffer.append(o);
		return this;
	}

	@SuppressWarnings("unchecked")
	public TextBuffer append(Collection col) {
		if (col != null)
			for (Object o : col)
				append(o);
		return this;
	}

	public int length() {
		return fBuffer.length();
	}

	public boolean isEmpty() {
		return fBuffer.length() == 0;
	}

	@Override
	public String toString() {
		return fBuffer.toString();
	}
}
