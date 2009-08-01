package pl.omtt;

import pl.omtt.core.functions.*;

public class Test2 {
    public Double f (final Integer n) {
        final Integer x = (n) * (1);
        final Double y = 2.2;
        
        return (x) + (y);
    }

    public int x (Function1<Integer, Integer> f) {
    	Function1<Integer,Integer> g = new Function1<Integer, Integer>() {
			@Override
			public Integer run(Integer arg0) {
				return null;
			}
		};
    	g.run(1);
    	return 0;
    }
    
    public static void main (String[] args) {
    	System.out.println(2 * 3 % 4);
    }
    
    public interface IFunction {
    	public void print ();
    }
}
