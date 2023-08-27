package week_04.assignment;

import java.util.Scanner;

public class Question_04_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of hexagon is " + Math.round(area * 100) / 100.0);
    }
}
