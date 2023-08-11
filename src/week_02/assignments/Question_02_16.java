package week_02.assignments;

import java.util.Scanner;

public class Question_02_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double areaOfHexagon = Math.sqrt(27) * Math.pow(side, 2) / 2;

        System.out.println("The area of hexagon is " + areaOfHexagon);
    }
}
