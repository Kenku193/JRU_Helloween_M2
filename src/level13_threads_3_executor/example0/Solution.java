package level13_threads_3_executor.example0;

public class Solution {
    public static void main(String[] args) {

        // СОЗДАЛИ ГРУППУ parentGroup
        ThreadGroup parentGroup = new ThreadGroup("parentGroup");
        Thread t1 = new Thread(parentGroup, new MyTh());
        // Thread th1 = new Thread(parentGroup, () -> System.out.println("Hello parent!"));


        ThreadGroup childGroup = new ThreadGroup(parentGroup, "childGroup");
        Thread t2 = new Thread(childGroup, new MyTh());

        // СТАРТУЕМ ПОТОКИ
        t1.start();
        t2.start();

        System.out.println("ЗАПРАШИВАЕМ КОЛ-ВО ЖИВЫХ НИТЕЙ В ГРУППЕ И ПОДГУППАХ");
        int countAlive = parentGroup.activeCount();
        System.out.println(countAlive);

        System.out.println(childGroup.activeCount());

        System.out.println("ЗАПРАШИВАЕМ КОЛ-ВО ЖИВЫХ ПОДГУПП В ГРУППЕ И ПОДГУППАХ");
        System.out.println(parentGroup.activeGroupCount());
        System.out.println(childGroup.activeGroupCount());

        System.out.println("ЗАПРАШИВАЕМ ИМЯ ГРУППЫ");
        System.out.println(parentGroup.getName());
        System.out.println(childGroup.getName());

        System.out.println("ЗАПРАШИВАЕМ РОДИТЕЛЬСКУЮ ГРУППЫ");
        ThreadGroup parent = childGroup.getParent();
        System.out.println(parent);

        ThreadGroup grandParent = parentGroup.getParent();
        System.out.println(grandParent);

        System.out.println("ЗАПРАШИВАЕМ ДЕМОН ИЛИ НЕТ");
        System.out.println(parentGroup.isDaemon());
        System.out.println(childGroup.isDaemon());

        System.out.println("ЗАПРАШИВАЕМ МАКС ПРИОРИТЕТ ПОТОКА В ГРУППЕ");
        int maxPriority = childGroup.getMaxPriority();
        System.out.println(maxPriority);

        childGroup.setMaxPriority(Thread.MAX_PRIORITY);

    }
}

class MyTh implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Hello, i'm thread " + this.getClass().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
