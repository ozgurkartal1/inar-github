package src.week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_20 {

    public static void main(String[] args) {

        char[][] grid = createEmptyGrid();

        int count = 0;

        int[] array = new int[grid[0].length];

        print(grid);

        do {
            playGame(grid, count, array);

            print(grid);

            count++;

        } while (!isWin(grid) && count < grid.length * grid[0].length);

        result(grid, count);

    }

    public static void result(char[][] grid, int count) {

        if(isWin(grid)){
            System.out.println("The " + (count % 2 == 0 ? "yellow " : "red ") +
                    "player win");
        }else{
            System.out.println("Draw");
        }
    }

    public static boolean isWin(char[][] grid) {
        for (int i = 0; i <= grid.length - 4; i++) {
            for (int j = 0; j <= grid[0].length - 4; j++) {
                if(isWin(grid, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWin(char[][] grid, int i, int j) {
        char[][] box = create4By4Box(i, j, grid);

        for (int k = 0; k < box.length; k++) {
            if(rowControl(box, k)){
                return true;
            }
        }

        for (int k = 0; k < box[0].length; k++) {
            if(columnControl(box, k)){
                return true;
            }
        }

        return rightDiagonalControl(box) || leftDiagonalControl(box);
    }

    public static boolean leftDiagonalControl(char[][] box) {
        for (int i = 1, j = 2; i < box.length; i++, j--) {
            if(box[i][j] == ' ' || box[0][3] != box[i][j]){
                return false;
            }
        }
        return true;
    }

    public static boolean rightDiagonalControl(char[][] box) {
        for (int i = 1, j = 1; i < box.length; i++, j++) {
            if(box[i][j] == ' ' || box[0][0] != box[i][j]){
                return false;
            }
        }
        return true;
    }

    public static boolean columnControl(char[][] box, int i) {
        for (int j = 1; j < box.length ; j++) {
            if (box[j][i] == ' ' || box[0][i] != box[j][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowControl(char[][] box, int i) {
        for (int j = 1; j < box[i].length; j++) {
            if(box[i][j] == ' ' || box[i][0] != box[i][j]){
                return false;
            }
        }
        return true;
    }

    public static char[][] create4By4Box(int i, int j, char[][] grid) {
        char[][] result = new char[4][4];

        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result[0].length; l++) {
                result[k][l] = grid[i + k][j + l];
            }
        }

        return result;
    }

    public static void playGame(char[][] grid, int count, int[] array) {
        Scanner input = new Scanner(System.in);
        int column;
        boolean st = true;

        while(st){
            st = false;

            if (count % 2 == 0) {
                System.out.print("Drop a red disk at column(0-6) : ");

            } else {
                System.out.print("Drop a yellow disk at column(0-6) : ");
            }
            column = input.nextInt();

            if(array[column] >= grid.length){
                st = true;
                continue;
            }

            array[column]++;

            if(count % 2 == 0){
                grid[grid.length - array[column]][column] = 'R';
            }else{
                grid[grid.length - array[column]][column] = 'Y';
            }

        }
    }

    public static void print(char[][] grid) {
        for (char[] chars : grid) {
            for (char ch : chars) {
                System.out.print("|" + ch);
            }
            System.out.println("|");
        }
        System.out.println("-----------------");
    }

    public static char[][] createEmptyGrid() {
        char[][] result = new char[6][7];
        for (char[] chars : result) {
            Arrays.fill(chars, ' ');
        }

        return result;
    }
}
