package pl.omtt.core.stdlib;

import pl.omtt.core.annotations.OmttModule;

@OmttModule
public class Math {
	public static Double sqrt(Double d) {
		return java.lang.Math.sqrt(d);
	}

	public static Double abs(Double d) {
		return java.lang.Math.abs(d);
	}
	
	public static Integer absi(Integer d) {
		return java.lang.Math.abs(d);
	}
	
	public static Double ceil(Double d) {
		return java.lang.Math.ceil(d);
	}
	
	public static Double expr(Double d) {
		return java.lang.Math.exp(d);
	}
	
	public static Double floor(Double d) {
		return java.lang.Math.floor(d);
	}
	
	public static Double log(Double d) {
		return java.lang.Math.log(d);
	}
	
	public static Double log10(Double d) {
		return java.lang.Math.log10(d);
	}
	
	public static Double pow(Double a, Double b) {
		return java.lang.Math.pow(a, b);
	}
	
	public static Integer round(Double d) {
		return (int) java.lang.Math.round(d);
	}
	
	public static Double sgn(Double d) {
		return java.lang.Math.signum(d);
	}
	
	public static Double sin(Double d) {
		return java.lang.Math.sin(d);
	}
	
	public static Double cos(Double d) {
		return java.lang.Math.cos(d);
	}
	
	public static Double tan(Double d) {
		return java.lang.Math.tan(d);
	}
	
	public static Double asin(Double d) {
		return java.lang.Math.asin(d);
	}
	
	public static Double acos(Double d) {
		return java.lang.Math.acos(d);
	}
	
	public static Double atan(Double d) {
		return java.lang.Math.atan(d);
	}
	
	public static Double sinh(Double d) {
		return java.lang.Math.sinh(d);
	}
	
	public static Double cosh(Double d) {
		return java.lang.Math.cosh(d);
	}
	
	public static Double tanh(Double d) {
		return java.lang.Math.tanh(d);
	}
	
	public static final double pi = java.lang.Math.PI;
	public static final double e = java.lang.Math.E;
}
