package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_46 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String name = input.nextLine();

        String reverse = "";


        for (int i = name.length() - 1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        System.out.println("The reversed string is " + reverse);





    }
}
