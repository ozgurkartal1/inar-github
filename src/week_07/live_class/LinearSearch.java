package src.week_07.live_class;

import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a key value : ");
        int key = input.nextInt();

        int[] array = getArray();

        printArray(array);

        int result = linearSearch(key, array);

        System.out.println("\n" + result);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    private static int linearSearch(int k, int[] array) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == k){
                return i;
            }
        }
        return -1;
    }

    private static int[] getArray() {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random() * 19) - 9;

        }
        return array;
    }
}
