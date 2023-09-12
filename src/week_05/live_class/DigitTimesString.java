package src.week_05.live_class;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class DigitTimesString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = input.nextLine();

        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                number = Integer.parseInt("" + s.charAt(i));
                for (int j = 0; j < number; j++) {
                    System.out.print(s.charAt(i + 1));
                }
            }

        }

    }
}
