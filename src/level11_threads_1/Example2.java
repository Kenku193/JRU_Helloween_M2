package level11_threads_1;

public class Example2 {
    public static void main(String[] args) {

        // Implements Runnable

        Counter counter = new Counter();

        Thread thread = new Thread(counter);
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        // ЧЕРЕЗ АНОНИМНЫЙ КЛАСС
        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Шаг цикла "
                            + i
                            + " поток "
                            + Thread.currentThread().getName()
                    );
                }
            }
        };

        // ЧЕРЕЗ АНОНИМНЫЙ КЛАСС СРАЗУ ПОДАННЫЙ В КОНСТРУКТОР Thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Шаг цикла "
                            + i
                            + " поток "
                            + Thread.currentThread().getName()
                    );
                }
            }
        }).start();

        // ЧЕРЕЗ ЛЯМБДУ СРАЗУ ПОДАННУЮ В КОНСТРУКТОР Thread
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Шаг цикла "
                        + i
                        + " поток "
                        + Thread.currentThread().getName()
                );
            }
        }).start();

        // ЗАПУСК Implements Runnable
        thread.start();
        thread1.start();
        thread2.start();

        // ЗАПУСК ЧЕРЕЗ АНОНИМНЫЙ КЛАСС
        new Thread(myRun).start();

    }
}

class Counter implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Шаг цикла "
                    + i
                    + " поток "
                    + Thread.currentThread().getName()
            );
        }
    }
}