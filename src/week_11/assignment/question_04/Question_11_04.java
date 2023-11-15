package src.week_11.assignment.question_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int value;

        System.out.println("Enter a sequence of numbers ending with 0 : ");

        do{
            value = input.nextInt();

            if(value != 0){
                list.add(value);
            }

        }while(value != 0);

        System.out.println("The largest number in the list is " +
                max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = list.get(0);
        for (Integer number : list){
            if(number > max){
                max = number;
            }
        }

        return max;
    }
}
