package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        reviseSelectionSort(list);

        printList(list);

    }
    private static void printList(double[] list) {
        for (double i : list){
            System.out.print(i + " ");
        }
    }
    private static void reviseSelectionSort(double[] list) {
        int low = 0;
        int high = list.length - 1;

        while(high > low){
            double max = list[low];
            int index = low;

            for (int i = low + 1; i <= high; i++) {
                if(list[i] > max){
                    max = list[i];
                    index = i;
                }
            }

            double temp = list[high];
            list[high] = max;
            list[index] = temp;

            high --;
        }

    }
}
