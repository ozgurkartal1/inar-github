package week_04.assignment;

import java.util.Scanner;

public class Question_04_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String s1 = input.nextLine();
        char letter = s1.charAt(0);

        int correspondingNumber;

        if(letter >= 'a' && letter <= 'c' || letter >= 'A' && letter <= 'C'){
            correspondingNumber = 2;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'd' && letter <= 'f' || letter >= 'D' && letter <= 'F'){
            correspondingNumber = 3;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'g' && letter <= 'i' || letter >= 'G' && letter <= 'I'){
            correspondingNumber = 4;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'j' && letter <= 'l' || letter >= 'J' && letter <= 'L'){
            correspondingNumber = 5;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'm' && letter <= 'o' || letter >= 'M' && letter <= 'O'){
            correspondingNumber = 6;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'p' && letter <= 's' || letter >= 'P' && letter <= 'S'){
            correspondingNumber = 7;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 't' && letter <= 'v' || letter >= 'T' && letter <= 'V'){
            correspondingNumber = 8;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else if(letter >= 'w' && letter <= 'z' || letter >= 'W' && letter <= 'Z'){
            correspondingNumber = 9;
            System.out.println("The corresponding number is " + correspondingNumber);
        }else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
