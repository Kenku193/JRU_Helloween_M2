package lection06_labdas;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red"));
        cars.add(new Car("Mercedes", "White"));
        cars.add(new Car("Tesla", "Red"));
        cars.add(new Car("Lada", "Blue"));
        cars.add(new Car("VW", "Black"));
        cars.add(new Car("Lancia", "Silver"));
        cars.add(new Car("Lancia", "Silver"));
        cars.add(new Car("Lancia", "Silver"));

        System.out.println(cars);

//        for (int i = 0; i < cars.size(); i++) {
//            cars.get(i).setColor("Pink");
//        }

//        cars.stream().forEach(car -> car.setColor("PINK"));

        cars.parallelStream().forEach(car -> car.setColor("PINK"));

        System.out.println(cars);

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);


    }
}
