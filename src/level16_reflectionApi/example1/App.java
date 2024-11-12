package level16_reflectionApi.example1;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws IllegalAccessException {

        Field[] declaredFields = Person.class.getDeclaredFields();
        List<Field> declaredFieldsList = List.of(declaredFields);
        for (Field field : declaredFieldsList) {
            System.out.println(field);
        }

        System.out.println("-".repeat(100));
        System.out.println("По полям:");

        Field field = declaredFieldsList.get(0);
        Type genericType = field.getGenericType();
        System.out.println(genericType);

        System.out.println("-".repeat(100));
        System.out.println("По методам:");

        Method[] declaredMethods = Person.class.getDeclaredMethods();
        List<Method> declaredMethodsList = List.of(declaredMethods);
        System.out.println(declaredMethodsList.get(1));

        Parameter[] parameters = declaredMethodsList.get(1).getParameters();
        System.out.println(parameters[0].isVarArgs());

    }
}
