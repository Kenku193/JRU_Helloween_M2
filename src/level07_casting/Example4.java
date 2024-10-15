package level07_casting;

public class Example4 {
    public static void main(String[] args) {

        Fish fish = new Fish();
        Cat cat = new Cat();
        System.out.println(fish.getClass());

        if (fish.getClass().equals(cat.getClass())){
            System.out.println("Да как такое может быть?");
        }
        else {
            System.out.println("nono!");
        }


    }
}
