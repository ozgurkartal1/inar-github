package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];

        System.out.print("Enter six points : ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[] array = getMostRightLowestPoint(points);

        System.out.println("The rightmost lowest point is " +
                "(" + array[0] + ", " + array[1] + ")");

    }

    public static double[] getMostRightLowestPoint(double[][] points) {
        double[] result = new double[2];

        double x = getLowestPoint(points);
        int index = 0;
        double max = -1000;

        for(int i = 0 ; i < points.length ; i++){
            if(points[i][1] == x && points[i][0] > max){
                index = i;
                max = points[i][0];
            }
        }

        result[0] = points[index][0];
        result[1] = points[index][1];

        return result;
    }

    public static double getLowestPoint(double[][] points) {
        double min = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if(points[i][1] < min){
                min = points[i][1];
            }
        }

        return min;
    }
}
