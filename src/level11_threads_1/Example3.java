package level11_threads_1;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Начало");

        Thread.sleep(5000);
        new Thread(new Sleeper()).start();

        System.out.println("Завершение");

    }
}

class Sleeper implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


