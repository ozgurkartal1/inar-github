package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = input.nextLine();

        String newS = getANewString(s);

        System.out.println(newS);
    }

    public static String getANewString(String s) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(isLetter(s, i)){
                newS += getDigitFromLetter(s, i);
            }else {
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    public static char getDigitFromLetter(String s,int i) {
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'c' ||
           s.charAt(i) <= 'A' && s.charAt(i) <= 'C'){
            return '2';
        }
        if(s.charAt(i) >= 'd' && s.charAt(i) <= 'd' ||
                s.charAt(i) <= 'D' && s.charAt(i) <= 'F'){
            return '3';
        }
        if(s.charAt(i) >= 'g' && s.charAt(i) <= 'i' ||
                s.charAt(i) <= 'G' && s.charAt(i) <= 'I'){
            return '4';
        }
        if(s.charAt(i) >= 'j' && s.charAt(i) <= 'l' ||
                s.charAt(i) <= 'J' && s.charAt(i) <= 'L'){
            return '5';
        }
        if(s.charAt(i) >= 'm' && s.charAt(i) <= 'o' ||
                s.charAt(i) <= 'M' && s.charAt(i) <= 'O'){
            return '6';
        }
        if(s.charAt(i) >= 'p' && s.charAt(i) <= 's' ||
                s.charAt(i) <= 'P' && s.charAt(i) <= 'S'){
            return '7';
        }
        if(s.charAt(i) >= 't' && s.charAt(i) <= 'v' ||
                s.charAt(i) <= 'T' && s.charAt(i) <= 'V'){
            return '8';
        }
        if(s.charAt(i) >= 'w' && s.charAt(i) <= 'z' ||
                s.charAt(i) <= 'W' && s.charAt(i) <= 'Z'){
            return '9';
        }
        return '\n';
    }

    public static boolean isLetter(String s, int i) {

        return Character.isLetter(s.charAt(i));
    }
}
