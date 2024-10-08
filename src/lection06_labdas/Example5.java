package lection06_labdas;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(10, 20, 30, 10, 40, 30, 50, 10);
        System.out.println(integerList);

        List<Integer> dList = integerList.stream().distinct().toList();
        System.out.println(dList);

    }
}
