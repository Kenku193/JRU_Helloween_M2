package lection02_overriding_abstract.example1;

public class App {
    public static void main(String[] args) {

        //Aircraft aircraft = new Aircraft();

        Aircraft.myMethod();
        System.out.println(Aircraft.PI);

        Plane plane = new Plane();
        plane.doFly();
        plane.someMethod();
    }
}
