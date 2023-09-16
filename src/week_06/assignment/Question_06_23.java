package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        System.out.print("Enter a character that you want to count : ");
        String s1 = input.next();

        char ch = s1.charAt(0);

        System.out.println(count(s, ch));
    }

    public static int count(String s, char ch) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
