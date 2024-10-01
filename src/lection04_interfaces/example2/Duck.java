package lection04_interfaces.example2;

public class Duck implements Swimable, Flyable{
    @Override
    public void go() {
       // Flyable.super.go();
    }
}
