package lection04_interfaces.example1.entity;

import lection04_interfaces.example1.Drivable;

public class Moped implements Drivable {
    @Override
    public void sell() {
        System.out.println("Мопед продался");
    }
}
