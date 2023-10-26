package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_02 {

    public static void main(String[] args) {

        double[][] matrix = initializeMatrix();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public static double[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[4][4];

        System.out.println("Enter a " + result.length + "-by-" + result[0].length + " by row by row : ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }

        return result;
    }
}
