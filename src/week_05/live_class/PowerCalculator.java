package src.week_05.live_class;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number : ");
        int baseNumber = input.nextInt();

        System.out.print("Enter power : ");
        int power = input.nextInt();

        int sum = 1;

        for (int i = 0; i < power; i++) {
            sum *= baseNumber;
        }
        System.out.println("The result is " + sum);
    }
}
