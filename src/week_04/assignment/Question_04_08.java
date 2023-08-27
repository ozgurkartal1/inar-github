package week_04.assignment;

import java.util.Scanner;

public class Question_04_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt the user an integer between 0 and 127

        System.out.print("Enter an ASCII code : ");
        int asciiCode = input.nextInt();

        char character = (char) (asciiCode);

        System.out.println("The character for ASCII code " + asciiCode + " is " + character);
    }
}
