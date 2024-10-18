package level08_staticAndConstructors.example1;

import java.io.PrintStream;
import java.sql.SQLData;

public class ClassLoaderDemo {

    private static int count = 10;

    static {
        System.out.println(count);
    }

    public static void main(String[] args) {

        System.out.println("count = " + count);

        // ПРИМЕР КОНКРЕТНОГО КЛАССА
        Class<?> stringClass = ClassLoaderDemo.class;
        printClassInfo(stringClass);

        System.out.println("-".repeat(100));

        // ПРИМЕР С МАССИВОМ КЛССОВ
        Class<?>[] classes = {
                String.class,
                SQLData.class,
                ClassLoaderDemo.class
        };
        for (Class<?> aClass : classes) {
            printClassInfo(aClass);
        }

        System.out.println("-".repeat(100));

        // ПРИМЕР ИЕРАРХИИ КЛАССЛОАДЕРОВ
        ClassLoader current = ClassLoaderDemo.class.getClassLoader(); // Получим класслоадер текушего класса
        System.out.println(current);

        ClassLoader parent = current.getParent(); // Получим класслоадер-предок для текущего
        System.out.println(parent);

        ClassLoader bs = parent.getParent(); // Получим класслоадер-предок для предка текущего
        System.out.println(bs);

    }

    private static void printClassInfo(Class<?> clazz){
        String name = clazz.getName();
        Package aPackage = clazz.getPackage();
        ClassLoader classLoader = clazz.getClassLoader();

        System.out.printf("loader=%s name=%s package=%s%n", classLoader, name, aPackage);
    }

    static {
        count = 99;
    }
}
