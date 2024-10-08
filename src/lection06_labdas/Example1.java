package lection06_labdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<String> week = new ArrayList<>();
        week.add("Понедельник");
        week.add("Вторник");
        week.add("Среда");
        week.add("Четверг");
        week.add("Пятница");
        week.add("Суббота");
        week.add("Воскресенье");

        System.out.println(week);
        //Collections.sort(week);
        Collections.sort(week, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(week);

        System.out.println("-".repeat(100));

        // Consumer<String> cons = s -> System.out.println(s);

        // week.forEach(s -> System.out.println(s));

        week.forEach(MyLogger::doLog);

    }
}
