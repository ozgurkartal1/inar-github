package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_29 {

    public static void main(String[] args) {

        System.out.println("Enter list1 :");
        int[][] matrix1 = getMatrix();

        System.out.println("Enter list2 : ");
        int[][] matrix2 = getMatrix();

        System.out.println("The two arrays are " +
                (equals(matrix1, matrix2) ? "" : "not ") + "identical");
    }

    public static boolean equals(int[][] matrix1, int[][] matrix2) {
        for (int[] ints : matrix1) {
            for (int j = 0; j < matrix1[0].length; j++) {
                boolean st = false;
                int number = ints[j];

                for (int[] value : matrix2) {
                    for (int l = 0; l < matrix2[0].length; l++) {
                        if (number == value[l]) {
                            st = true;
                            break;
                        }
                    }
                    if (st) {
                        break;
                    }
                }

                if(!st){
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
