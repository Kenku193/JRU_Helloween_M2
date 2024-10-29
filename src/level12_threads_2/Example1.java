package level12_threads_2;

public class Example1 {
    // ОБЩИЙ РЕСУРС
    static int account = 7000;

    public static void main(String[] args) throws InterruptedException {

        System.out.println(account);

        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread th1 = new Thread(myRunnable1);
        Thread th2 = new Thread(myRunnable2);

        th1.start();
        th2.start();

        th1.join(); // join ОН ДЛЯ ВЫЗЫВАЮЩЕГО ПОТОКА - ПОТОК main ДОЖДЕДТСЯ ОКОНЧАНИЯ ОСТАЛЬНЫХ
        th1.join(); // join ОН ДЛЯ ВЫЗЫВАЮЩЕГО ПОТОКА

        System.out.println(account);

    }
}

class MyRunnable implements Runnable {
    public void run() {
        Example1.account++;
    }
}
