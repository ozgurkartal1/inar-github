package week_12.assignment.question_12_06;

import java.util.Scanner;
public class Question_12_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number : ");
        String hexNumber = input.next().toUpperCase();

        try {
            int n = hexToDecimal(hexNumber);
            System.out.print("The decimal value for hex number " + hexNumber + " is " + n);
        }
        catch (NumberFormatException e){
            System.out.println("It is not a hex string");
        }
    }

    public static int hexToDecimal(String hexNumber) {
       method1(hexNumber);

       int decimalValue = 0;
       double pow = hexNumber.length() - 1;

       for (int i = 0 ; i < hexNumber.length() ; i++){
           decimalValue += hexToCharDecimal(hexNumber.charAt(i)) * (int) Math.pow(16, pow);
           pow--;
       }
       return decimalValue;
    }
    public static int hexToCharDecimal(char ch){
        if(ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }

        return ch - '0';
    }

    public static void method1(String hexNumber){
        for (int i = 0; i < hexNumber.length(); i++) {
            if(!Character.isLetterOrDigit(hexNumber.charAt(i))){
                throw new NumberFormatException();
            }

            if(hexNumber.charAt(i) > 'F'){
                throw new NumberFormatException();
            }
        }
    }
}
