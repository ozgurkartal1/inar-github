package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers : ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int[] newArray = getReverseArray(array);

        printArray(newArray);
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static int[] getReverseArray(int[] array) {

        int[] newArray = new int[10];

        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }
}
