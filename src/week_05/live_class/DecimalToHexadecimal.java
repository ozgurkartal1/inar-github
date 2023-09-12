package src.week_05.live_class;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int number = input.nextInt();

        System.out.println("Decimal value is " + number);

        String hex = "";


        while(number != 0){
            char hexDigit;
            int hexValue = number % 16;

            hexDigit = ((hexValue) >= 0 && (hexValue) <= 9)
                    ? (char)((hexValue) + '0') : (char)(hexValue- 10 + 'A') ;

            hex = hexDigit + hex;

            number /= 16;

        }
        System.out.println("Hex Decimal value of it : " + hex);
    }
}
