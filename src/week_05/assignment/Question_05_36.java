package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int checkSum = 0;

        System.out.print("Enter the first 9 digits of an ISBN as integer : ");
        int isbnNumber = input.nextInt();

        for(int i = 1 ; i <= 9 ; i++){
            checkSum += i * ((int)(isbnNumber / Math.pow(10, (9 - i))) % 10);

        }
        if((int) (isbnNumber / Math.pow(10, 8)) == 0){
            if(checkSum % 11 == 10 ){
                System.out.println("The ISBN - 10 number is 0" + isbnNumber + "X");
            } else{
                System.out.println("The ISBN - 10 number is 0" + isbnNumber + (checkSum % 11));
            }

        }else{
            if(checkSum % 11 == 10 ){
                System.out.println("The ISBN - 10 number is " + isbnNumber + "X");
            } else{
                System.out.println("The ISBN - 10 number is " + isbnNumber + (checkSum % 11));
            }
        }

    }
}
