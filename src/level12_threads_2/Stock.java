package level12_threads_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Stock { // БИРЖА
    public static Integer fee = 0; // КОМИССИЯ ЗА УСЛУГИ

    AtomicInteger atomicInteger = new AtomicInteger(10);

    public static final Object monitor = new Object();

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Task task = new Task();
            tasks.add(task);
            task.start();
            System.out.println(Stock.fee);
        }

        System.out.println("All started");

        for (Task task : tasks) {
            try {
                task.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(fee);
    }
}

class Task // ПАТТЕРН?
        extends Thread{
    @Override
    public void run() {
        synchronized (Stock.monitor){
            Stock.fee+=getOneFee(); // <- Это дверь в туалет с замком, а замок это Stock.monitor
        }
    }
    private Integer getOneFee(){
        return 1;
    }
}

// Singleton
// Fabric
// Decorator
// Task
// Producer / Consumer