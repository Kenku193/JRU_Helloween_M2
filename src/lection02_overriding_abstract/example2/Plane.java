package lection02_overriding_abstract.example2;


public class Plane extends Aircraft {

    @Override // ПЕРЕОПРЕДЕЛИЛ!!!
    public void doFly() {
        System.out.println("Я лечу благодаря крылу");
    }

}
