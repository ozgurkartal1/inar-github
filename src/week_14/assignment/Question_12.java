package week_14.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        int index = index(s);

        System.out.print("The first non-repeating character is '" +
                s.charAt(index) + "' : " + (index + 1) + ". character of the string");
    }

    public static int index(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!isDuplicated(s.charAt(i), s, i)){
                return i;
            }
        }

        return -1;
    }

    public static boolean isDuplicated(Character c, String s, int j) {
        for (int i = j + 1; i < s.length(); i++) {
            if(s.charAt(i) == c){
                return true;
            }
        }

        return false;
    }
}
