package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3 : ");

        double[][] points = new double[3][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double area = getTriangleArea(points);

        System.out.printf("The area of the triangle is %.2f", area);
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) +
                Math.pow(points[2][1] - points[1][1], 2));

        double side2 = Math.sqrt(Math.pow(points[2][0] - points[0][0], 2) +
                Math.pow(points[2][1] - points[0][1], 2));

        double side3 = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) +
                Math.pow(points[1][1] - points[0][1], 2));

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
