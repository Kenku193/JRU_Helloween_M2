package lection04_interfaces.example1.entity;

import lection04_interfaces.example1.Drivable;

public class Motorcycle implements Drivable {
    @Override
    public void goStraight() {
        System.out.println("Мотоцикл едет прямо");
    }

    @Override
    public void goLeft() {
        System.out.println("Мотоцикл едет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Мотоцикл едет направо");
    }

    @Override
    public void goBack() {
        System.out.println("Мотоцикл едет назад");
    }
    @Override
    public void sell() {
        System.out.println("Мотоцикл продалась");
    }
}
