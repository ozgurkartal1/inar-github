package src.week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_09 {

    public static void main(String[] args) {

        char[][] matrix = createEmptyGrid();

        int count = 0;

        printTable(matrix);

        do{
            playGame(matrix, count);

            printTable(matrix);

            count++;

        }while(!isWin(matrix) && count < 9);

       result(matrix, count);
    }

    public static char[][] createEmptyGrid() {
        char[][] result = new char[3][3];

        for (char[] chars : result) {
            Arrays.fill(chars, ' ');
        }

        return result;
    }

    public static void result(char[][] matrix, int count) {
        if(isWin(matrix)){
            System.out.println((count % 2 == 0 ? '0' : 'X') + " player won");
        }else{
            System.out.println("Draw");
        }
    }

    public static void playGame(char[][] matrix, int count){
        Scanner input = new Scanner(System.in);

        int row = 0;
        int column = 0;

        boolean st;

        do {
            st = true;

            if (count % 2 == 0) {
                System.out.print("Enter a row (0, 1, 2) for X player : ");
                row = input.nextInt();

                System.out.print("Enter a column(0, 1, 2) for X player : ");
            } else {
                System.out.print("Enter a row (0, 1, 2) for O player : ");
                row = input.nextInt();

                System.out.print("Enter a column(0, 1, 2) for O player : ");
            }
            column = input.nextInt();

            if (matrix[row][column] == ' ') {
                st = false;
                if (count % 2 == 0) {
                    matrix[row][column] = 'X';
                } else {
                    matrix[row][column] = 'O';
                }
            }
        }while (st);
    }

    public static boolean isWin(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if(rowControl(matrix, i)){
                return true;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if(columnControl(matrix, i)){
                return true;
            }
        }

        return rightDiagonalControl(matrix) || leftDiagonalControl(matrix);
    }
    public static boolean rightDiagonalControl(char[][] matrix) {
        for (int i = 1, j = 1; i < matrix.length; i++, j++) {
            if(matrix[i][j] == ' ' || matrix[0][0] != matrix[i][j]){
                return false;
            }
        }
        return true;
    }

    public static boolean leftDiagonalControl(char[][] matrix) {
        for (int i = 1, j = 1; i < matrix.length; i++, j--) {
            if(matrix[i][j] == ' ' || matrix[0][2] != matrix[i][j]){
                return false;
            }
        }
        return true;
    }

    public static boolean columnControl(char[][] matrix, int i) {
        for (int j = 1; j < matrix.length ; j++) {
            if (matrix[j][i] == ' ' || matrix[0][i] != matrix[j][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowControl(char[][] matrix, int i) {
        for (int j = 1; j < matrix[i].length; j++) {
            if(matrix[i][j] == ' ' || matrix[i][0] != matrix[i][j]){
                return false;
            }
        }
        return true;
    }
    public static void printTable(char[][] matrix) {
        System.out.println("--------------");
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print("| " + aChar + " ");
            }
            System.out.println("|");
            System.out.println("--------------");
        }
    }
}
