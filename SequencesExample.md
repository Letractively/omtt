**sequences.omtt**:
```
/* Start (*) following type (e.g. Int) declares sequence.
 * Colon at the end of def line means, that the body is expression, not textual data.
 */
% def doubleIntegers ints.Int*:
  map ints as anint:
    anint * 2
% end

/* Indicating concrete type is not necessary. When no type, compiler assumes it is Any.
 * (Any is, following naming in Scala, equivalent of java's Object.)
 */
% def html_list items*
  <ul>
    % map items as item
      <li>{item}</li>
    % end
  </ul>
% end

```

<br>
<b>sequences.java</b>:<br>
<pre><code>import java.util.*;<br>
import pl.omtt.caller.OmttCaller;<br>
<br>
public class Launcher {<br>
  public static void main (String[] args) {<br>
    List&lt;Integer&gt; list = new ArrayList&lt;Integer&gt;();<br>
    list.add(1);<br>
    list.add(3);<br>
    list.add(6);<br>
    list.add(8);<br>
<br>
    // will print numbers as html list (i.e. "&lt;ul&gt;\n&lt;li&gt;1&lt;/li&gt;\n&lt;li&gt;3&lt;/li&gt;...&lt;/ul&gt;")<br>
    OmttCaller.print("sequences.doubleIntegers", list);<br>
<br>
    // will print [2, 6, 12, 16]<br>
    OmttCaller.print("sequences.doubleIntegers", list);<br>
  }<br>
}<br>
</code></pre>