package week_04.live_class;

import java.util.Scanner;

public class MyString1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        String name = input.nextLine();
        System.out.print("You have entered your name : ");
        System.out.println(name);

        name = name.trim();


        char firstCharacter = name.charAt(0);
        int length = name.length();
        char lastCharacter = name.charAt(length - 1);

        char firstCharacterOfFirstWord = name.charAt(0);
        char firstCharacterOfSecondWord = name.charAt(name.indexOf(' ') + 1);

        System.out.println("The first character of first word is " + firstCharacterOfFirstWord + "\n"
        + "The first character of second word is " + firstCharacterOfSecondWord);

        System.out.println("The first character is " + firstCharacter);
        System.out.println("The last character is " + lastCharacter);
    }
}
