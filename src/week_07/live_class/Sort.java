package src.week_07.live_class;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements : ");

        int numberOfElements = input.nextInt();

        int[] list = getList(numberOfElements);

        printList(list);

        sort(list);

        System.out.println();

        printList(list);
    }

    private static void printList(int[] list) {
        for (int j : list) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] list) {
        int low = 0;
        int high = list.length - 1;

        while (high > low){
            int max = list[low];
            int index = low;

            for (int i = low + 1; i <= high ; i++) {
                if(list[i] > max){
                    max = list[i];
                    index = i;
                }
            }

            int temp = list[low];
            list[low] = max;
            list[index] = temp;

            low++;

        }
    }

    public static int[] getList(int numberOfElements) {
        int[] list = new int[numberOfElements];
        for (int i = 0 ; i < list.length; i++) {
            list[i] = (int)(Math.random() * 10);
        }

        return list;
    }
}
