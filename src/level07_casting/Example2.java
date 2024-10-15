package level07_casting;

public class Example2 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(animal instanceof Animal);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Dog);

        System.out.println("-".repeat(100));

        System.out.println(cat instanceof Puffable);
        System.out.println(dog instanceof Puffable);
        System.out.println(animal instanceof Puffable);

        System.out.println("-".repeat(100));

        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Object);

        System.out.println("-".repeat(100));

        System.out.println(null instanceof Object);


    }
}

