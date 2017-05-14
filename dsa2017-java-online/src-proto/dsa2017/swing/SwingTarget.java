package dsa2017.swing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SwingTarget {

	Class<? extends SwingBaseModule> value();

}
