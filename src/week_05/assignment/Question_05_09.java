package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name1 = "";
        String name2 = "";
        int max1 = 0;
        int max2 = 0;


        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();


        System.out.println("Enter each student's name and score");

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Student : " + i);

            System.out.print("   Name : ");
            String name = input.next();

            System.out.print("   Score : ");
            int score = input.nextInt();

            if (score > max1) {
                max2 = max1;
                max1 = score;
                name1 = name;
                name2 = name;
            } else if (score > max2) {
                max2 = score;
                name2 = name;
            }
        }
        System.out.println(name1);
        System.out.println(name2);
    }
}
