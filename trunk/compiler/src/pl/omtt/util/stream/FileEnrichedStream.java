package pl.omtt.util.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Scanner;

public class FileEnrichedStream extends StringEnrichedStream {
	URI fURI;

	public FileEnrichedStream(URI uri) throws FileNotFoundException {
		super(new Scanner(new File(uri.getPath())).useDelimiter("\\Z").next());
		fURI = uri;
	}

	@Override
	public String getSourceName() {
		return fURI.getPath();
	}
}
