package week_03.assignment;

import java.util.Scanner;

public class Question_03_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1 = 0;
        double y1 = 0;

        double distance = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));

        if(distance <= 10){
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle" );
        }else{
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle" );
        }
    }
}
