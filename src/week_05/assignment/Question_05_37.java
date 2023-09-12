package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");
        int decimal = input.nextInt();

        String binaryValue = "";
        int currentDecimal = decimal;

        while(currentDecimal != 0){
            char binaryDigit = (char)((currentDecimal % 2) + '0');

           binaryValue = binaryDigit + binaryValue;

           currentDecimal /= 2;

        }
        System.out.println("The binary value of the decimal " + decimal + " is : "  + binaryValue);
    }
}
