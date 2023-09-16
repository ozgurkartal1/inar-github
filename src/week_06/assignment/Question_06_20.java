package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        int numberOfLetters = countLetters(s);

        System.out.println("The number of letters in the string '"
                + s + "' : " + numberOfLetters);
    }

    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(isLetter(s,i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isLetter(String s, int i) {

        return Character.isLetter(s.charAt(i));
    }
}
