package week_04.assignment;

import java.util.Scanner;

public class Question_04_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1 : ");
        String firstString = input.nextLine();

        System.out.print("Enter string s2 : ");
        String secondString = input.nextLine();

        if(firstString.contains(secondString)){
            System.out.println(secondString + " is a substring of " + firstString);
        }else{
            System.out.println(secondString + " is not a substring of " + firstString);
        }
    }
}
