package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_04 {

    public static void main(String[] args) {

        int[][] table = createWorkingHoursTable();

        int[] sumsOfRows = new int[table.length];

        for (int i = 0; i < sumsOfRows.length; i++) {
            
            sumsOfRows[i] = findSumAtRow(i, table);
        }
        
        int[] sortedSumsOfRows = sort(sumsOfRows);

        System.out.println("\nEmployees and their total hours in decreasing order of the total hours : \n");

        for (int i : sortedSumsOfRows) {
            for (int j = 0; j < sumsOfRows.length; j++) {
                if(i == sumsOfRows[j]){
                    System.out.println("Employee " + j + "'s total work hour is " + i);
                    break;
                }
            }
        }

    }

    public static int[] sort(int[] sumsOfRows) {
        int[] result = copyArray(sumsOfRows);

        int low = 0;
        int high = result.length - 1;


        while (high > low){
            int max = result[low];
            int index = low;

            for (int i = low + 1; i <= high; i++) {
                if(result[i] > max){
                    max = result[i];
                    index = i;
                }
            }

            int temp = result[low];
            result[low] = max;
            result[index] = temp;

            low++;
        }

        return result;
    }

    public static int[] copyArray(int[] sumsOfRows) {
        int[] result = new int[sumsOfRows.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = sumsOfRows[i];
        }

        return result;
    }

    public static int findSumAtRow(int i, int[][] table) {
        int sum = 0;

        for (int j = 0; j < table[0].length; j++) {
            sum += table[i][j];
        }

        return sum;
    }

    public static int[][] createWorkingHoursTable() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employee : ");

        int numberOfEmployee = input.nextInt();

        System.out.println("Enter the working hours of employee : ");

        int[][] result = new int[numberOfEmployee][7];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextInt();
            }
        }

        return result;
    }
}
