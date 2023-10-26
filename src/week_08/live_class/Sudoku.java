package src.week_08.live_class;

import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] sudoku = new int[9][9];

        System.out.println("Enter a Sudoku puzzle solution : ");

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }

        if(isValid(sudoku)){
            System.out.println("Valid solution");
        }else{
            System.out.println("Invalid solution");
        }

    }

    public static boolean isValid(int[][] sudoku){
        for(int[] ints : sudoku){
            for(int i : ints){
                if(i < 1 || i > 9){
                    return false;
                }
            }
        }
        return isValidForRow(sudoku) && isValidForColumn(sudoku);
    }
    public static boolean isValidForRow(int[][] sudoku) {
        for (int[] ints : sudoku) {
            for (int j = 0; j < sudoku[0].length; j++) {
                for (int k = j + 1; k < sudoku[0].length; k++) {
                    if (ints[j] == ints[k]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean isValidForColumn(int[][] sudoku) {
        for (int i = 0; i < sudoku[0].length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                for (int k = j + 1; k < sudoku.length; k++) {
                    if(sudoku[j][i] == sudoku[k][i]){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
