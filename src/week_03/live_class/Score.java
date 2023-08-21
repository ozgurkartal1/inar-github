package week_03.live_class;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's score : ");
        int score = input.nextInt();

        if(score >= 0) {

            if (score >= 90) {
                System.out.println("Student's grade is A");
            } else if (score >= 80) {
                System.out.println("Student's grade is B");
            } else if (score >= 70) {
                System.out.println("Student's grade is C");
            } else if (score >= 60) {
                System.out.println("Student's grade is D");
            } else {
                System.out.println("Student's grade is F");
            }
        }else{
            System.out.println("Invalid input. ");
        }
    }
}
