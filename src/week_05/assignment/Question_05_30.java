package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount {e.g.., 100} : ");
        double savingAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of months : ");
        int numberOfMonths = input.nextInt();

        double monthInterestRate = annualInterestRate / 100 / 12;

        double totalAmount = 0;
        double amountInMonth = savingAmount;

        for (int i = 1; i <= numberOfMonths ; i++) {
            totalAmount = (amountInMonth * (1 + monthInterestRate));
            amountInMonth = totalAmount + savingAmount;
        }
        System.out.printf("Amount in savings account after %2d months : $%.2f", numberOfMonths, totalAmount);
    }
}
