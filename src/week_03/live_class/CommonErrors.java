package week_03.live_class;

import java.util.Scanner;

public class CommonErrors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius value : ");
        double radius = input.nextDouble();

        // radius > 5 is boolean type. It takes true or false (0, 1) value.Boolean type uses in if or else statement.

        // Example : if(boolean type){ expression }

        if(radius > 0){
            double area = radius * radius * Math.PI;
            System.out.println("The area is " + area);
        } else{
            System.out.println("Invalid radius. Please assign new value for radius.");
        }


    }
}
