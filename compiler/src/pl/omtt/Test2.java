package pl.omtt;

import pl.omtt.core.functions.*;
import pl.omtt.core.stdlib.TextBuffer;

public class Test2 {
    @Type("(_ -> Data)")
    static public void sample (final TextBuffer $buffer, @Name("it") final Object it) {
        if (it instanceof Double) {
            $buffer.append("->" + it);
            sample$t0($buffer, (Double) it);
            $buffer.append("->" + it);
            return;
        }
        if (it instanceof Integer) {
            $buffer.append("->" + it);
            sample$t1($buffer, (Integer) it);
            $buffer.append("->" + it);
            return;
        }
    }

    static private void sample$t0 (final TextBuffer $buffer, @Name("it") final Double it) {
        $buffer.append("departament\n");
    }

    static private void sample$t1 (final TextBuffer $buffer, @Name("it") final Integer it) {
        $buffer.append("pracownik\n");
    }

    static private void f$t2 (final TextBuffer $buffer) {
        sample($buffer, 1);
        $buffer.append("\n");
    }

    public static void main (String[] args) {
    	TextBuffer buf = new TextBuffer();
    	f$t2(buf);
    	System.out.println(buf);
    }
    
    public interface IFunction {
    	public void print ();
    }
}
