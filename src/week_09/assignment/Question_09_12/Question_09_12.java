package src.week_09.assignment.Question_09_12;

import src.week_09.assignment.Question_09_11.LinearEquation;

import java.util.Scanner;

public class Question_09_12 {

    public static void main(String[] args) {

        double[][] points = getPoints();

        LinearEquation equation = getLinearEquation(points);

        if(equation.isSolvable()){
            System.out.println("The intersecting point is " +
                    "(" + equation.getX() + ", " + equation.getY() + ")");
        }else{
            System.out.println("The two lines are parallel");
        }
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");

        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        return points;
    }

    public static LinearEquation getLinearEquation(double[][] points){
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];

        double e = (points[0][1] - points[1][1]) * points[0][0] -
                (points[0][0] - points[1][0]) * points[0][1];

        double f = (points[2][1] - points[3][1]) * points[2][0] -
                (points[2][0] - points[3][0]) * points[2][1];

        return new LinearEquation(a, b, c, d, e, f);
    }
}
