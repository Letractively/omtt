package pl.omtt.util.stream;

public class StringEnrichedStream extends EnrichedRawStream {

	String fString;
	
	public StringEnrichedStream(String string) {
		fString = string;
	}
	
	@Override
	protected int charAt(int p) {
		if (p < 0 || p >= fString.length())
			return EOF;
		return fString.charAt(p);
	}

	@Override
	protected int getLength() {
		return fString.length();
	}

	@Override
	public String substring(int start, int stop) {
		return fString.substring(start, stop + 1);
	}

	@Override
	public String getSourceName() {
		return "buffered string";
	}

	@Override
	public int size() {
		return fString.length();
	}

}
