package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }

        double meanOfArray = mean(array);

        double standardDeviationOfArray = deviation(array);

        System.out.printf("The mean is %.2f\nThe standard deviation is %.5f",
                meanOfArray, standardDeviationOfArray);
    }

    public static double deviation(double[] array) {
        double mean = mean(array);
        double sum = 0;

        for (double i : array){
            sum += Math.pow((i - mean), 2);
        }

        return Math.sqrt(sum / (array.length - 1));
    }

    public static double mean(double[] array) {
        double sum = 0;

        for(double i : array){
            sum += i;
        }

        return sum / array.length;
    }
}
