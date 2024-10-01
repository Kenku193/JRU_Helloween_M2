package lection04_interfaces.example1.entity;

import lection04_interfaces.example1.Drivable;

public class Car implements Drivable {

    @Override
    public void goStraight() {
        System.out.println("Машина едет вперед");
    }

    @Override
    public void goLeft() {
        System.out.println("Машина едет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Машина едет направо");
    }

    @Override
    public void goBack() {
        System.out.println("Машина едет назад");
    }

    @Override
    public void sell() {
        System.out.println("Машина продалась");
    }
}
