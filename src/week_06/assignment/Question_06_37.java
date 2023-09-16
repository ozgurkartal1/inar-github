package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width : ");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.println(number + " formatted to width " + width + ": " + format(number, width));
    }

    public static String format(int number, int width) {
        String s = Integer.toString(number);
        int length = s.length();

        while (length < width){
            s = "0" + s;
            length++;
        }

        return s;
    }
}
