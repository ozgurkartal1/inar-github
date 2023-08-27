package week_04.assignment;

import java.util.Scanner;

public class Question_04_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String s1 = input.nextLine();
        char letter = s1.charAt(0);

        if(Character.isLetter(letter)){
            if(Character.isUpperCase(letter)){
                System.out.println(letter + " is consonant");
            }else{
                System.out.println(letter + " is vowel");
            }
        }else{
            System.out.println(letter + " is an invalid input");
        }
    }
}
