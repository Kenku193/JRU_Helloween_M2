package lection02_overriding_abstract.example4;

public class Plane extends Aircraft{
    @Override
    public void doFly() {
        System.out.println("Я метод doFly класса Plane");
    }
}
