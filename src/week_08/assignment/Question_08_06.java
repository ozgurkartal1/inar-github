package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_06 {

    public static void main(String[] args) {

        System.out.print("Enter matrix1 : ");
        double[][] matrix1 = initializeMatrix();

        System.out.print("Enter matrix2 : ");
        double[][] matrix2 = initializeMatrix();

        double[][] multipleMatrix = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of two matrices is :\t");

        print(multipleMatrix);

    }

    public static void print(double[][] m){
        for (double[] d : m){
            for (double s : d){
                System.out.printf("%5.1f ", s);
            }

            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < matrix1[1].length; k++) {

                    double element1 = matrix1[i][k];
                    double element2 = matrix2[k][j];

                    result[i][j] += element1 * element2;
                }
            }
        }

        return result;
    }

    public static double[][] initializeMatrix(){
        Scanner input = new Scanner(System.in);

        double[][] result = new double[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }

        return result;
    }
}
