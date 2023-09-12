package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_45 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfNumbers = 0;
        double sumOfSquareOfNumbers = 0;

        System.out.print("Enter ten numbers : ");
        double number;

        for (int i = 1; i <= 10 ; i++) {

            number = input.nextDouble();

            sumOfNumbers += number;
            sumOfSquareOfNumbers += number * number;
        }

        double mean = sumOfNumbers / 10;
        double standardDeviation = Math.sqrt((sumOfSquareOfNumbers - (sumOfNumbers * sumOfNumbers / 10)) / 9);

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f", standardDeviation);

    }
}
