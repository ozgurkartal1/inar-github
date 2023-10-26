package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_01 {

    public static void main(String[] args) {

        double[][] matrix = initializeArray();

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for (double[] doubles : m) {
            sum += doubles[columnIndex];
        }

        return sum;
    }

    public static double[][] initializeArray() {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[3][4];

        System.out.println("Enter a " + result.length + "-by-" + result[0].length + " matrix : ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }

        return result;
    }
}
