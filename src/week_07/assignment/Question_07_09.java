package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }

        double minimumValueOfTheArray = min(array);

        System.out.println("The minimum number is: " + minimumValueOfTheArray);
    }

    public static double min(double[] array) {
        double min = array[0];

        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
