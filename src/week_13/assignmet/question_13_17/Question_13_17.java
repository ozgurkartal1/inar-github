package week_13.assignmet.question_13_17;

import java.util.Scanner;

public class Question_13_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first complex number : ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        Complex c1 = new Complex(a, b);

        System.out.print("Enter second complex number : ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();

        Complex c2 = new Complex(a1, b1);

        System.out.println("(" + c1 + ")" +  " + "
                + "(" + c2 + ")" + " = " + c1.add(c2));

        System.out.println("(" + c1 + ")" +  " - "
                + "(" + c2 + ")" + " = " + c1.subtract(c2));

        System.out.println("(" + c1 + ")" +  " * "
                + "(" + c2 + ")" + " = " + c1.multiply(c2));

        System.out.println("(" + c1 + ")" +  " / "
                + "(" + c2 + ")" + " = " + c1.divide(c2));

        System.out.println("|(" + c1 + ")|" + " = " + c1.abs());
    }
}
