package src.week_05.live_class;

import java.util.Scanner;

public class CommonGreatestDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();

        int gcd = 1;


       /* if(number1 > number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }*/

        int i = 2;
        while(i <= number1 && i <= number2){
            if(number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
            i++;
        }

        System.out.println("The common greatest divisor " + number1 + 
                " and " + number2 + " is " + gcd);
    }
}
