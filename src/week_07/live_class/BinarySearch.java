package src.week_07.live_class;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a key number : ");

        int key = input.nextInt();

        int[] array = getArray();

        int result = binarySearch(key, array);

        System.out.println();

        printArray(array);

        System.out.println("\n" + result);

    }

    public static int binarySearch(int key, int[] array){
        int low = 0;
        int high = array.length - 1;

        while(high >= low){

            int mid = (low + high) / 2;

            if(key < array[mid]){
                high = mid - 1;
            }else if (key == array[mid]) {
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static int[] getArray() {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 9) + 1;
        }

        printArray(array);

        return sortedArray(array);
    }
    public static int[] sortedArray(int[] array) {

        int low = 0;
        int high = array.length - 1;
        int indexofMin = 0;

        while (high > low) {

            int currentMin = array[low];

            for (int i = low; i <= high; i++){
                if(array[i] < currentMin){
                    currentMin = array[i];
                    indexofMin = i;
                }
            }

            int temp = array[low];
            array[low] = currentMin;
            array[indexofMin] = temp;

            low++;

        }
        return array;
    }
}
