package lection01_oop;

public class LaserPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Я ПЕЧАТАЮ НА ЛАЗЕРНЫЙ ПРИНТЕР");
    }
}
