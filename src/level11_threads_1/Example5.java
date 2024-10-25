package level11_threads_1;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {

        ThreadyLady1 threadyLady1 = new ThreadyLady1();
        threadyLady1.start();

        Thread.sleep(3000);

    //    threadyLady1.isStopped = true;

        threadyLady1.interrupt();

    }
}

class ThreadyLady1 extends Thread {

    boolean isStopped;

    @Override
    public void run() {
        while (true){
            System.out.println("Tik");
            System.out.println("Tak");
            if (isInterrupted()) break;
        }
    }
}

