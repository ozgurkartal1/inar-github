package week_02.assignments;

import java.util.Scanner;

public class Question_02_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate : ");
        double subtotal = input.nextDouble();
        int gratuityRate = input.nextInt();

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);


    }
}
