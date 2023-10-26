package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row : ");

        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            sortRows(matrix, i);
        }

        System.out.println("The row-sorted array is");
        print(matrix);
    }

    public static void print(double[][] matrix) {
        for (double[] doubles : matrix){
            for (double d : doubles){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    public static void sortRows(double[][] matrix, int i) {
        int j = 0;
        while (j < matrix[0].length){
            double min = matrix[i][j];
            int index = j;

            for (int k = j + 1; k < matrix[0].length; k++) {
                if(matrix[i][k] < min){
                    min = matrix[i][k];
                    index = k;
                }
            }

            double temp = matrix[i][j];
            matrix[i][j] = min;
            matrix[i][index] = temp;

            j++;
        }
    }
}
