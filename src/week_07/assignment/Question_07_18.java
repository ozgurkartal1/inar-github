package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] list = new double[10];

        System.out.print("Enter ten numbers : ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        bubbleSort(list);

        printList(list);
    }

    public static void printList(double[] array) {
        for (double i : array){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(double[] list) {
        int low = 0;
        int high = list.length - 1;

        while(high > low){
            double min = list[low];
            int index = low;

            for (int i = low + 1; i <= high; i++){
                if(list[i] < min){
                    min = list[i];
                    index = i;
                }
            }
            double temp = list[low];
            list[low] = list[index];
            list[index] = temp;

            low++;
        }


    }
}
