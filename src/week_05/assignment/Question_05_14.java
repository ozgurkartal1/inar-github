package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer : ");
        int number2 = input.nextInt();

        int k = 2;
        int gcd = 1;

        while(k <= number1 && k <= number2){

            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + number1 +
                " and " + number2 + " is " + gcd);
    }
}
