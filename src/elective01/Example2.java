package elective01;

import lection06_labdas.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        ArrayList<lection06_labdas.Car> cars = new ArrayList<>();
        cars.add(new lection06_labdas.Car("BMW", "Red"));
        cars.add(new lection06_labdas.Car("Mercedes", "White"));
        cars.add(new lection06_labdas.Car("Tesla", "Red"));
        cars.add(new lection06_labdas.Car("Lada", "Blue"));
        cars.add(new lection06_labdas.Car("VW", "Black"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));

        Car carFromStream =
                cars
                        .stream()
                        .filter(car -> car.getColor().equals("Red"))
                        .findFirst()
                        .orElseThrow();

        //   cars.stream().forEach(System.out::println);

        Stream.of("Один", "Два", "Три", "Два", "Один", "10");
        Integer[] integers = {1, 10, 2, 12, 98};
        Stream<Integer> stream = Arrays.stream(integers);

        Stream<Object> build = Stream.builder().add(0.9).add(21.1).add(987.2).build();

        //Stream.generate(() -> Math.random()).forEach(System.out::println);

        Stream.iterate(0, n -> ++n).forEach(System.out::println);


    }
}
