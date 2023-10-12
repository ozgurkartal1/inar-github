package src.week_07.live_class;

import java.util.Scanner;

public class ProcessingArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int sizeOfArray = input.nextInt();

        int[] array = getArray(sizeOfArray);

        printArray(array);

        int sum = getSumOfElementsOfArray(array);

        System.out.println("\nSum of elements of array : " + sum);

        int largestElement = getLargestElementOfArray(array);

        System.out.println("The largest element of array : " + largestElement);

        int smallestIndexOfLargestElement = getSmallestIndexOfLargestElement(array);

        System.out.println("Smallest index of largest element of array : " +
                smallestIndexOfLargestElement);

        int[] array1 = randomShuffling(sizeOfArray, array);

        printArray(array1);

        int[] array2 = shiftingArray(array);

        System.out.println();

        printArray(array2);

    }

    private static int[] shiftingArray(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;

        return array;
    }

    private static int[] randomShuffling(int sizeOfArray, int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int j = (int)(Math.random() * array.length);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    private static int getSmallestIndexOfLargestElement(int[] array) {
        int count = 0;
        int max = getLargestElementOfArray(array);

        for (int i : array) {
            if(i == max){
                break;
            }
            count++;
        }
        return count;
    }

    private static int getLargestElementOfArray(int[] array) {
        int max = array[0];

        for (int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    private static int getSumOfElementsOfArray(int[] array) {
        int total = 0;
        for(int i : array){
            total += i;
        }
        return total;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%2d ", i);
        }
    }

    private static int[] getArray(int sizeOfArray) {

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        return array;
    }
}
