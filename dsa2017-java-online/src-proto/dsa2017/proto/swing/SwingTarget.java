package dsa2017.proto.swing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SwingTarget {

	Class<?> value();

}
