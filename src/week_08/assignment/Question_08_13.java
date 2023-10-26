package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array : ");
        int row = input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the array : ");
        double[][] array = new double[row][column];

        for(int i = 0 ; i < array.length ; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] list = locateLargest(array);

        System.out.println("The location of the largest element is at " +
                "(" + list[0] + ", " + list[1] + ")");


    }

    public static int[] locateLargest(double[][] array) {
        double max = array[0][0];


        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }


}
