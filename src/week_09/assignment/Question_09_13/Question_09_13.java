package src.week_09.assignment.Question_09_13;

import java.util.Scanner;

public class Question_09_13 {

    static Location location = new Location();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns int the array : ");

        int row = input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the array : ");

        double[][] array = new double[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location1 = locateLargest(array);

        System.out.println("The location largest element is " +
                location1.maxValue + " at "  +
                "(" + location1.row + ", " + location1.column + ")");

    }

    public static Location locateLargest(double[][] array){

        double[] a = location.getMaxValue(array);

        return new Location((int)a[1], (int)a[2], a[0]);
    }

}
