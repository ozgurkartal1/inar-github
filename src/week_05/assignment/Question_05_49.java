package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_49 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        System.out.print("Enter a string : ");
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U'){

                    numberOfVowels++;
                }else{
                    numberOfConsonants++;
                }
            }
        }
        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonants is " + numberOfConsonants);
    }
}
