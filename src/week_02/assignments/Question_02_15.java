package week_02.assignments;

import java.util.Scanner;

public class Question_02_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double parameter = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);

        double distanceBetweenTwoPoints = Math.sqrt(parameter);

        System.out.println("The distance of between the two points is " + distanceBetweenTwoPoints);
    }
}
