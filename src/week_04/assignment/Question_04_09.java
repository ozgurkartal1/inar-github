package week_04.assignment;

import java.util.Scanner;

public class Question_04_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user a char :

        System.out.print("Enter a character : ");
         String s1 = input.nextLine();

         if(s1.length() == 1){
            char character = s1.charAt(0);
            int uniCode = character;
             System.out.println("The Unicode for the character " + character + " is " + uniCode);
         }else{
             System.out.println("Invalid input");
         }
    }
}
