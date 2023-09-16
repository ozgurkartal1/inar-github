package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        long number = input.nextLong();

        System.out.println("The sum of the digits in " + number +
                " is " + sumDigits(number));
    }

    public static int sumDigits(long n) {

        int sum = 0;

        while(n != 0){
            int digit = (int) (n % 10);

            sum += digit;

            n /= 10;
        }
        return sum;
    }
}
