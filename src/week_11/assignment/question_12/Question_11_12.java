package src.week_11.assignment.question_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {

    public static void main(String[] args) {

        ArrayList<Integer> list = createList();

        System.out.println("Sum of list : " + sum(list));
    }

    private static double sum(ArrayList<Integer> list) {
        double sum = 0;

        for(Integer s : list){
            sum += s;
        }

        return sum;
    }

    public static ArrayList<Integer> createList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        System.out.print("Enter the integers end with 0 : ");

        int value;

        do {
            value = input.nextInt();
            if(value != 0){
                result.add(value);
            }
        }while(value != 0);

        return result;
    }
}
