package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        if (reverse(number) == number) {
            return true;
        }
        return false;
    }

    public static int reverse(int number) {
        int count = 0;
        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            int digit = number % 10;

            reverseNumber += digit * (int) (Math.pow(10, i));

            number /= 10;
        }
        return reverseNumber;
    }
}
