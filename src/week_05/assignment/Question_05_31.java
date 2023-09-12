package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount : ");
        double initialDepositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield : ");
        double annualYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months) : ");
        int maturityPeriodInMonths = input.nextInt();

        System.out.println("Month   CD Value");

        double totalAmount = 0;

        for (int i = 1; i <= maturityPeriodInMonths; i++) {

            totalAmount = initialDepositAmount + (initialDepositAmount * annualYield / 1200);
            initialDepositAmount = totalAmount;

            System.out.printf("%2d      %.2f\n", i, totalAmount);
        }
    }
}
