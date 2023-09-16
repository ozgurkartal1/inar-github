package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double area = area(side);

        System.out.println("The area of the pentagon is " + area);
    }

    public static double area(double s) {
        return (5 * s * s) / (4 * Math.tan(Math.PI / 5));
    }
}
