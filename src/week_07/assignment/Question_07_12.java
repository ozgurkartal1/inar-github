package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }

        int[] newArray = reverse(array);;

        printArray(newArray);
    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] newArray;
        newArray = copyArray(array);

        int low = 0;
        int high = newArray.length - 1;

        while(high > low){
            int temp = newArray[low];
            newArray[low] = newArray[high];
            newArray[high] = temp;

            low++;
            high--;
        }

        return newArray;
    }

    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
