package src.week_06.live_class;

import java.util.Scanner;

public class sasas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the message : ");
        String message = input.nextLine();

        System.out.print("Enter the repetition : ");
        int repetition = input.nextInt();

        nPrintln(message, repetition);
    }

    private static void nPrintln(String message, int repetition) {
        for (int i = 0; i < repetition; i++) {
            System.out.println(message);
        }
    }
}
