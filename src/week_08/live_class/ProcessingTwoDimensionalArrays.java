package src.week_08.live_class;

import java.util.Scanner;

public class ProcessingTwoDimensionalArrays {

    public static void main(String[] args) {

        //int[][] matrix = new int[3][3];

        //System.out.println("Enter " + matrix.length + " rows and " +
           //     matrix[0].length + " columns : ");

        //initializingArray(matrix);

        //System.out.println("Printing initializing array : ");

        //print(matrix);


        int[][] matrix1 = new int[5][5];

        initializeArrayWithRandomNumber(matrix1);

        System.out.println("Printing initializing array with random values : ");

        print(matrix1);

        // Summing all elements

        System.out.println("---------------------------------------------");

        System.out.println("The sum of all elements is : " + sum(matrix1));

        System.out.println("---------------------------------------------");

        int[] sumOfColumns = new int[matrix1[0].length];

        for (int i = 0; i < matrix1[0].length; i++) {
            sumOfColumns[i] = sumOfElementsOnColumn(matrix1, i);
            System.out.println("sum all elements of column " + (i + 1) + " : " +
                   sumOfColumns[i] );
        }

        System.out.println("---------------------------------------------");

        int[] sumsOfRows = new int[matrix1.length];

        for (int i = 0; i < matrix1.length; i++) {
            sumsOfRows[i] = sumOfElementsOnRow(matrix1, i);
            System.out.println("sum all elements of row " + (i + 1) + " : " +
                    sumsOfRows[i]);
        }

        System.out.println("---------------------------------------");

        int row = findTheRowWithLargestSum(sumsOfRows);

        System.out.println("The row with largest sum is : " + (row + 1) +
                " -> " + sumsOfRows[row]);

        System.out.println("---------------------------------------------");

        int column = findTheColumnWithLargestSum(sumOfColumns);

        System.out.println("The column with largest sum is : " + (column + 1) +
                " -> " + sumOfColumns[column]);

        System.out.println("----------------------------------------------");

        randomShuffling(matrix1);

        print(matrix1);

    }
    public static void randomShuffling(int[][] matrix1){
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {

                int randomRow = (int) (Math.random() * matrix1.length);
                int randomColumn = (int) (Math.random() * matrix1[row].length);

                int temp = matrix1[row][column];
                matrix1[row][column] = matrix1[randomRow][randomColumn];
                matrix1[randomRow][randomColumn] = temp;
            }
        }
    }

    public static int findTheColumnWithLargestSum(int[] sumOfColumns) {
        int column = 0;
        int max = sumOfColumns[0];

        for (int i = 1 ; i < sumOfColumns.length; i++){
            if(sumOfColumns[i] > max){
                max = sumOfColumns[i];
                column = i;
            }
        }

        return column;
    }

    public static int findTheRowWithLargestSum(int[] sums) {
        int row = 0;
        int max = sums[0];

        for (int i = 1; i < sums.length; i++) {
            if(sums[i] > max){
                max = sums[i];
                row = i;
            }
        }

        return row;
    }

    public static int sumOfElementsOnRow(int[][] matrix1, int i) {
        int sum = 0;

        for (int column = 0; column < matrix1[0].length; column++) {
            sum += matrix1[i][column];
        }

        return sum;
    }

    public static int sumOfElementsOnColumn(int[][] matrix1, int i) {
        int sum = 0;

        for (int[] ints : matrix1) {
            sum += ints[i];
        }

        return sum;
    }

    public static int sum(int[][] matrix1) {
        int sum = 0;

        for(int[] i : matrix1){
            for (int j : i){
                sum += j;
            }
        }

        return sum;
    }

    public static void print(int[][] matrix) {
        for (int[] i : matrix){
            for (int j : i){
                System.out.printf("%2d ", j);
            }

            System.out.println();
        }
    }


    public static void initializeArrayWithRandomNumber(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 10);
            }
        }
    }

    public static void initializingArray(int[][] matrix) {

        Scanner input = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

    }
}
