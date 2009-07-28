package pl.omtt.core.stdlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import pl.omtt.core.annotations.OmttModule;
import pl.omtt.core.functions.Function2;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.core.functions.Type;

@OmttModule
public class Sequences {
	public static boolean empty(Collection<Object> c) {
		return c == null || c.isEmpty();
	}

	public static Integer size(Collection<Object> c) {
		return c.size();
	}

	@Type("(_[1]* ~(_[1] _[1] -> Boolean) -> _[1]*)")
	@SuppressWarnings("unchecked")
	public static List<Object> sort(Collection<Object> c,
			@Optional @Name("lower") Function2<Boolean, Object, Object> lower) {
		List list = new ArrayList(c);

		if (lower == null)
			Collections.sort(list);
		else
			Collections.sort(list, new FunctionComparator(lower));
		return list;
	}

	public static void join(TextBuffer buf, Collection<Object> sequence,
			@Optional @Name("sep") String separator) {
		if (sequence == null)
			return;

		Iterator<Object> itor = sequence.iterator();
		while (itor.hasNext()) {
			buf.append(itor.next());
			if (itor.hasNext())
				buf.append(separator);
		}
	}

	public static Collection<String> split(String string,
			@Name("sep") String sep) {
		return Arrays.asList(string.split(sep));
	}

	private static class FunctionComparator implements Comparator<Object> {
		private Function2<Boolean, Object, Object> comparator;

		public FunctionComparator(Function2<Boolean, Object, Object> lower) {
			this.comparator = lower;
		}

		@Override
		public int compare(Object o1, Object o2) {
			if (o1 == null)
				return 1;
			else if (o2 == null)
				return -1;
			else if (o1.equals(o2))
				return 0;

			Boolean compare = comparator.run(o1, o2);
			if (compare == null)
				return -1;
			else if (compare)
				return -1;
			else
				return 1;
		}
	}
}
