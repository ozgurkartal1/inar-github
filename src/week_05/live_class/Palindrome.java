package src.week_05.live_class;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String newStr = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String str = input.nextLine();

        // noon

        for(int i = str.length() - 1; i >= 0; i--){

            newStr += str.charAt(i);

        }
        System.out.println("New string is : " + newStr);

        if(str.equals(newStr)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }


    }
}
