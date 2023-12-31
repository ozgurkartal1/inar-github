package src.week_11.assignment.question_01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side of the triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color : ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println(triangle.toString());

        System.out.println("Area : " + triangle.getArea());
        System.out.println("Perimeter : " + triangle.getPerimeter());
        System.out.println("Color : " + triangle.getColor());
        System.out.println("Triangle is " + (triangle.isFilled()
                ? "filled" : "is not filled "));
    }
}
