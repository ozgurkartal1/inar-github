package src.week_07.live_class;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the size of array : ");
        int sizeOfArray = input.nextInt();

        System.out.print("Enter the array : ");
        int[] list = new int[sizeOfArray];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println((isEqual(list)));
    }

    public static boolean isEqual(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            int sumOfFirstPart = 0;


            for (int j = 0; j <= i ; j++) {
                sumOfFirstPart += list[j];
            }

            int sumOfLastPart = 0;

            for (int j = i + 1; j < list.length; j++) {
                sumOfLastPart += list[j];
            }

            if(sumOfFirstPart == sumOfLastPart){
                return true;
            }
        }

        return false;
    }
}
