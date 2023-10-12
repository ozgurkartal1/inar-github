package src.week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values in list1 :");
        int numberOfValuesInList1 = input.nextInt();

        System.out.print("Enter list1 : ");
        int[] list1 = new int[numberOfValuesInList1];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the number of values in list2 :");
        int numberOfValuesInList2 = input.nextInt();

        System.out.print("Enter list2 : ");
        int[] list2 = new int[numberOfValuesInList2];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = mergedList(list1, list2);

        Arrays.sort(mergedList);

        printArray(mergedList);
    }

    public static void printArray(int[] mergedList) {
        for (int i : mergedList){
            System.out.print(i + " ");
        }
    }

    public static int[] mergedList(int[] list1, int[] list2) {
        int length1 = list1.length;
        int length2 = list2.length;
        int[] mergedList = new int[length1 + length2];

        for (int i = 0; i < mergedList.length; i++) {
            if(i < length1){
                mergedList[i] = list1[i];
            }else{
                mergedList[i] = list2[i - length1];
            }
        }

        return mergedList;
    }
}
