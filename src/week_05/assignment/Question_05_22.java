package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        int loanAmount = input.nextInt();

        System.out.print("Number of years : ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual interest rate : ");
        double annualInterestRate = input.nextInt();


        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow((1 + monthlyInterestRate),(numberOfYears * 12))));

        System.out.printf("Monthly Payment : %.2f\n", monthlyPayment);

        double totalPayment = monthlyPayment * 12 * numberOfYears;
        System.out.printf("Total Payment : %.2f\n",totalPayment);

        double balance = loanAmount;

        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");

        for (int i = 1; i <= 12 * numberOfYears ; i++) {

            double monthlyInterest = balance * monthlyInterestRate;
            double principal = monthlyPayment - monthlyInterest;

            balance -= principal;

            System.out.printf("%2d\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", i , monthlyInterest,
                    principal, balance);

        }


    }
}
