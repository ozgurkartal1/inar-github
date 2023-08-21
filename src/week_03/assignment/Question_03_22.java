package week_03.assignment;

import java.util.Scanner;

public class Question_03_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double distance = Math.sqrt(x1 * x1 + y1 * y1);

        if(distance <= 10){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle" );
        }else{
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the circle" );
        }
    }
}
