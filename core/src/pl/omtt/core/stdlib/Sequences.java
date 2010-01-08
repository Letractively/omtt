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
import pl.omtt.core.functions.Function1;
import pl.omtt.core.functions.Function2;
import pl.omtt.core.functions.Name;
import pl.omtt.core.functions.Optional;
import pl.omtt.core.functions.Type;

@OmttModule
public class Sequences {
	@Type("(Real* -> Real)")
	public static Double avg(Collection<Double> c) {
		Double acc = 0.;
		int count = 0;
		for (Number r : c) {
			if (r == null)
				return null;
			acc += r.doubleValue();
			count++;
		}
		if (count > 0)
			return acc / count;
		else
			return null;
	}

	public static Long count(Collection<Object> c) {
		if (c == null)
			return 0l;
		else
			return Long.valueOf(c.size());
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

	@Type("(_[1]* _[2] (_[1] _[2] -> _[2]) -> _[2])")
	public static Object fold(Collection<Object> c, @Name("acc") Object acc,
			@Name("fun") Function2<Object, Object, Object> f) {
		for (Object cur : c)
			acc = f.run(cur, acc);
		return acc;
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

	@Type("(_[1]* (_[1] ?Int -> _[2]) -> _[2]*")
	public static Collection<Object> numbermap (Collection<Object> c, Function2<Object, Object, Long> f) {
		List<Object> l = new ArrayList<Object> ();
		long i = 0l;
		for (Object element : c)
			l.add(f.run(element, i++));
		return l;
	}

	@Type("(_[1]* -> _[1]*)")
	public static Collection<Object> reverse(Collection<Object> c) {
		List<Object> l = new ArrayList<Object>(c);
		Collections.reverse(l);
		return l;
	}

	@Type("(_[1]* _[2]* (_[1] _[2]* -> _[2]*) -> _[2]*)")
	public static Collection<Object> seqfold(
			Collection<Object> c,
			@Name("acc") Collection<Object> acc,
			@Name("fun") Function2<Collection<Object>, Object, Collection<Object>> f) {
		for (Object cur : c)
			acc = f.run(cur, acc);
		return acc;
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

	@Type("(_[1]* (_[1] -> _[2]) (_[1] -> _[2]) -> _[2]*")
	public static Collection<Object> roundrobin(Collection<Object> c,
			Function1<Object, Object> f1, Function1<Object, Object> f2) {
		List<Object> l = new ArrayList<Object>();
		if (c == null || f1 == null || f2 == null)
			return l;
		int i = 0;
		for (Object element : c) {
			if (i % 2 == 0)
				l.add(f1.run(element));
			else
				l.add(f2.run(element));
			i++;
		}
		return l;
	}

	@Type("(Real* -> Real)")
	public static Double sum(Collection<Double> c) {
		Double acc = 0.;
		for (Number r : c) {
			if (r == null)
				return null;
			acc += r.doubleValue();
		}
		return acc;
	}

	@Type("(Int* -> Int)")
	public static Long sumi(Collection<Long> c) {
		Long acc = 0l;
		for (Long n : c) {
			if (n == null)
				return null;
			acc += n;
		}
		return acc;
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
