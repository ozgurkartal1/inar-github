package week_02.assignments;

import java.util.Scanner;

public class Question_02_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance : ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon : ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon : ");
        double pricePerGallon = input.nextDouble();

        double costDriving = (distance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is $" + (int) (costDriving * 100) / 100.0);
    }
}
