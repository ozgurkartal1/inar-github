package src.week_08.live_class;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number : ");
        int row = input.nextInt();

        System.out.print("Enter column number : ");
        int column = input.nextInt();

        int[][] matrix = fillMatrix(row, column);

        System.out.println("Matrix has" + (isConsecutiveFour(matrix)
        ? " " : " not ") + "consecutive four numbers");
    }

    public static boolean isConsecutiveFour(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[0].length - 4; j++) {
                if(rowControl(matrix, i, j)){
                    return true;
                }
            }
        }

        for (int i = 0; i <= matrix.length - 4; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(columnControl(matrix, i, j)){
                    return true;
                }
            }
        }

        for (int i = 0; i <= matrix.length - 4; i++) {
            for (int j = 0; j <= matrix[0].length - 4; j++) {
                int[][] box = createFourByFourBox(matrix, i, j);
                if(controlRightDiagonal(box) || controlLeftDiagonal(box)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean controlLeftDiagonal(int[][] box) {
        for (int i = 1, j = 2; i < box.length; i++, j--) {
            if(box[i][j] == ' ' || box[i][j] != box[3][0]){
                return false;
            }
        }

        return true;
    }

    public static boolean controlRightDiagonal(int[][] box) {
        for (int i = 1, j = 1; i < box.length; i++, j++) {
            if(box[i][j] == ' ' || box[i][j] != box[0][0]){
                return false;
            }
        }

        return true;
    }

    public static boolean columnControl(int[][] matrix, int i, int j) {
        for (int k = i + 1; k < i + 4; k++) {
            if(matrix[k][j] == ' ' || matrix[k][j] != matrix[i][j]){
                return false;
            }
        }

        return true;
    }

    public static boolean rowControl(int[][] matrix, int i, int j) {
        for (int k = j + 1; k < j + 4; k++) {
            if(matrix[i][k] == ' ' || matrix[i][k] != matrix[i][j]){
                return false;
            }
        }

        return true;
    }

    public static int[][] createFourByFourBox(int[][] matrix, int i, int j) {
        int[][] result = new int[4][4];

        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result[0].length; l++) {
                result[k][l] = matrix[i + k][j + l];
            }
        }

        return result;
    }

    public static int[][] fillMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fill matrix : ");

        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = input.nextInt();
            }
        }

        return result;
    }
}
