package src.week_09.assignment.Question_09_10;

import java.util.Scanner;

public class Question_09_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if(equation.getDiscriminant() != 0){
            if(equation.getDiscriminant() > 0){
                System.out.printf("The equation has two roots %.3f and %.3f",
                        equation.getRoot1(), equation.getRoot2());
            }else{
                System.out.println("The equation has no real roots");
            }
        }else{
            System.out.printf("The equation has one root %.1f", equation.getRoot1());
        }


    }
}
