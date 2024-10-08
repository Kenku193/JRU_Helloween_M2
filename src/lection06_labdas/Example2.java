package lection06_labdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example2 {
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

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        Collections.sort(week, comparator);
        System.out.println(week);
    }
}
