package pl.omtt.core.stdlib;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import pl.omtt.core.annotations.OmttModule;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;

@OmttModule
public class Format {
	public static String date(Date date,
			@Optional @Name("style") String strstyle) {
		if (date == null)
			return null;
		if ("long".equals(strstyle))
			return DateFormat.getDateInstance(DateFormat.LONG).format(date);
		else if ("full".equals(strstyle))
			return DateFormat.getDateInstance(DateFormat.FULL).format(date);
		else if ("short".equals(strstyle))
			return DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		else
			return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	public static String real(Double r, @Name("format") String format) {
		if (r == null || format == null)
			return null;
		return new DecimalFormat(format).format(r);
	}

	public static String currency(Double c,
			@Optional @Name("currencyCode") String currencyCode) {
		if (c == null)
			return null;
		NumberFormat f = NumberFormat.getCurrencyInstance();
		if (currencyCode != null)
			f.setCurrency(Currency.getInstance(currencyCode));
		return f.format(c);
	}

	public static String percent(Double p) {
		if (p == null)
			return null;
		return NumberFormat.getPercentInstance().format(p);
	}

	public static String lc(String s) {
		if (s == null)
			return null;
		else
			return s.toLowerCase();
	}

	public static String lcfirst(String s) {
		if (s == null)
			return null;
		else if (s.length() == 0)
			return s;
		else
			return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	public static String uc(String s) {
		if (s == null)
			return null;
		else
			return s.toLowerCase();
	}

	public static String ucfirst(String s) {
		if (s == null)
			return null;
		else if (s.length() == 0)
			return s;
		else
			return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}
