package src.week_11.assignment.question_14;

import java.util.ArrayList;
import java.util.Scanner;

import static src.week_11.assignment.question_11.Question_11_11.display;

public class Question_11_14 {

    public static void main(String[] args) {

        System.out.print("Enter five integers for list1 : ");
        ArrayList<Integer> list1 = createListWith5Elements();

        System.out.print("Enter five integers for list2 : ");
        ArrayList<Integer> list2 = createListWith5Elements();

        display(union(list1, list2));

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        return result;
    }

    public static ArrayList<Integer> createListWith5Elements() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            result.add(input.nextInt());
        }

        return result;
    }
}
