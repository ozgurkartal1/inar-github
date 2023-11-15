package src.week_11.assignment.question_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int value;

        System.out.print("Enter a list og integers ending with 0 : ");

        do {
            value = input.nextInt();

            if(value != 0){
                list.add(value);
            }

        }while(value != 0);

        System.out.println("Before shuffling ..");

        display(list);

        shuffle(list);

        System.out.println("After shuffling ..");

        display(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (Integer number : list){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
