package week_12.assignment.question_12_05;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of triangle :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }


}
