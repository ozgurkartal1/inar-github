package week_02.live_class;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");//
        double radius = input.nextDouble(); //Assign a radius - 2

        final double PI = 3.1415923478347384738;

        double areaOfCircle; //Declare area - bos


        areaOfCircle = Math.pow(radius, 2) * PI; //Compute Area - 12.5

        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + areaOfCircle);

        radius = 3;//Assign new radius 3
        System.out.println("New radius value: " + radius);

        areaOfCircle = radius * radius * 3.14159;
        System.out.println("New area value: " + areaOfCircle);

    }
}
