package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalAmount = 0;

        System.out.print("Enter the monthly saving amount : ");
        int amount = input.nextInt();

        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;

        for (int i = 1 ; i <= 6 ; i++){
            totalAmount += amount;
            totalAmount = totalAmount * (1 + monthlyInterestRate);
        }

        System.out.println("After the sixth month, the account value is $" + totalAmount);
    }
}
