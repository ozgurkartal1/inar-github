package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches : ");
        double height = input.nextDouble();

        double weightInKilograms = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);
    }
}
