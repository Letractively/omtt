package pl.omtt;

import pl.omtt.caller.OmttCaller;

public class TestCaller {
	public static void main(String[] args) {
		String s = OmttCaller.call("samples.type11.f", 157);
		System.out.println(s);
	}
}
