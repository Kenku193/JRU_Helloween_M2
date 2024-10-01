package lection04_interfaces.example1.entity;

import lection04_interfaces.example1.Drivable;
import lection04_interfaces.example1.Swimable;

public class Boat implements Drivable, Swimable {

    @Override
    public void goStraight() {
        System.out.println("Лодка едет прямо");
    }

    @Override
    public void goLeft() {
        System.out.println("Лодка едет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Лодка едет направо");
    }

    @Override
    public void goBack() {
        System.out.println("Лодка едет назад");
    }

    @Override
    public void throwAhchor() {
        System.out.println("Якорь брошен");
    }

    @Override
    public void sell() {
        System.out.println("Продалась");
    }
}
