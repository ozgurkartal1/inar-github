package week_03.assignment;

import java.util.Scanner;

public class Question_03_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        if(x1 >= -5 && x1 <= 5 && y1 >= -2.5 && y1 <= 2.5){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the rectangle");
        }
    }
}
