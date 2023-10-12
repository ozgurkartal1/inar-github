package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten values of double type : ");

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }

        double average = getAverage(array);

        System.out.println("The average value : " + average);
    }

    public static double getAverage(double[] array) {
        double sum = 0;

        for(double i : array){
            sum += i;
        }

        return sum / array.length;
    }

    public static int getAverage(int[] array){
        int sum = 0;

        for(int i : array){
            sum += i;
        }

        return sum / array.length;
    }
}
