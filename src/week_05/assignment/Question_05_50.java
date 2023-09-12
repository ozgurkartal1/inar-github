package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_50 {

    public static void main(String[] args) {

        int countOfUpperCaseLetter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                countOfUpperCaseLetter++;
            }
        }
        System.out.println("The number of uppercase letter is " + countOfUpperCaseLetter);
    }
}
