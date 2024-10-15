package level07_casting;

public class Example3 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Fish fish = new Fish();

        System.out.println(fish instanceof Swimable);
        System.out.println(fish instanceof Animal);

        Integer a = null;
        System.out.println(a instanceof Integer);

    }
}
