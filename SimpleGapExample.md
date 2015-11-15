**gapExample.omtt**:
```
/* arguments body and title are obligatory
 * while footer is optional
 */
% def page content title ~footer
<html>
  <head>
    <title>{title}</title>
  </head>
  <body>
    {content}
    <hr>
    <!-- when footer is not set, default string will be used -->
    {footer or "default footer generated with OMTT"}
  </body>
</html>
% end
```

<br>
<b>gapExample.java</b>:<br>
<pre><code>import pl.omtt.caller.OmttCaller;<br>
<br>
public class Launcher {<br>
  public static void main (String[] args) {<br>
    OmttCaller.print("gapExample.page", "Some page content", "Sample page title");<br>
  }<br>
}<br>
</code></pre>