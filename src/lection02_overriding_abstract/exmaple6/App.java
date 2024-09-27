package lection02_overriding_abstract.exmaple6;

public class App {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.doSound();
        cat.doSound("МЯУ");
        cat.name = "Барсик";

        Duck duck = new Duck();
        duck.doSound();
        duck.doSound("КРЯЯЯЯЯ!!!!!");

    }
}
