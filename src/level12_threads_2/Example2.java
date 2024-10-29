package level12_threads_2;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1); // 0
        list.add(2); // 1
        list.add(3); // 2

        for (Integer integer : list) {
            list.remove(1);
        }

    }
}
