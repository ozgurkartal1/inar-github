package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values : ");

        int numberOfValues = input.nextInt();

        System.out.print("Enter the values : ");

        int[] values = new int[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            values[i] = input.nextInt();
        }

        System.out.println("The list has " + (isConsecutiveFour(values)
        ? "consecutive four " :"no consecutive four"));
    }

    public static boolean isConsecutiveFour(int[] values) {
        ;
        for (int i = 0; i <= values.length - 4; i++) {
            boolean st = true;
            for (int j = i; j < i + 4 ; j++) {
                if(values[i] != values[j]){
                    st = false;
                    break;
                }
            }
            if(st){
                return true;
            }
        }

        return false;
    }
}
