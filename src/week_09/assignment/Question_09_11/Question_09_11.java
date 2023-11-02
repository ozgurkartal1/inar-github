package src.week_09.assignment.Question_09_11;

import java.util.Scanner;

public class Question_09_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if(equation.isSolvable()){
            System.out.printf("x is %.1f and y is %.1f", equation.getX(), equation.getY());
        }else{
            System.out.println("The equation has no solution");
        }
    }
}
