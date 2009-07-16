package pl.omtt.lang.code;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.tools.SimpleJavaFileObject;

public class OmttJavaSource extends SimpleJavaFileObject {
	String fCode;
	URI fOmttSourceURI;

	protected OmttJavaSource(String packageName, String moduleName, String code, URI omttSourceURI)
			throws URISyntaxException {
		super(getURI(packageName, moduleName), Kind.SOURCE);
		fCode = code;
		fOmttSourceURI = omttSourceURI;
	}

	public URI getOtSourceURI () {
		return fOmttSourceURI;
	}
	
	private static URI getURI(String packageName, String moduleName)
			throws URISyntaxException {
		String name = (packageName + "." + moduleName).replaceAll("\\.", "/")
				+ ".java";
		return new URI(name);
	}

	public CharSequence getCharContent(boolean ignoreEncodingErrors)
			throws IOException {
		return fCode;
	}
	
	public String getCode () {
		return fCode;
	}
}
