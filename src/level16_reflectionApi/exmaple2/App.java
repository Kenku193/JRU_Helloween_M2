package level16_reflectionApi.exmaple2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException {

        Employee employee = Employee.class.newInstance();
        System.out.println(Employee.class.getName());
        System.out.println(Arrays.toString(Employee.class.getDeclaredFields()));

        Class<?> aClass = Class.forName("level16_reflectionApi.exmaple2.Employee");
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));

        Constructor<?>[] constructors = Employee.class.getConstructors();
        Class<?>[] parameterTypes = constructors[1].getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));

        Employee employeeFromNewInstance = (Employee) constructors[1].newInstance("A", "B", 99);
        System.out.println(employeeFromNewInstance);

        System.out.println("-".repeat(100));

        Field name = Employee.class.getDeclaredField("name");
        System.out.println(employee);
        name.setAccessible(true);
        name.set(employee, "PETYA");
        System.out.println(employee);

    }
}
