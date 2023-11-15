package src.week_10.live_class.Loan;

import java.util.Scanner;

public class TestLoan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years : ");
        int years = input.nextInt();

        System.out.println("Enter loan amount : ");
        double amount = input.nextDouble();

        Loan object = new Loan(annualInterestRate, years, amount);

        System.out.println("The loan was created " + object.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", object.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", object.getTotalPayment());

    }
}

