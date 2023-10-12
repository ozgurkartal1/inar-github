package src.week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 : ");

        int[] list1 = new int[6];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 : ");

        int[] list2 = new int[6];

        for (int i = 0; i < list1.length; i++) {
            list2[i] = input.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        System.out.println("Two lists are " + ((equals(list1, list2))
                ? "identical" : "not identical"));

    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i]){
                return false;
            }
        }

        return true;
    }
}
