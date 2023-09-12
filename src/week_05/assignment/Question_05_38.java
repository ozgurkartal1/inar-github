package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_38 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");
        int decimal = input.nextInt();

        String octalValue = "";
        int currentDecimal = decimal;

        while (currentDecimal != 0){

            char octalDigit = (char)(currentDecimal % 8 + '0');

            octalValue = octalDigit + octalValue  ;

            currentDecimal /= 8;
        }
        System.out.println("The octal of " + decimal + " is " + octalValue);
    }
}
