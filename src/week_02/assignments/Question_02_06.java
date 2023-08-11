package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 : ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = (number % 100) % 10;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
