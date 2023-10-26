package src.week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter four points : ");

        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double[] areas = areas(points);

        Arrays.sort(areas);

        print(areas);

    }

    public static void print(double[] areas) {
        for (double area : areas) {
            System.out.printf("%.2f ", area);
        }
    }

    public static double[] areas(double[][] points) {
        double[] result = new double[points.length];

        for (int i = 0; i < points.length; i++) {
            result[i] = getTriangleArea(i, points);
        }

        return result;
    }

    public static double getTriangleArea(int i, double[][] points) {

        double[] intersection = getIntersectionPoint(points);

        double side1 = Math.sqrt(Math.pow((points[i][0] - intersection[0]), 2) +
                Math.pow((points[i][1] - intersection[1]), 2));

        double side2 = Math.sqrt(Math.pow((points[(i + 1) % 4][0] - intersection[0]), 2) +
                Math.pow((points[(i + 1) % 4][1] - intersection[1]), 2));

        double side3 = Math.sqrt(Math.pow((points[(i + 1) % 4][0] - points[i][0]), 2) +
                Math.pow((points[(i + 1) % 4][1] - points[i][1]), 2));

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double[] getIntersectionPoint(double[][] points) {
        double[] result = new double[2];

        double a = points[0][1] - points[2][1];
        double b = points[0][0] - points[2][0];
        double c = points[1][1] - points[3][1];
        double d = points[1][0] - points[3][0];

        double e = (points[0][1] - points[2][1]) * points[0][0] -
                (points[0][0] - points[2][0]) * points[0][1];

        double f = (points[1][1] - points[3][1]) * points[2][0] -
                (points[1][0] - points[3][0]) * points[2][1];


        result[0] = (e * d - b * f) / (a * d - b * c);
        result[1] = (a * f - e * c) / (a * d - b * c);

        return result;

    }
}
