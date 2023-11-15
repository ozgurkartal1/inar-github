package src.week_11.live_class.example3;

import java.util.ArrayList;
import java.util.Arrays;

public class UsefulMethods {

    public static void main(String[] args) {

        String[] array = {"red", "green", "blue"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        System.out.println(list);


        list.toArray(array);

        for (String s : array){
            System.out.print(s + " ");
        }

        java.util.Collections.sort(list);

        System.out.println(list);
    }
}
