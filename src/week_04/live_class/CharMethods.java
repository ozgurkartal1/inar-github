package week_04.live_class;

import java.util.Scanner;

public class CharMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char letter ='a';
        System.out.println((int)letter);
        System.out.println((char)100);

        //password
        //lowercase => (97-122)
        //uppercase => (65-90)
        //length=8 => constant
        //special character => (33-47)
        //integer => (48-57)

        char number1 = '1';
        System.out.println((int) number1);

        System.out.println("-----------------------");

        char character = 's';
        System.out.println(character);
        System.out.println(++character);
        System.out.println(++character);

        char escape = '\n';
        System.out.println(escape);
        System.out.println((int)escape);

        char ch = 65;
        System.out.println(ch);



        System.out.println(Character.toUpperCase('a'));
        System.out.println("Is 7 a digit : " + (Character.isDigit('7')?"Yes":"No"));
        System.out.println("Convert I to lower case " + Character.toLowerCase('I'));
        System.out.println("Is t a digit : " + (Character.isDigit('t')?"Yes":"No"));


    }
}
