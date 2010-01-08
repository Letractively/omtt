package pl.omtt.core.stdlib;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import pl.omtt.core.annotations.OmttModule;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;

@OmttModule
public class Format {
	public static String date (Date date, @Optional @Name("style") String strstyle) {
		int style = DateFormat.MEDIUM;
		if (strstyle == null)
			;
		else if ("long".equals(strstyle))
			style = DateFormat.LONG;
		else if ("full".equals(strstyle))
			style = DateFormat.FULL;
		else if ("medium".equals(strstyle))
			style = DateFormat.MEDIUM;
		else if ("short".equals(strstyle))
			style = DateFormat.SHORT;		
		return DateFormat.getDateInstance(style).format(date);
	}

	public static String real (Double r, @Name("format") String format) {
		return new DecimalFormat(format).format(r);
	}

	public static String currency (Double c) {
		return NumberFormat.getCurrencyInstance().format(c);
	}

	public static String percent (Double p) {
		return NumberFormat.getPercentInstance().format(p);
	}
	
	public static String lc (String s) {
		if (s == null)
			return null;
		else
			return s.toLowerCase();
	}

	public static String lcfirst (String s) {
		if (s == null)
			return null;
		else if (s.length() == 0)
			return s;
		else
			return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	public static String uc (String s) {
		if (s == null)
			return null;
		else
			return s.toLowerCase();
	}

	public static String ucfirst (String s) {
		if (s == null)
			return null;
		else if (s.length() == 0)
			return s;
		else
			return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}
