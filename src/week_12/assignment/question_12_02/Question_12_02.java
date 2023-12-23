package week_12.assignment.question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers : ");

        boolean control = true;

        while(control) {

            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                int sum = sum(number1, number2);
                System.out.println("Sum of " + number1 + " + " + number2 + " is " + sum);
                control = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Wrong input!! Please enter integer -->");
            }
        }
    }

    public static int sum (int number1, int number2){
        return number1 + number2;
    }
}
