package week_03.assignment;

import java.util.Scanner;

public class Question_03_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount (e .g 11,56) : ");
        double amount = input.nextDouble();
        int amountForCent = (int)(amount * 100);

        int dollars = amountForCent / 100;
        int quarter = (amountForCent % 100) / 25;
        int dimes = ((amountForCent % 100) % 25) / 10;
        int nickles = (((amountForCent % 100) % 25) % 10) / 5;
        int pennies = (((amountForCent % 100) % 25) % 10) % 5;

        System.out.println("Your amount " + amount + " consist of\n" + dollars +" dollars\n" +
                quarter + " quarter\n" + dimes + " dime\n" + nickles + " nickel\n" +
                pennies + " pennies");

    }
}
