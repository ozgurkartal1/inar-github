package week_13.assignmet.question_13_01;

import java.util.Scanner;

public class Question_13_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side of the triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color : ");
        String color = input.next();

        System.out.print("Enter is filled ? true or false : ");
        boolean isFilled = input.nextBoolean();

        GeometricObject geo = new Triangle(side1, side2, side3, isFilled, color);

        System.out.println(geo.toString());
    }
}
