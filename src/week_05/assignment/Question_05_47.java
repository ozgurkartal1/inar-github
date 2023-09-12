package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_47 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string : ");
        String isbnNumber = input.nextLine();

        int length = isbnNumber.length();

        for (int i = 0; i < length; i++) {
            if(!Character.isDigit(isbnNumber.charAt(i)) || length != 12){
                System.out.print("invalid input");
                System.exit(1);
            }
        }

        for (int i = 0; i < length; i++) {
            if(i % 2 == 0){
                sum += (isbnNumber.charAt(i) - '0');
            }else{
                sum += 3 * (isbnNumber.charAt(i) - '0');
            }
        }
        int checkSum = 10 - (sum % 10);

        if(checkSum == 10){
            System.out.println("The ISBN -13 number is " + isbnNumber + "0");
        }else{
            System.out.println("The ISBN -13 number is " + isbnNumber + checkSum);
        }
    }
}
