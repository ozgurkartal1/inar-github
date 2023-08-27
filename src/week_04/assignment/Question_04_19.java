package week_04.assignment;

import java.util.Scanner;

public class Question_04_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of ISBN as a String : ");
        String isbnNumber = input.nextLine();

        int digit1 = isbnNumber.charAt(0) - '0';
        int digit2 = isbnNumber.charAt(1) - '0';
        int digit3 = isbnNumber.charAt(2) - '0';
        int digit4 = isbnNumber.charAt(3) - '0';
        int digit5 = isbnNumber.charAt(4) - '0';
        int digit6 = isbnNumber.charAt(5) - '0';
        int digit7 = isbnNumber.charAt(6) - '0';
        int digit8 = isbnNumber.charAt(7) - '0';
        int digit9 = isbnNumber.charAt(8) - '0';

        int checkSum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) +
                (digit6 * 6) + (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;

        if(checkSum == 10){
            System.out.println("The ISBN-10 number is " + isbnNumber + "X");
        }else {
            System.out.println("The ISBN-10 number is " + isbnNumber + checkSum);
        }


    }
}
