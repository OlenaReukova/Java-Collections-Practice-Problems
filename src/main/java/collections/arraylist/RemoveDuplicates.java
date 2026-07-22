package collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);
        list.add(10);
        list.add(20);

        Set<Integer> set = new HashSet<>(list);  // take list and save it to set, and hashSet allows to create unordered list without duplicates
        list.clear();            //clear list
        list.addAll(set);       //addAll from set
        //hashSet can change the order
        //if we need to keep the order, it is better to use LinkedHashSet
        System.out.println(list);


        //stream
        List<Integer> uniqueList = list.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList);

    }
}
