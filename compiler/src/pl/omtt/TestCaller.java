package pl.omtt;

import pl.omtt.caller.OmttCaller;

public class TestCaller {
	public static void main(String[] args) {
		OmttCaller caller = new OmttCaller();
		String s = caller.call("samples.type11.f", 157);
		System.out.println(s);
	}
}
