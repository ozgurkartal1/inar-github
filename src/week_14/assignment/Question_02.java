package week_14.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_02 {

    public static void main(String[] args) {

        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 100);
            generatedList.add(number);
        }

        System.out.println("list -> " + generatedList);

        Set<Integer> integers = new HashSet<>(generatedList);

        System.out.println("list2 -> " + integers);
    }
}
