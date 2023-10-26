package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a00, a01, a10, a11, b0, b1 : ");

        double[][] a = new double[2][2];

        double[] b = new double[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]. length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }

        double[] array = linearEquation(a, b);

        System.out.println("x is " + array[0] + " and y is " + array[1]);
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];

        result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return result;
    }
}
