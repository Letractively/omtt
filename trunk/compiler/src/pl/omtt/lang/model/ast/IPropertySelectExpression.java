package pl.omtt.lang.model.ast;

import java.lang.reflect.Method;

public interface IPropertySelectExpression extends IExpression {
	boolean isPropertyMethodNeedsTypeWrapping ();
	Method getPropertyMethod();
}
