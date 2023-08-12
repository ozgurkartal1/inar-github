package week_02.live_class;

import java.util.Scanner;

public class NumericLiterals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double degree = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + degree + " in celsius");
    }
}
