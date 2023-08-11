package week_02.assignments;

import java.util.Scanner;

public class Question_02_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount :");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12;

        System.out.print("Enter number of years : ");
        int numberOfYears = input.nextInt();

        double futureInvestmentAmount = investmentAmount * Math.pow(1 + (monthlyInterestRate/100), numberOfYears * 12);

        System.out.println("Accumulated value is $" + futureInvestmentAmount);
    }
}
