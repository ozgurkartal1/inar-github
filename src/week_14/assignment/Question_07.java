package week_14.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question_07 {

    public static void main(String[] args) {

        final int SIZE = 10;

        int index = (int)(Math.random() * SIZE);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            int number = (int)(Math.random() * 100);
            list.add(number);
        }

        System.out.println("Generated List : " + list);

        System.out.println("What is the " + index + ". greatest number");

        list.sort(Collections.reverseOrder());

        System.out.println("The " + index + "th largest element is : " +
                list.get(index - 1));


    }
}
