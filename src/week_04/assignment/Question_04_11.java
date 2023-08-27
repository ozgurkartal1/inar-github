package week_04.assignment;

import java.util.Scanner;

public class Question_04_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter an integer between 0 and 15 :

        System.out.print("Enter a decimal value (0 to 15) : ");
        int decimalValue = input.nextInt();

        char hex;

        if(decimalValue <= 9){
          hex = (char)('0' + decimalValue);
            System.out.println("The hex value is " + hex);
        }else if(decimalValue <= 15){
            hex = (char) ('A' + decimalValue - 10);
            System.out.println("The hex value is " + hex);
        }else{
            System.out.println(decimalValue + " is an invalid input");
        }


    }
}
