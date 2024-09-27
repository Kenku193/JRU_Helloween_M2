package lection02_overriding_abstract.exmaple6;

public class Duck extends Animal{
    @Override
    void doSound() {
        System.out.println("КРЯ");
    }
    @Override
    void doSound(String s) {
        System.out.println("КРЯ с ПАРАМЕТРОМ " + s);
    }

    public void swim(){
        System.out.println("Я плыву");
    }
}
