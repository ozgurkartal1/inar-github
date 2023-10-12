package src.week_07.live_class;

import java.util.Scanner;

public class AnalyzingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        System.out.println("Enter the elements of array : ");

        double[] array = getArray(size);

        int numberOfLargerElementThanAverage = getNumberOfLargerElementThanAverage(array);

        System.out.println("Average is " + getAverageOfElementsOfArray(array) +
                "\nThe number of larger element than average : " +
                numberOfLargerElementThanAverage);
    }

    private static int getNumberOfLargerElementThanAverage(double[] array) {

        double average = getAverageOfElementsOfArray(array);
        int count = 0;

        for (double i : array){
            if(i > average){
                count++;
            }
        }

        return count;
    }

    private static double getAverageOfElementsOfArray(double[] array) {
        double sum = 0;

        for (double i : array){
            sum += i;
        }
        return sum / array.length;
    }

    private static double[] getArray(int size) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }
}
