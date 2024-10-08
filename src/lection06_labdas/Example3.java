package lection06_labdas;

public class Example3 {
    public static void main(String[] args) {

        Calculabe sum = (x, y) -> x + y;

        int a = sum.calculate(9, 10);
        System.out.println(a);

        Calculabe minus = (x, y) -> x - y;
        int m = minus.calculate(99, 99);
        System.out.println(m);

        Calculabe sumAndLogging = ((x, y) -> {
            System.out.println("начинаем подсчет");
            int n = x + y;
            System.out.println("закончили подсчет");
            return n;
        });

        System.out.println(sumAndLogging.calculate(88, 99));

    }
}
