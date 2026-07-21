package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//sort an ArrayList of Strings alphabetically

//important! collection changes the original obj, but stream keeps the original obj unchanged
public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");

        Collections.sort(fruits);

        System.out.println(fruits);

        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println(fruits);

        //lambda
        fruits.sort((a,b)-> a.compareTo(b));
        System.out.println(fruits);
        //the same -  fruits.sort(String::compareTo);


        //stream
        List<String> sortedFruits = fruits.stream()
                .sorted()
                .toList();
        System.out.println("sorted stream: " + sortedFruits);
    }
}
