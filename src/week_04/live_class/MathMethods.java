package week_04.live_class;

import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 value : ");
        int side1 = input.nextInt();

        System.out.print("Enter side2 value : ");
        int side2 = input.nextInt();

        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("The hypotenuse of a triangle with following sides %d and %d is %2.1f"
                , side1, side2, hypotenuse );
    }

}