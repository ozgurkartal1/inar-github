package src.week_08.live_class;

import java.util.Scanner;

public class FindNearestPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of points : ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double min = distance(0, 1, points);
        double distance = 0;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distance = distance(i, j, points);

                if (distance < min) {
                    min = distance;
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println("The closest two points are " +
                "( " + points[index1][0] + ", " + points[index1][1] + ") and " +
                "(" + points[index2][0] + ", " + points[index2][1] + ")");

    }

    public static double distance(int i, int j, double[][] points) {
        return Math.sqrt(Math.pow((points[j][0] - points[i][0]), 2) +
                Math.pow((points[j][1] - points[i][1]), 2));
    }
}
