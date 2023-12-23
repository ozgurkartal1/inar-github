package week_14.live_class;

import java.util.*;

public class MySet {

    public static void main(String[] args) {

       List<Integer> myList = new ArrayList<>();

        // Adding element to HashSet

        myList.add(10);
        myList.add(12);
        myList.add(45);
        myList.add(79);
        myList.add(51);
        myList.add(51);
        myList.add(51);
        myList.add(51);


        System.out.println(myList.size());

        System.out.println(Arrays.toString(myList.toArray()));

        Set<Integer> mySet = new HashSet<>(myList);

        System.out.println(Arrays.toString(mySet.toArray()));

        System.out.println(myList.size() == mySet.size());
    }
}
