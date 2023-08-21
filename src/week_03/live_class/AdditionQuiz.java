package week_03.live_class;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10 );
        int sum = number1 + number2;

        System.out.println("What is " + number1 + " + " + number2 + " = ?");

        System.out.print("Enter a answer : ");
        int result = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " +
                result + " is " + (result == sum));

    }
}
