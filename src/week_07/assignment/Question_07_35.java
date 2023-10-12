package src.week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nameList = {"write", "that", "java", "program", "gala", "single"};

        boolean s = true;

        while (s) {

            int count = 0;
            char[] guesses = new char[100];
            int time = 0;

            String word = nameList[(int) (Math.random() * nameList.length)];

            char[] guessWord = new char[word.length()];

            for (int i = 0; i < guessWord.length; i++) {
                guessWord[i] = '*';
            }

            char[] charactersOfWord = new char[word.length()];

            for (int i = 0; i < charactersOfWord.length; i++) {
                charactersOfWord[i] = word.charAt(i);
            }

            while (!isEquals(charactersOfWord, guessWord)) {
                System.out.print("Guess a letter in word ");
                System.out.print(guessWord);
                System.out.print(" > ");
                char ch = input.nextLine().charAt(0);

                guesses[count] = ch;

                if (isGuessPreviousGuess(guesses, count)) {
                    System.out.println(ch + " is already in the word");
                    count++;
                    continue;
                }

                count++;

                boolean st = true;

                for (int i = 0; i < charactersOfWord.length; i++) {
                    if (ch == charactersOfWord[i]) {
                        guessWord[i] = ch;
                        st = false;
                    }
                }

                if (st) {
                    time++;
                    System.out.println(ch + " is not in the word");
                }
            }

            System.out.print("The word is ");
            System.out.print(charactersOfWord);
            System.out.print(". You missed " + time + " time\n");

            char button;
            do {
                System.out.print("Do you want to guess another word? Enter y or n : ");
                button = input.nextLine().charAt(0);

                if (button == 'n') {
                    s = false;
                }
            } while (!isCorrectLetter(button));

        }


    }

    public static boolean isCorrectLetter(char button) {

        return button == 'n' || button == 'y';
    }


    public static boolean isGuessPreviousGuess(char[] guesses, int count) {
        for (int i = 0; i < count; i++) {
            if (guesses[count] == guesses[i]) {
                return true;
            }
        }

        return false;
    }

    private static boolean isEquals(char[] randomWord, char[] guessWord) {
        for (int i = 0; i < randomWord.length; i++) {
            if (randomWord[i] != guessWord[i]) {
                return false;
            }
        }

        return true;
    }
}
