package dsa2017.swing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SwingActionMarker {

	Class<? extends SwingActionListener> value();

}
