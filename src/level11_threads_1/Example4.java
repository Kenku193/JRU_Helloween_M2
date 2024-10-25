package level11_threads_1;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {

        ThreadyLady threadyLady = new ThreadyLady();
        threadyLady.start();
       // threadyLady.stop();
    }
}

class ThreadyLady extends Thread {
    @Override
    public void run() {

        int c = 0;
        while (true){
            System.out.println("Tik");
            System.out.println("Tak");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            c++;

            if (c == 5){
                Thread.currentThread().stop();
            }

        }
    }
}
