package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested : ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        for (int i = 1; i <= 30 ; i++) {
            double futureInvestmentValue = futureInvestmentValue(investmentAmount, monthlyInterestRate,i);
            System.out.printf("%1d %.2f\n",i, futureInvestmentValue);
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
    }
}
