package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] newList = eliminateDuplicates(list);

        System.out.print("The distinct numbers are : ");
        printList(newList);
    }

    public static void printList(int[] newList) {

        for (int i : newList) {
            System.out.print(i + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int length = getLengthOfNewList(list);
        int[] newList = new int[length];
        int count = 0;


        for (int i = newList.length - 1; i >= 0; i--) {
            for (int j = list.length - 1 - count; j >= 0 ; j--) {
                boolean statement = true;
                for (int k = j - 1 ; k >= 0; k--) {
                    if(list[j] == list[k]){
                        statement = false;
                        break;
                    }
                }
                count++;
                if(statement){
                    newList[i] = list[j];
                    break;
                }
            }
        }

        return newList;
    }

    public static int getLengthOfNewList(int[] list) {
        int count = 0;

        for (int i = 0; i < list.length ; i++){
            boolean isNotEqual = true;
            for(int j = i + 1 ; j < list.length ; j++){
                if(list[i] == list[j]){
                    isNotEqual = false;
                    break;
                }
            }
            if(isNotEqual){
                count++;
            }
        }

        return count;
    }
}
