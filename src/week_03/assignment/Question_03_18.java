package week_03.assignment;

import java.util.Scanner;

public class Question_03_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in pounds) : ");
        double weight = input.nextDouble();

        double shippingCost;

        if(weight > 0) {
            if (weight <= 1) {
                shippingCost = 3.5 * weight;
                System.out.println("Shipping cost of package $" + shippingCost);
            } else if (weight <= 3) {
                shippingCost = 5.5 * weight;
                System.out.println("Shipping cost of package $" + shippingCost);
            } else if (weight <= 10) {
                shippingCost = 8.5 * weight;
                System.out.println("Shipping cost of package $" + shippingCost);
            } else if (weight <= 20) {
                shippingCost = 10.5 * weight;
                System.out.println("Shipping cost of package $" + shippingCost);
            } else {
                System.out.println("The package cannot be shipped.");
            }
        }
        else{
            System.out.println("Invalid weight");
        }
    }
}
