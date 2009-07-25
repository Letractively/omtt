package pl.omtt.compiler;

import java.net.URI;

public class UseCycleException extends Exception {
	URI fCauseURI;
	
	public UseCycleException(String msg) {
		super(msg);
	}

	public UseCycleException(URI uri, String msg) {
		this(msg);
		fCauseURI = uri;
	}

	private static final long serialVersionUID = 1L;
}
