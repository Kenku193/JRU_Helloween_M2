package level18_annotations.example2Anno;

import java.lang.annotation.Documented;

@MyAnnotation(value = 0, name = "Olga")
@Deprecated
public class Human {

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
