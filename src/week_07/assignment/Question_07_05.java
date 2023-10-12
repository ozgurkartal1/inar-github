package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int numberOfDistinctNumbers = getNumberOfDistinctNumbers(list);

        System.out.println("The number of distinct numbers is " +
                numberOfDistinctNumbers);

        System.out.print("The distinct numbers are ");

        int[] distinctNumbers = getDistinctNumbers(list);

        printList(distinctNumbers);

    }

    public static void printList(int[] list) {
        for (int i : list){
            System.out.print(i + " ");
        }
    }

    public static int[] getDistinctNumbers(int[] list) {
        int length = getNumberOfDistinctNumbers(list);
        int[] distinctNumbers = new int[length];
        int count = 0;

        boolean[] booleans = getBooleanArray(list);

        for (int i = distinctNumbers.length - 1; i >= 0 ; i--) {
            for (int j = booleans.length - 1 - count; j >= 0; j--) {
                count++;
                if(booleans[j]){
                    distinctNumbers[i] = list[j];
                    break;
                }
            }
        }

        return distinctNumbers;
    }

    public static boolean[] getBooleanArray(int[] list) {
        boolean[] statements = new boolean[list.length];

        for(int i = list.length - 1 ; i >= 0; i--){
            boolean st = true;
            for (int j = i - 1; j >= 0 ; j--) {
                if(list[i] == list[j]){
                    st = false;
                    break;
                }
            }
            if(st){
                statements[i] = true;
            }
        }

        return statements;
    }

    public static int getNumberOfDistinctNumbers(int[] list) {
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean st = true;
            for (int j = i + 1; j < list.length; j++) {
                if(list[i] == list[j]){
                    st = false;
                    break;
                }
            }
            if(st){
                count++;
            }
        }

        return count;
    }
}
