package week_02.live_class;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = input.nextInt();;

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();;

        System.out.print("Enter third number : ");
        int number3 = input.nextInt();;

        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("The average of  " + number1 + ", " + number2 + ", " + number3 + " is " + average);


        // The average of 2, 3, 4 is 3
    }
}
