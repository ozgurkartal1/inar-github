package src.week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_05 {

    public static void main(String[] args) {

        System.out.print("Enter matrix1 : ");
        double[][] matrix1 = initializeMatrix();

        System.out.print("Enter matrix2 : ");
        double[][] matrix2 = initializeMatrix();


    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
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
