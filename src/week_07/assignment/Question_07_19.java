package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list : ");

        int[] list = new int[9];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        if(isSorted(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        int[] sortedList = sort(list);
        boolean st = true;

        for (int i = 0; i < list.length; i++) {
           if(list[i] != sortedList[i]){
               st = false;
               break;
           }
        }

        return st;
    }

    public static int[] sort(int[] list) {
        int[] sortedList = new int[list.length];
        int[] tempList = copyList(list);

        int low = 0;
        int high = tempList.length - 1;

        while(high >= low){

            int max = tempList[low];
            int index = low;

            for (int i = low + 1; i <= high; i++) {
                if(tempList[i] > max){
                    max = tempList[i];
                    index = i;
                }
            }

            int temp = tempList[low];
            tempList[low] = tempList[index];
            tempList[index] = temp;

            sortedList[low] = max;
            low++;
        }


        return sortedList;

    }

    public static int[] copyList(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        return newList;
    }


}
