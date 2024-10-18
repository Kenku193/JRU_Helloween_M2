package level08_staticAndConstructors.example1;

public class App2 {
    public static void main(String[] args) {

        Class<?> reflect = ClassLoaderDemo.class;

        System.out.println(reflect.getClassLoader());

    }
}
