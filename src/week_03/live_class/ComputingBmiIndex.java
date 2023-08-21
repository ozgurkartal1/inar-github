package week_03.live_class;

import java.util.Scanner;

public class ComputingBmiIndex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter a weight in pounds -> ");
        double weight = input.nextDouble();

        System.out.print("Enter a height in inches -> ");
        double height = input.nextDouble();

        double weightInKilogram = weight * KILOGRAM_PER_POUND;
        double heightInMeter = height * METERS_PER_INCH;
        double bmi = weightInKilogram / (Math.pow(heightInMeter,2));

        System.out.println("BMI is -> " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if(bmi < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }

    }
}
