package week_04.assignment;

import java.util.Scanner;

public class Question_04_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex : ");
        double lengthFromTheCenterToVertex = input.nextDouble();

        double side = 2 * lengthFromTheCenterToVertex * Math.sin(Math.PI / 5);

        double areaOfPentagon = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of pentagon is %4.2f", areaOfPentagon);
    }
}
