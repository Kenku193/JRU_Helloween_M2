package level18_annotations.example2Anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.WeakHashMap;

public class App {
    public static void main(String[] args) {

        Class<Human> humanClass = Human.class;
        Annotation[] declaredAnnotations = humanClass.getDeclaredAnnotations();

        Arrays.stream(declaredAnnotations).forEach(System.out::println);

        Method[] declaredMethods = humanClass.getDeclaredMethods();
        Method declaredMethod = declaredMethods[0];
        System.out.println(declaredMethod);
        Annotation[] declaredAnnotationsOnMethod = declaredMethod.getDeclaredAnnotations();

        Annotation annotation = declaredAnnotationsOnMethod[0];
        System.out.println(annotation);


    }
}
