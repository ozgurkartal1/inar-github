package week_04.assignment;

import java.util.Scanner;

public class Question_04_02 {

    public static void main(String[] args) {
        final double AVERAGE_EARTH_RADIUS = 6371.01;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees : ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        double distance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) +
          Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(longitude1 - longitude2)));

        System.out.println("The distance between two points is " + distance + " km");



    }
}
