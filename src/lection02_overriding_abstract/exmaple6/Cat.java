package lection02_overriding_abstract.exmaple6;

public class Cat extends Animal{

    String name;

    @Override
    void doSound() {
        System.out.println("Standart sound");
    }

    @Override
    void doSound(String s) {
        System.out.println(s);
    }
}
