package week_03.live_class;

import java.util.Scanner;

public class BooleanType {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius : ");
        double radius = input.nextDouble();

        boolean positiveRadius = (radius > 0);

        if(positiveRadius){
            double area = radius * radius * Math.PI;
            System.out.println("The area of circle is " + area);
        }else{
            System.out.println("Incorrect input");
        }

    }
}
