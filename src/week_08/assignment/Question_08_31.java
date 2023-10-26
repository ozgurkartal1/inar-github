package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");

        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double[] array = getIntersectingPoint(points);

        if (array != null){
            System.out.printf("The intersecting point is at " +
                    "(" + "%.2f " +  ", " + "%.2f" + ")", array[0], array[1]);
        }else{
            System.out.println("The two lines are parallel");
        }

    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectionPoint = new double[2];

        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];

        double e = (points[0][1] - points[1][1]) * points[0][0] -
                (points[0][0] - points[1][0]) * points[0][1];

        double f = (points[2][1] - points[3][1]) * points[2][0] -
                (points[2][0] - points[3][0]) * points[2][1];


        if(a * d - b * c == 0){
            return null;
        }

        else{
            intersectionPoint[0] = (e * d - b * f) / (a * d - b * c);
            intersectionPoint[1] = (a * f - e * c) / (a * d - b * c);
        }

        return intersectionPoint;

    }
}
