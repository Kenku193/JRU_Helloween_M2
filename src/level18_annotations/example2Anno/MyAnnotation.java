package level18_annotations.example2Anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // РАБОТАЕТ В Runtim'e
@Target(ElementType.TYPE) // МОЖЕТ СТОЯТЬ ТОЛЬКО НАД КЛАССОМ
public @interface MyAnnotation {
    String name() default "Yura";
    int value();
}
