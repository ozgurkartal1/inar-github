package src.week_11.assignment.question_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Qustion_11_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int size = input.nextInt();

        int[][] array = fillTheMatrix(size);

        print(array);

        ArrayList<Integer> maxRows = getMaxRows(array);
        ArrayList<Integer> maxColumns = getMaxColumns(array);

        System.out.println("The largest row index : ");
        print(maxRows);

        System.out.println();

        System.out.println("The largest column index : ");
        print(maxColumns);


    }

    private static void print(ArrayList<Integer> s) {
        for (Integer i : s){
            System.out.print(i + " ");
        }
    }

    private static void print(int[][] array){
        for (int[] a : array){
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> getMaxColumns(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = getMaxC(array);

        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[j][i] == 1){
                    count++;
                }
            }

            if(count == max){
                result.add(i);
            }
        }

        return result;
    }

    private static int getMaxR(int[][] array) {
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }

            if(count > max){
                max = count;
            }
        }

        return max;
    }

    private static int getMaxC(int[][] array) {
        int max = -1;
        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }

            if(count > max){
                max = count;
            }
        }

        return max;
    }

    private static ArrayList<Integer> getMaxRows(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = getMaxR(array);

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }

            if(count == max){
                result.add(i);
            }

        }
        return result;
    }

    private static int[][] fillTheMatrix(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }

        return result;
    }


}
