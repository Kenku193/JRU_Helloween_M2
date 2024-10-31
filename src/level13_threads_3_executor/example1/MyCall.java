package level13_threads_3_executor.example1;

import java.util.concurrent.*;

public class MyCall implements Callable<String> {
    String s;

    public MyCall(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Работает поточный объект импл Callable " + s);
        return s + " My dear JR friend";
    }
}

class Solution {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // ПУЛ ПОТОКОВ
        // НЕ ПРЕКРАЩАЕТ РАБОТУ САМ!
        // КАССА!
        ExecutorService executorService = Executors.newFixedThreadPool(8);

        // 1 и 2 -> Task
        MyCall myCall1 = new MyCall("Я первый");
        MyCall myCall2 = new MyCall("Я второй");
        // 3 и 4 -> Task
        MyCall myCall3 = new MyCall("Я третий");
        MyCall myCall4 = new MyCall("Я четвертый");

        Future<String> future = executorService.submit(myCall1);
        String s = future.get();
        System.out.println(s);

        executorService.submit(myCall2);
        executorService.submit(myCall3);
        executorService.submit(myCall4);

        executorService.shutdown();

        executorService.submit(myCall4);

    }
}
