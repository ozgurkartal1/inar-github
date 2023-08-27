package week_04.assignment;

import java.util.Scanner;

public class Question_04_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String string = input.nextLine();

        System.out.println("Length of the string : " + string.length());
        System.out.println("First character of the string : " + string.charAt(0));
    }
}
