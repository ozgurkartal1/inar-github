package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_25 {

    public static void main(String[] args) {

        double[][] matrix = fillMatrix();

        System.out.println("It is " + (isMarkovMatrix(matrix)
                ? "a " : "not a ") + "Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] matrix) {
        return controlElementsOfColumn(matrix) && controlSum(matrix);
    }

    public static boolean controlSum(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            double sum = sumElementsOfColumn(i, matrix);

            if(sum != 1){
                return false;
            }
        }

        return true;
    }

    public static boolean controlElementsOfColumn(double[][] matrix) {
        for (double[] doubles : matrix){
            for (double d : doubles){
                if(d <= 0){
                    return false;
                }
            }
        }

        return true;
    }

    public static double sumElementsOfColumn(int i, double[][] matrix) {
        double sum = 0;
        for (double[] doubles : matrix) {
            sum += doubles[i];
        }

        return sum;
    }

    public static double[][] fillMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row : ");

        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        return matrix;
    }
}
