package week_03.assignment;

import java.util.Scanner;

public class Question_03_25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // For Cramer's Rule -> ax + by = e and cx + dy = f

        double a = (y1 - y2);
        double b = (x1 - x2);
        double c = (y3 - y4);
        double d = (x3 - x4);
        double e = x1 * (y1 - y2) - y1 * (x1 - x2);
        double f = x3 * (y3 - y4) - y3 * (x3 - x4);

        double intersectionPointXCoordinate = (e * d - b * f) / (a * d - b * c);
        double intersectionPointYCoordinate = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0){
            System.out.println("The two lines are parallel");
        }else{
            System.out.println("The intersecting point is at (" + Math.round(intersectionPointXCoordinate * 10000)
                    / 10000.0+ ", " + Math.round(intersectionPointYCoordinate * 10000) / 10000.0 + ")");
        }

    }
}
