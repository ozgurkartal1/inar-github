 package week_04.assignment;

import java.util.Scanner;

public class Question_04_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade : ");
        String s1 = input.nextLine();
        //char letter = Character.toUpperCase(s1.charAt(0));  if (a,b,c,d,e,f) is not an invalid input

        char letter = s1.charAt(0);

        int numericValue;

       if(letter == 'A'){
           numericValue = 4;
           System.out.println("The numeric value for grade " + letter + " is " + numericValue);
       }else if(letter == 'B'){
           numericValue = 3;
           System.out.println("The numeric value for grade " + letter + " is " + numericValue);
        }else if(letter == 'C'){
           numericValue = 2;
           System.out.println("The numeric value for grade " + letter + " is " + numericValue);
       }else if(letter == 'D'){
           numericValue = 1;
           System.out.println("The numeric value for grade " + letter + " is " + numericValue);
       }else if(letter == 'F'){
           numericValue = 0;
           System.out.println("The numeric value for grade " + letter + " is " + numericValue);
       }else {
           System.out.println(letter + " is an invalid input");
       }
    }
}
