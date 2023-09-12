package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        int loanAmount = input.nextInt();

        System.out.print("Number of years : ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate\t\tMonthly Payment\t\t\tTotal Payment");

        for (float i = 5.000f ; i <= 8.000f ; i += 0.125f) {

            double monthlyInterestRate = (i / 100) / 12;

            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - (1 / Math.pow((1 + monthlyInterestRate),(numberOfYears * 12))));

            double totalPayment = monthlyPayment * 12 * numberOfYears;

            System.out.printf("%.3f\t\t\t\t%.2f\t\t\t\t\t%.2f\n", i, monthlyPayment, totalPayment);
        }
    }
}
