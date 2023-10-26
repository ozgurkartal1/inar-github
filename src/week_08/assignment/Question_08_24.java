package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] sudoku = readSolution();

        System.out.println((isValid(sudoku) ? "valid " : "invalid") + " solution");


    }

    public static boolean isValid(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if(!isValid(i, j, sudoku) ||
                        sudoku[i][j] < 1 || sudoku[i][j] > 9){
                    return false;
                }
            }
        }
        
        return true;
    }

   public static boolean isValid(int i, int j, int[][] grid){
        // For Rows
       for (int column = j + 1; column < grid[0].length; column++) {
           if(grid[i][j] == grid[i][column]){
               return false;
           }
       }

       // For Columns
       for (int k = i + 1; k < grid.length; k++) {
           if(grid[i][j] == grid[k][j]){
               return false;
           }
       }

       // For 3 - 3 boxes

       for (int row = 3 * (i / 3); row < 3 * (i / 3) + 3; row++) {
           for (int column = 3 * (j / 3); column < 3 * (j / 3) + 3; column++) {
               if((row != i || column != j) && grid[row][column] == grid[i][j]){
                   return false;
               }
           }
       }
       return true;
   }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sudoku puzzle solution : ");
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }
        return sudoku;
    }
}
