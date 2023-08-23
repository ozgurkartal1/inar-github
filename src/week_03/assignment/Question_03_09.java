package week_03.assignment;

import java.util.Scanner;

public class Question_03_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the first 9 digits of an ISBN : ");
        int ISBN_Number = input.nextInt();


        int digit1 = (ISBN_Number / 100000000);
        int digit2 = (ISBN_Number / 10000000) % 10;
        int digit3 = (ISBN_Number / 1000000) % 10;
        int digit4 = (ISBN_Number / 100000) % 10;
        int digit5 = (ISBN_Number / 10000) % 10;
        int digit6 = (ISBN_Number / 1000) % 10;
        int digit7 = (ISBN_Number / 100) % 10;
        int digit8 = (ISBN_Number / 10) % 10;
        int digit9 = (ISBN_Number % 10);

        int checkSum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6) +
                (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;

        if(digit1 == 0){
            if(checkSum == 10){
                System.out.println("The ISBN-10 number is 0" + ISBN_Number + "X");
            }else {
                System.out.println("The ISBN-10 number is " + digit1 + ISBN_Number + checkSum);
            }
        }else {
            if(checkSum == 10){
                System.out.println("The ISBN-10 number is " + ISBN_Number + "X");
            }else {
                System.out.println("The ISBN-10 number is " + ISBN_Number + checkSum);
            }
        }


    }
}