package week_03.assignment;

import java.util.Scanner;

public class Question_03_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB : ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");
        int number = input.nextInt();

        if(number == 0){
            System.out.print("Enter the dollar amount : ");
            double dollarAmount = input.nextDouble();
            System.out.println("$" + dollarAmount + " is " + (dollarAmount * exchangeRate) + " yuan");
        }else if(number == 1){
            System.out.print("Enter the RMB amount : ");
            double rmbAmount = input.nextDouble();
            System.out.println(rmbAmount + " yuan is $" + Math.round(rmbAmount / exchangeRate * 100) / 100.0);
        }else{
            System.out.println("Incorrect input");
        }


    }
}
