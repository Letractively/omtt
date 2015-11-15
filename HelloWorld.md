**sample.omtt**:
```
% def hello
  Hello, world!
% end
```

<br>
<b>sample.java</b>:<br>
<pre><code>import pl.omtt.caller.OmttCaller;<br>
<br>
public class Launcher {<br>
	public static void main (String[] args) {<br>
		OmttCaller.print("sample.hello");<br>
	}<br>
}<br>
</code></pre>