package src.week_11.assignment.question_13;

import java.util.ArrayList;
import java.util.Scanner;

import static src.week_11.assignment.question_11.Question_11_11.display;

public class Question_11_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        final int NUMBER_OF_INTEGERS = 10;

        System.out.print("Enter " + NUMBER_OF_INTEGERS + " integers : ");

        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            list.add(input.nextInt());
        }

        System.out.print("The distinct integers are ");

        removeDuplicate(list);

        display(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
    }
}
