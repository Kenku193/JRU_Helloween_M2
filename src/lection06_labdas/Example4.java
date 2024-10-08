package lection06_labdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red"));
        cars.add(new Car("Mercedes", "White"));
        cars.add(new Car("Tesla", "Red"));
        cars.add(new Car("Lada", "Blue"));
        cars.add(new Car("VW", "Black"));
        cars.add(new Car("Lancia", "Silver"));

        Stream<Car> stream = cars.stream();

        // Predicate<Car> carPredicate = car -> car.color.equals("Red");

        List<Car> redCars = stream.filter(car -> car.getColor().equals("Red")).toList();
        System.out.println(redCars);


    }
}
