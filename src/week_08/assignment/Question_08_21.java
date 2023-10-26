package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the cities : ");
        int numberOfCities = input.nextInt();

        System.out.println("Enter the coordinates of the cities : ");
        double[][] coordinates = new double[numberOfCities][2];

        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i][0] = input.nextDouble();
            coordinates[i][1] = input.nextDouble();
        }

        double min = totalDistance(coordinates, 0);
        int index = 0;

        for (int i = 1; i < coordinates.length; i++) {
            double totalDistance = totalDistance(coordinates, i);

            if(totalDistance < min){
                min = totalDistance;
                index = i;
            }
        }

        System.out.println("The central city is at (" + coordinates[index][0] +
                ", " + coordinates[index][1] + ")");

        System.out.printf("The total distance to all other cities is %.2f", min);
    }

    public static double totalDistance(double[][] coordinates, int i) {
        double total = 0;

        for (int j = 0; j < coordinates.length; j++) {
            if(i != j){
                total += Math.sqrt(Math.pow(coordinates[i][0] - coordinates[j][0], 2) +
                        Math.pow(coordinates[i][1] - coordinates[j][1], 2));
            }
        }

        return total;
    }
}
