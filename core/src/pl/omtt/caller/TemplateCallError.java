package pl.omtt.caller;

public class TemplateCallError extends Error {
	public TemplateCallError(Exception e) {
		super(e);
	}

	private static final long serialVersionUID = -3775476335181617790L;
}
