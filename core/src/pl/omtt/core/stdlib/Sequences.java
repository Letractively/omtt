package pl.omtt.core.stdlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import pl.omtt.core.annotations.OmttModule;
import pl.omtt.core.functions.Function2;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.core.functions.Type;

@OmttModule
public class Sequences {
	public static Integer count(Collection<Object> c) {
		if (c == null)
			return 0;
		else
			return c.size();
	}

	public Boolean contains(Collection<Object> c1, Collection<Object> c2) {
		if (c2 == null)
			return Boolean.TRUE;
		else if (c1 == null)
			return Boolean.FALSE;
		return c1.containsAll(c2);
	}
	
	@Type("(_[1]* -> _[1]*)")
	public static Collection<Object> distinct(Collection<Object> c) {
		Set<Object> set = new HashSet<Object>();
		if (c != null)
			set.addAll(c);
		return new ArrayList<Object>(set);
	}

	public static boolean empty(Collection<Object> c) {
		return c == null || c.isEmpty();
	}

	@Type("(_[1]* -> _[1])")
	@SuppressWarnings("unchecked")
	public static Object head(Collection<Object> seq) {
		if (seq == null || seq.isEmpty())
			return null;
		else if (seq instanceof List)
			return ((List) seq).get(0);
		else
			return seq.iterator().next();
	}

	@Type("(_[1]* ~(_[1] _[1] -> Boolean) -> _[1])")
	@SuppressWarnings("unchecked")
	public static Object max(Collection<Comparable> seq,
			@Optional @Name("lower") Function2<Boolean, Object, Object> lower) {
		if (seq == null)
			return null;
		else if (lower == null)
			return Collections.max(seq);
		else
			return Collections.max(seq, new FunctionComparator(lower));
	}

	@Type("(_[1]* ~(_[1] _[1] -> Boolean) -> _[1])")
	@SuppressWarnings("unchecked")
	public static Object min(Collection<Comparable> seq,
			@Optional @Name("lower") Function2<Boolean, Object, Object> lower) {
		if (seq == null)
			return null;
		else if (lower == null)
			return Collections.min(seq);
		else
			return Collections.min(seq, new FunctionComparator(lower));
	}

	@Type("(_[1]* ~(_[1] _[1] -> Boolean) -> _[1]*)")
	@SuppressWarnings("unchecked")
	public static List<Object> sort(Collection<Object> c,
			@Optional @Name("lower") Function2<Boolean, Object, Object> lower) {
		List list = new ArrayList(c);
		try {
			if (lower == null)
				Collections.sort(list);
			else
				Collections.sort(list, new FunctionComparator(lower));
		} catch (ClassCastException e) {
		}
		return list;
	}

	@Type("(_[1]* -> _[1]*)")
	@SuppressWarnings("unchecked")
	public static Collection<Object> tail(Collection<Object> seq) {
		if (seq == null || seq.isEmpty())
			return seq;

		if (!(seq instanceof List)) {
			List list = new ArrayList(seq.size());
			list.addAll(seq);
			seq = list;
		}
		return ((List) seq).subList(1, seq.size());
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
