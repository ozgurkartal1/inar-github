package src.week_05.live_class;

import java.util.Scanner;

public class PalindromeWithoutNewString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String str = input.nextLine();

        int firstIndexOfString = 0;
        int lastIndexOfString = str.length() - 1;

        // noon
        boolean isPalindrome = false;

        str = str.toUpperCase();

        while (firstIndexOfString < lastIndexOfString){

            isPalindrome = false;

            if(str.charAt(firstIndexOfString) == str.charAt(lastIndexOfString)){
                isPalindrome = true;
            }else {
                break;
            }
            firstIndexOfString++;
            lastIndexOfString--;
        }
        if(isPalindrome){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }

    }
}
