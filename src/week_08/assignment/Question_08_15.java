package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points : ");

        double[][] points = new double[5][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        System.out.println("The five points are " +
                (sameLine(points) ? "" : "not ") + "on the same line");
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 2; i < points.length; i++) {
            if((points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) -
          (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0){
                return false;
            }
        }

        return true;
    }
}
