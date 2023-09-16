package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password : ");
        String password = input.nextLine();

        if(isValidPassword(password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {

        if(password.length() < 8){
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if(!Character.isLetter(password.charAt(i)) &&
               !Character.isDigit(password.charAt(i))){
                return false;
            }
        }

        if(countOfDigitInPassword(password) < 2){
            return false;
        }

        return true;
    }

    public static int countOfDigitInPassword(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
