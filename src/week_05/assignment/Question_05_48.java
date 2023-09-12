package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_48 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String word = input.nextLine();

        String newWord = "";

        for (int i = 0; i < word.length(); i+= 2) {
            newWord = newWord + word.charAt(i) ;
        }
        System.out.println(newWord);
    }
}
