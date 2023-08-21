package week_03.assignment;

import java.util.Scanner;

public class Question_03_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y- coordinates and radius : ");
        double circle1CenterX = input.nextDouble();
        double circle1CenterY = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y- coordinates and radius : ");
        double circle2CenterX = input.nextDouble();
        double circle2CenterY = input.nextDouble();
        double radius2 = input.nextDouble();

        double distanceBetweenCenters =Math.sqrt(Math.pow((circle1CenterX - circle2CenterX), 2) +
                Math.pow((circle1CenterY - circle2CenterY), 2));

        if(distanceBetweenCenters <= radius1 - radius2){
            System.out.println("Circle2 is inside circle1");
        }else if(distanceBetweenCenters <= radius1 + radius2){
            System.out.println("Circle2 overlaps circle1");
        }else{
            System.out.println("Circle2 does not overlap circle1");
        }

    }
}
