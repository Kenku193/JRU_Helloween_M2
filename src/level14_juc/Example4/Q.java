package level14_juc.Example4;


import java.util.concurrent.ArrayBlockingQueue;

public class Q {
    public static void main(String[] args) throws InterruptedException {
        // ОЧЕРЕДЬ НА 2 ЭЛЕМЕНТА
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(2);
        // ПОТОК НА ДОБАВЛЕНИЕ - PRODUCER
        new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        arrayBlockingQueue.put("Java " + i);
                        System.out.println("Элемент " + i + " добавлен!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        // ПОТОК НА ИЗВЛЕЧЕНИЕ - CONSUMER
        new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(1500);
                        // ИЗВЛЕКАЕМ 1 ЭЛЕМЕНТ
                        System.out.println("Элемент " + arrayBlockingQueue.take() + " извлечен!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
