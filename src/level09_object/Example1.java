package level09_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Example1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car car1 = new Car("Toyota", 10, new Engine(100));
        Car car2 = new Car("VW", 150, new Engine(345));

        System.out.println(car1.toString());

        Integer a = new Integer(50);
        Integer b = new Integer(50);

        // int value = ?->999
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("-".repeat(100));

        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println("-".repeat(100));

        Car clone = (Car) car1.clone();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(clone);

        clone.engine.engineNumber = 500;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(clone);

        System.out.println("-".repeat(100));

        Class<? extends Car> aClass = car1.getClass();

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Set<Car> set = new HashSet<>();
        set.add(car1);
        set.add(car2);

        System.out.println(set);
        System.out.println(set.contains(car1) + " " + set.contains(car2));

        car1.model = null;

        System.out.println(set);
        System.out.println(set.contains(car1) + " " + set.contains(car2));

    }
}

class Car implements Cloneable {

    String model;
    int power;
    Engine engine;

    private void myMethod() {
    }

    public Car(String model, int power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (power != car.power) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //  return super.clone();
        return new Car(this.model, this.power, new Engine(this.engine.engineNumber));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                '}';
    }
}

class Engine {
    int engineNumber;

    public Engine(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        return engineNumber == engine.engineNumber;
    }

    @Override
    public int hashCode() {
        return engineNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineNumber=" + engineNumber +
                '}';
    }
}
