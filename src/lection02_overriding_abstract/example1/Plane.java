package lection02_overriding_abstract.example1;


public class Plane extends Aircraft {

    @Override // ПЕРЕОПРЕДЕЛИЛ!!!
    public void doFly() {
        System.out.println("Я лечу благодаря крылу");
    }

    @Override
    public void someMethod() {
        System.out.println("Я someMethod из самолета!");
        //super.someMethod();
    }

}
