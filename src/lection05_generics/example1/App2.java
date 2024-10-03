package lection05_generics.example1;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList();
        stringList.add("abc"); //добавляем строку в список
        stringList.add("abc"); //добавляем строку в список
        // stringList.add(1);
        for (Object o : stringList) {
            String s = (String) o;
        }
    }
}
