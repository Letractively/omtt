package pl.omtt.util.stream;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;

abstract public class EnrichedRawStream implements IEnrichedStream {
	protected Lexer l;
	protected int p;

	protected List<Integer> fMarkers;
	protected int fMarkDepth;
	protected int fLastMarker;

	protected boolean fNewLine = false;
	protected boolean fNewLineIsDirty = false;

	protected int fLineNumber = 1;
	protected int fLineBreakPosition = -1;
	protected boolean fLineNumberIsDirty = false;

	abstract protected int charAt(int p);
	abstract protected int getLength();
	
	@Override
	public Token nextToken() {
		return l.nextToken();
	}

	@Override
	public void reset() {
		p = 0;
		fMarkDepth = 0;

		fNewLine = true;
		fNewLineIsDirty = false;

		fLineNumber = 0;
		fLineBreakPosition = -1;
		fLineNumberIsDirty = false;
	}

	@Override
	public void consume() {
		switch(LA(1)) {
		case '\n':
			fNewLine = true;
			fNewLineIsDirty = false;
			if(!fLineNumberIsDirty)
				fLineNumber++;
			break;
		case ' ':
		case '\t':
		case '\r':
			break;
		default:
			fNewLine = false;
			fNewLineIsDirty = false;
			break;
		}

		if (p < getLength())
			p++;
	}

	public void consume(int i) {
		if (p + i < getLength())
			p += i;
		else
			p = getLength();
		fNewLineIsDirty = true;
		fLineNumberIsDirty = true;
	}

	@Override
	public int LA(int i) {
		if (i == 0)
			return 0; // undefined

		if (i < 0)
			i++; // e.g., translate LA(-1) to use offset i=0

		return charAt(p + i - 1);
	}

	@Override
	public int LT(int i) {
		return LA(i);
	}

	@Override
	public int index() {
		return p;
	}

	@Override
	public int getCharPositionInLine() {
		if (fLineNumberIsDirty)
			getLine();
		return p - fLineBreakPosition;
	}

	@Override
	public int getLine() {
		if (fLineNumberIsDirty) {
			fLineNumberIsDirty = false;
			for (; fLineBreakPosition < p; fLineBreakPosition++) {
				if (charAt(fLineBreakPosition) == '\n')
					fLineNumber++;
			}
			for (; fLineBreakPosition > p; fLineBreakPosition--) {
				if (charAt(fLineBreakPosition - 1) == '\n')
					fLineNumber--;
			}
		}

		return fLineNumber;
	}

	@Override
	public void setCharPositionInLine(int pos) {
	}

	@Override
	public void setLine(int line) {
	}

	@Override
	public int mark() {
		if (fMarkers == null) {
			fMarkers = new ArrayList<Integer>(1);
			fMarkers.add(null);
		}
		fMarkDepth++;

		if (fMarkDepth >= fMarkers.size())
			fMarkers.add(p);
		else
			fMarkers.set(fMarkDepth, p);

		fLastMarker = fMarkDepth;
		return fMarkDepth;
	}

	@Override
	public void rewind() {
		rewind(fLastMarker);
	}

	@Override
	public void rewind(int m) {
		seek(fMarkers.get(m));
		release(m);
	}

	@Override
	public void release(int m) {
		fMarkDepth = m - 1;
	}

	@Override
	public void seek(int i) {
		if (!fNewLineIsDirty)
			fLineBreakPosition = p;
		fNewLineIsDirty = true;
		fLineNumberIsDirty = true;

		p = i;
	}

	@Override
	public boolean isNewLine() {
		// check if we need to search for first char in line
		if (fNewLineIsDirty) {
			fNewLineIsDirty = false;
			for (int i = -1;; i--)
				switch (LA(i)) {
				case '\n':
				case '\r':
				case EOF:
					fNewLine = true;
					return true;
				case ' ':
				case '\t':
					break;
				default:
					fNewLine = false;
					return false;
				}
		}
		return fNewLine;
	}
	
	@Override
	public int rewindToLineBegin () {
		int acc = 0;
		while(true) {
			int LA = LA(-1 - acc);
			if (LA == '\n' || LA == '\r' || LA == EOF)
				break;
			acc++;
		}
		seek(p - acc);
		return acc;
	}
}
