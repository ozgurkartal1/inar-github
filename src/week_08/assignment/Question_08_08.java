package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points : ");
        int numberOfPoints = input.nextInt();

        System.out.print("Enter " + numberOfPoints + " points : ");

        double[][] points = new double[numberOfPoints][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double minimumDistance = findMinimumDistance(points);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if(distance(i, j, points) == minimumDistance){
                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ")" + " and" +
                            "(" + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
    }

    public static double findMinimumDistance(double[][] points) {

        double min = distance(0, 1, points);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(i, j, points);
                if(distance < min){
                    min = distance;
                }
            }
        }

        return min;
    }

    public static double distance(int i, int j, double[][] points) {
        return Math.sqrt(Math.pow((points[i][0] - points[j][0]), 2) +
                Math.pow((points[i][1] - points[j][1]), 2));
    }
}
