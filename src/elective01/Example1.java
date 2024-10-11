package elective01;

import lection06_labdas.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<lection06_labdas.Car> cars = new ArrayList<>();
        cars.add(new lection06_labdas.Car("BMW", "Red"));
        cars.add(new lection06_labdas.Car("Mercedes", "White"));
        cars.add(new lection06_labdas.Car("Tesla", "Red"));
        cars.add(new lection06_labdas.Car("Lada", "Blue"));
        cars.add(new lection06_labdas.Car("VW", "Black"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));
        cars.add(new Car("Lancia", "Silver"));

        System.out.println(cars);

        Stream<Car> stream = cars.stream();
//        Predicate<elective01.Car> carPredicate = new Predicate<elective01.Car>() {
//            @Override
//            public boolean test(elective01.Car car) {
//                return car.getColor().equals("Red");
//            }
//        };

        Predicate<elective01.Car> carPredicate = car -> car.getColor().equals("Red");

      //  List<Car> red = stream.filter(car -> car.getColor().equals("Red")).collect(Collectors.toList());

        // V1
//        Optional<Car> optionalRedV1 = stream.filter(car999 -> car999.getColor().equals("Red")).findFirst();
//        Car car999;
//        if (optionalRedV1.isPresent()){
//           car999 = optionalRedV1.get();
//            System.out.println(car999);
//        }

        // V2
        Car car = stream.filter(car888 -> car888.getColor().equals("Pink")).findFirst().orElseThrow();
        System.out.println(car);

    }
}