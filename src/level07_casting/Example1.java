package level07_casting;


public class Example1 {
    public static void main(String[] args) {

        Animal animal = new Cat();

        animal.eat();
        animal.sleep();

        System.out.println(animal instanceof Dog);

        Dog belka = (Dog) animal;

        belka.bark();
    }

}

