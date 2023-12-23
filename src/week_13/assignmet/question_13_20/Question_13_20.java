package week_13.assignmet.question_13_20;

import java.util.Scanner;

public class Question_13_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if(discriminant < 0){

            Complex root1 = new Complex(-b / 2,
                    Math.sqrt(Math.abs(discriminant)) / 2);

            Complex root2 = new Complex(-b / 2,
                    Math.sqrt(Math.abs(discriminant)) / -2);

            System.out.printf("The roots are %.1f + %.4fi and " +
                    "%.1f + %.4fi", root1.getRealPart(), root1.getImaginaryPart(),
                    root2.getRealPart(), root2.getImaginaryPart());
        }

        if(discriminant == 0){
            System.out.println("The root is " + (-b / 2));
        }

        if(discriminant > 0){

            double root1 = (-b + Math.sqrt(discriminant)) / 2;
            double root2 = (-b - Math.sqrt(discriminant)) / 2;

            System.out.println("The roots are " + root1 +
                    " and " + root2);
        }


    }
}
