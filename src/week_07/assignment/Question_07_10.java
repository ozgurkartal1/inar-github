package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }

        double smallestElementOfArray = getMin(array);

        int indexOfSmallestElement = getIndexOfMin(array);

        System.out.println("The minimum number is " + smallestElementOfArray +
                " index " + indexOfSmallestElement);
    }

    public static int getIndexOfMin(double[] array){
        double min = getMin(array);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == min){
                index = i;
                break;
            }
        }

        return index;
    }

    public static double getMin(double[] array) {
        double min = array[0];

        for (double i : array){
            if(i < min){
                min = i;
            }
        }

        return min;
    }
}
