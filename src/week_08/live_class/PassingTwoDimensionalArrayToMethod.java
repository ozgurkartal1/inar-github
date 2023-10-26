package src.week_08.live_class;

import java.util.Scanner;

public class PassingTwoDimensionalArrayToMethod {

    public static void main(String[] args) {

        int[][] matrix = getArray();

        print(matrix);

        System.out.println("---------------------------------------------");

        System.out.println("Sum of all elements is : " + sum(matrix));

    }

    private static void print(int[][] matrix) {
        for (int[] i : matrix){
            for (int j : i){
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
    }

    public static int sum(int[][] matrix) {
        int sum = 0;

        for (int[] i : matrix){
            for (int j : i){
                sum += j;
            }
        }

        return sum;
    }

    private static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] result = new int[3][4];

        System.out.println("Enter " + result.length + " rows " +
                result[0].length + " columns : ");

        for (int row = 0; row < result.length; row++) {
            for (int column = 0; column < result[0].length; column++) {

                result[row][column] = input.nextInt();
            }
        }

        return result;
    }
}
