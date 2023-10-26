package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix : ");
        int size = input.nextInt();

        int[][] matrix = initializeMatrix(size);

        print(matrix);

        boolean s1 = true;

        for (int i = 0; i < matrix.length; i++) {
            if(isSameNumbersOnRow(i, matrix)){
                System.out.println("All " + matrix[i][0] + "s on row " + i);
                s1 = false;
           }
        }

        if(s1){
            System.out.println("No same numbers on a row");
        }


        s1 = true;

        for (int i = 0; i < matrix[0].length; i++) {
            if(isSameNumbersOnColumn(i, matrix)){
                System.out.println("All" + matrix[0][i] + "s on column " + i);
                s1 = false;
            }
        }
        if(s1){
            System.out.println("No same numbers on a column");
        }


        if(isSameNumbersOnMajorDiagonal(matrix)){
            System.out.println("All " + matrix[0][0] + "s on major diagonal");
        }else{
            System.out.println("No same numbers on the major diagonal");
        }


        if(isSameNumbersOnSubDiagonal(matrix)){
            System.out.println("All " + matrix[1][1] + "s on sub-diagonal");
        }else{
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
    public static void print(int[][] matrix){
        for (int[] ints : matrix){
            for(int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSameNumbersOnSubDiagonal(int[][] matrix) {
        int controlNumber = matrix[1][1];

        for (int i = 2, j = 2; i < matrix.length; i++, j++) {
            if(controlNumber != matrix[i][j]){
                return false;
            }
        }

        return true;
    }

    public static boolean isSameNumbersOnMajorDiagonal(int[][] matrix) {
        int controlNumber = matrix[0][0];
        for (int i = 1, j = 1; i < matrix.length; i++, j++) {
            if(controlNumber != matrix[i][j]){
                return false;
            }
        }

        return true;
    }

    public static boolean isSameNumbersOnColumn(int i, int[][] matrix) {
        int controlNumber = matrix[0][i];

        for (int j = 1; j < matrix.length; j++) {
            if(controlNumber != matrix[j][i]){
                return false;
            }
        }

        return true;
    }

    public static boolean isSameNumbersOnRow(int i, int[][] m) {
        int controlNumber = m[i][0];
        for (int j = 1; j < m[0].length; j++) {
            if(controlNumber != m[i][j]){
                return false;
            }
        }

        return true;
    }

    public static int[][] initializeMatrix(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int)(Math.random() * 2);
            }
        }

        return result;
    }
}
