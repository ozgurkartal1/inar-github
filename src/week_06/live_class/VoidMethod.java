package src.week_06.live_class;

import java.util.Scanner;

public class VoidMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score : ");
        double score = input.nextDouble();

        printGrade(score);

    }
    public static char getGrade(double score){
        if(score >= 90){
            return 'A';
        }
        if (score >= 80){
            return 'B';
        }
        if(score >= 70){
            return 'C';
        }
        if(score >= 60){
            return 'D';
        }
        return 'F';
    }
    public static void printGrade(double score){
        char grade = getGrade(score);
        System.out.println("The grade is " + grade);
    }
}
