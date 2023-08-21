package week_03.assignment;

import java.util.Scanner;

public class Question_03_06 {

    public static void main(String[] args) {

        final double poundPerKilogram = 0.45359237;
        final double inchPerMeters = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();

        System.out.print("Enter feet : ");
        double feet = input.nextDouble();

        System.out.print("Enter inches : ");
        double inches = input.nextDouble();

        double weightInKilograms = weight * poundPerKilogram;
        double heightInMeters = (12 * feet + inches) * inchPerMeters;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25.0){
            System.out.println("Normal");
        }else if(bmi < 30.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
