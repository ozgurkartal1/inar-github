package week_02.live_class;

import java.util.Scanner;

public class CalculatingMonthlyPayment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years an integer : ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount : ");
        double loanAmount = input.nextDouble();

        double  monthlyPayment = (loanAmount * monthlyInterestRate) /
                                 (1 - 1 / Math.pow((1 + monthlyInterestRate), (12 * numberOfYears)));


        double totalPayment = monthlyPayment * 12 * numberOfYears;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);



    }
}
