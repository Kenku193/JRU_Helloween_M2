package elective01;

import lection06_labdas.Car;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example3 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(10, 20, 10, 30, 20, 40, 50, 60, 70, 10, 70, 100, 40);

        integerList
                .stream()
                .filter(n -> n > 20)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        integerList
                .stream()
                .filter(n -> n > 20)
                .skip(5)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        integerList
                .stream()
                .filter(n -> n > 20)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        integerList
                .stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        ArrayList<lection06_labdas.Car> cars = new ArrayList<>();
        cars.add(new lection06_labdas.Car("BMW", "Red"));
        cars.add(new lection06_labdas.Car("Mercedes", "White"));
        cars.add(new lection06_labdas.Car("Tesla", "Red"));
        cars.add(new lection06_labdas.Car("Lada", "Blue"));
        cars.add(new lection06_labdas.Car("VW", "Black"));
        cars.add(new lection06_labdas.Car("Lancia", "Silver"));
        cars.add(new lection06_labdas.Car("Lancia", "White"));
        cars.add(new Car("Lancia", "Black"));

        List<String> colors = cars.stream().map(s -> s.getColor()).distinct().toList();
        System.out.println(colors);

        long count = cars.stream().map(s -> s.getColor()).distinct().count();
        System.out.println(count);

        boolean isLancia = cars.stream().anyMatch(car -> car.getBrand().equals("Lancia"));
        System.out.println(isLancia);

        boolean isAllLancia = cars.stream().allMatch(car -> car.getBrand().equals("Lancia"));
        System.out.println(isAllLancia);

        Integer max = integerList.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(max);

        Car car = cars.stream().max((o1, o2) -> o1.getBrand().length() - o2.getBrand().length()).orElseThrow();
        System.out.println(car);

        System.out.println(Collections.max(integerList));

    }
}
