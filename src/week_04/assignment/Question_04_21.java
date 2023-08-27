package week_04.assignment;

import java.util.Scanner;

public class Question_04_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN : ");
        String ssn = input.nextLine();

        if(Character.isDigit(ssn.charAt(3)) || Character.isDigit(ssn.charAt(6)) || ssn.length() != 11){
            System.out.println(ssn + " is an invalid social security number");
        }else{
            System.out.println(ssn + " is a valid social security number");
        }
    }
}
