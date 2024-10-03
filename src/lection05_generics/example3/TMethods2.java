package lection05_generics.example3;

import java.util.ArrayList;
import java.util.List;

public class TMethods2 {

    public static class Util{

        public static <T> T getValue(Object obj){
            return (T) obj;
        }

        public static <T> T getValue(Object obj, Class<T> clazz){
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Author");
        list.add("Book");

        for (Object element : list) {
            System.out.println(Util.<String>getValue(element));

            System.out.println(Util.getValue(element, element.getClass()));
        }

    }
}
