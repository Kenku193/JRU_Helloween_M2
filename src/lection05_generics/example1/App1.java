package lection05_generics.example1;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc"); //добавляем строку в список
        list.add(true); //добавляем булево в список
        list.add(1); //добавляем число в список

//        for (Object o : list) {
//            String s = (String) o; //тут будет исключение,
//        }

        System.out.println(list.get(0) instanceof Double);
        System.out.println(list.get(0) instanceof String);
        System.out.println(list.get(1) instanceof Boolean);
        System.out.println(list.get(2) instanceof Integer);

        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Object);
        System.out.println(list.get(2) instanceof Object);

        String s = (String) list.get(0);
        System.out.println(s);

        System.out.println(list.get(0).getClass().getSimpleName());

        System.out.println("-".repeat(100));

        Integer integer = (Integer) list.get(1);

    }
}
