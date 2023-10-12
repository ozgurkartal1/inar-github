package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfIntegers = (int)(Math.random() * 11) + 10;

        System.out.println("Number of integers is " + numberOfIntegers);

        System.out.print("Enter the integers between 1 and 100 : ");

        int[] array = new int[numberOfIntegers];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int[] count = getCountArray(array);

        for (int i = 0; i < count.length ; i++) {
            if(count[i] > 0){
                System.out.println((i + 1) + " occurs " + count[i] + " time");
            }
        }
    }

    public static int[] getCountArray(int[] array) {
        int[] count = new int[99];
        for (int i = 0; i < count.length; i++) {
           for(int j : array){
               if(j == (i + 1)){
                   count[i]++;
               }
           }
        }
        return count;
    }
}
