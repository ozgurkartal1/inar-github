package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();

        displayPattern(rows);
    }

    public static void displayPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
