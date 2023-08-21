package week_03.assignment;

import java.util.Scanner;

public class Question_03_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN : ");
        String ISBN_Number = input.nextLine();


        int digit1 = ISBN_Number.charAt(0) - '0';
        int digit2 = ISBN_Number.charAt(1) - '0';
        int digit3 = ISBN_Number.charAt(2) - '0';
        int digit4 = ISBN_Number.charAt(3) - '0';
        int digit5 = ISBN_Number.charAt(4) - '0';
        int digit6 = ISBN_Number.charAt(5) - '0';
        int digit7 = ISBN_Number.charAt(6) - '0';
        int digit8 = ISBN_Number.charAt(7) - '0';
        int digit9 = ISBN_Number.charAt(8) - '0';

        int checkSum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6) +
                (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;

        if(checkSum == 10){
            System.out.println(ISBN_Number + "X");
        }else{
            System.out.println(ISBN_Number + checkSum);
        }


    }
}