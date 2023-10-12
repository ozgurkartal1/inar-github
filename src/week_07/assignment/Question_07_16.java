package src.week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_16 {

    public static void main(String[] args) {


        int[] array1 = new int[100_000];
        int key1 = (int)(Math.random() * 10);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        long startTime = System.currentTimeMillis();

        Arrays.sort(array1);

        linearSearch(key1, array1);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time of invoking the linearSearch " +
                "in milliseconds : " + (endTime - startTime));

        int[] array2 = new int[100_000];
        int key2 = (int)(Math.random() * 10);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        startTime = System.currentTimeMillis();

        Arrays.sort(array2);

        binarySearch(key2, array2);

        endTime = System.currentTimeMillis();


        System.out.println("Execution time of invoking the binarySearch " +
                "in milliseconds : " + (endTime - startTime));


    }

    public static void binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while(high > low){
            int mid = (low + high) / 2;

            if(array[mid] > key){
                high = mid - 1;
            }

            if(array[mid] == key){
                return ;
            }

            if(array[mid] < key){
                low = mid + 1;
            }
        }

    }

    public static void linearSearch(int key, int[] array) {
        for (int j : array) {
            if (j == key) {
                return;
            }
        }
    }
}
