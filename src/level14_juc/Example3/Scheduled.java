package level14_juc.Example3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.*;

public class Scheduled {
    public static void main(String[] args) {
        // СПЕЦИАЛЬНЫЙ ЭКЗЕКЬЮТОР-ЗАМЕДЛИТЕЛЬ / ЭКЗЕКЬЮТОР-РИТМИК
        ScheduledExecutorService myExecutor = Executors.newScheduledThreadPool(8);

        // ПОТОК ДЛЯ ПРИМЕРА - БОЛЬШОЕ ВЫЧИСЛЕНИЕ И СЛИП
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + Integer.MAX_VALUE * Long.MAX_VALUE + (Long.MAX_VALUE - Double.MIN_VALUE));
            }
        };


        // ЗАГОНЯЕМ В НАШ ЭКЗЕКЬЮТОР t 50 РАЗ
        for (int i = 0; i < 50; i++) {
            // ВЫПОЛНЯТЬСЯ БУДУТ С ЗАДЕРЖКОЙ В 3 СЕК
           //myExecutor.schedule(t, 3, TimeUnit.SECONDS);
            // ВЫПОЛНЯТЬСЯ БУДУТ С ЗАДЕРЖКОЙ В 1 МИНУТУ
            // myExecutor.schedule(t, 1, TimeUnit.MINUTES);
        }

        // ПРИЗЫВАЕМ НАШ ЭКЗЕКЬЮТОР ЗАВЕРШИТЬСЯ
        myExecutor.shutdown();
    }
}
