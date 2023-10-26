package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_28 {

    public static void main(String[] args) {

        System.out.println("Enter list1 :");
        int[][] matrix1 = getMatrix();

        System.out.println("Enter list2 : ");
        int[][] matrix2 = getMatrix();

        System.out.println("The two arrays are " +
                (equals(matrix1, matrix2) ? "" : "not ") + "strictly identical");
    }

    public static boolean equals(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if(matrix1[i][j] != matrix2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        int[][] result = new int[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextInt();
            }
        }

        return result;
    }
}
