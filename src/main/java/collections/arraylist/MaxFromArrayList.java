package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

        int max = Collections.max(list);
        System.out.println(max);

        //stream
        int maxStream = list.stream()
                .max(Integer::compareTo) //(a, b) -> a.compareTo(b)
                .get();
        System.out.println(maxStream);
    }
}
