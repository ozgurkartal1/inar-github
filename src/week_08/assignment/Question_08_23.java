package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        System.out.println("Enter a 6-by-6 matrix row by row : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int row = firstRowNoEvenNumberOf1s(matrix);
        int column = firstColumnNoEvenNumberOf1s(matrix);

        if(row == -1 || column == -1){
            System.out.println("There is no flipped cell");
        }
        else {
            System.out.println("The flipped cell is at (" + row + ", " + column + ")");
        }
    }

    public static int firstColumnNoEvenNumberOf1s(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int numberOf1s = calculateNumberOf1sInColumn(i, matrix);

            if(numberOf1s % 2 != 0){
                return i;
            }
        }

        return -1;
    }

    public static int calculateNumberOf1sInColumn(int i, int[][] matrix) {
        int count = 0;
        for (int[] ints : matrix) {
            if (ints[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static int firstRowNoEvenNumberOf1s(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int numberOf1s = calculateNumberOf1sInRow(i, matrix);

            if(numberOf1s % 2 != 0){
                return i;
            }
        }

        return -1;
    }

    public static int calculateNumberOf1sInRow(int i, int[][] matrix) {
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 1){
                count++;
            }
        }

        return count;
    }
}
