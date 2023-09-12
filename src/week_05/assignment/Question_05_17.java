package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int numberOfLines = input.nextInt();

        for (int i = 1; i <= numberOfLines; i++) {
            // for space
            for (int j = 0; j < (numberOfLines - i) * 2 ; j++) {
                System.out.print(" ");
            }
            // for number in left -> 4 3 2 1
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            // for number in right -> 1 2 3 4
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
