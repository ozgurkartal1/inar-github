package week_04.assignment;

import java.util.Scanner;

public class Question_04_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in dollars and cents (as a String) : ");
        String doubleDollarsValue = input.nextLine();

        double dollarsValue = Double.parseDouble(doubleDollarsValue);

        int valueOfDollarsInCent = (int)(dollarsValue * 100);

        int dollars = valueOfDollarsInCent / 100;
        int quarters = (valueOfDollarsInCent % 100) / 25;
        int dimes = ((valueOfDollarsInCent % 100) % 25) / 10;;
        int nickles = (((valueOfDollarsInCent % 100) % 25) % 10) / 5;
        int pennies = (((valueOfDollarsInCent % 100) % 25) % 10) % 5;

        System.out.printf("Equivalent in Monetary Units:\nDollars: %3d\nQuarters: %2d\nDimes: %2d\nNickles: %2d\nPennies: %2d"
                , dollars, quarters, dimes, nickles, pennies);
    }
}
