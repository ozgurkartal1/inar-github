package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String currentName = "";
        int max = 0;

        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();


        System.out.println("Enter each student's name and score");

        for (int i = 1; i <= numberOfStudents ; i++) {
            System.out.println("Student : " + i);

            System.out.print("   Name : ");
            String name = input.next();

            System.out.print("   Score : ");
            int score = input.nextInt();

            if (score > max){
                max = score;
                currentName = name;
            }
        }
        System.out.println("Student with the highest score : " + currentName);
    }
}
