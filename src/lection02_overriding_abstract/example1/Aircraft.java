package lection02_overriding_abstract.example1;

public abstract class Aircraft {

    public abstract void doFly();

    public void someMethod(){
        System.out.println("Что-то делаю");
    };

    public static final double PI = 3.14;
    public static void myMethod(){
        System.out.println("Реализация статического метода");
    };

}
