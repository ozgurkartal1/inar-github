package week_04.assignment;

import java.util.Scanner;

public class Question_04_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit : ");
        String s1 = input.nextLine();

        char hexDigit = s1.charAt(0);

        int decimalValue = 0;

        if(hexDigit >= '1' && hexDigit <= '9'){
            decimalValue = hexDigit - '0';

            int binaryValueDigit1 = decimalValue / 8;
            int remaining = decimalValue % 8;
            int binaryValueDigit2 = remaining / 4;
            remaining = remaining % 4;
            int binaryValueDigit3 = remaining / 2;
            int binaryValueDigit4 = remaining % 2;

            System.out.println("The binary value is " + binaryValueDigit1 + binaryValueDigit2 + binaryValueDigit3 + binaryValueDigit4);

        }if(hexDigit >= 'A' && hexDigit <= 'F'){
            decimalValue = hexDigit - 'A' + 10;

            int binaryValueDigit1 = decimalValue / 8;
            int remaining = decimalValue % 8;
            int binaryValueDigit2 = remaining / 4;
            remaining = remaining % 4;
            int binaryValueDigit3 = remaining / 2;
            int binaryValueDigit4 = remaining % 2;

            System.out.println("The binary value is " + binaryValueDigit1 + binaryValueDigit2 + binaryValueDigit3 + binaryValueDigit4);
        }else{
            System.out.println("Invalid input");

        }

    }


}
