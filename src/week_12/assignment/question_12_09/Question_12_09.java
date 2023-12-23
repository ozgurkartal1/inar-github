package src.week_12.assignment.question_12_09;

import java.util.Scanner;

public class Question_12_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        String s = input.nextLine();

        try {
            System.out.println("The decimal value for binary number " + s + " is " +
                    bin2Dec(s));
        }catch (BinaryFormatException e){
            e.printStackTrace();
        }
    }

    public static int bin2Dec(String s) {
        method1(s);
        int pow = s.length() - 1;
        int decimal = 0;

        for (int i = 0; i < s.length(); i++) {
            decimal += (s.charAt(i) - '0') * (int)(Math.pow(2, pow));
            pow--;
        }

        return decimal;
    }

    public static void method1(String s) {
        for (int i = 0; i < s.length(); i++) {
            int number = s.charAt(i) - '0';

            if(!Character.isDigit(s.charAt(i))){
                throw new BinaryFormatException();
            }
            else if(number < 0 || number > 2){
                throw new BinaryFormatException();
            }
        }
    }
}
