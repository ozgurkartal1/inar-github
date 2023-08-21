package week_03.assignment;

import java.util.Scanner;

public class Question_03_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int number = input.nextInt();

        boolean expression1 = number % 5 == 0 && number % 6 == 0;
        boolean expression2 = number % 5 == 0 || number % 6 == 0;
        boolean expression3 = number % 5 == 0 ^ number % 6 == 0;

        System.out.println("Is " + number + " is divisible by 5 and 6? " + expression1);
        System.out.println("Is " + number + " is divisible by 5 or 6? " + expression2);
        System.out.println("Is " + number + " is divisible by 5 or 6 but not both? " + expression3);
    }
}
