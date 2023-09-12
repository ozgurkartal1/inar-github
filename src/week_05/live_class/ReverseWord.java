package src.week_05.live_class;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = input.nextLine();

       String newStr = "";

       String firstWord = s.substring(0,s.lastIndexOf(" "));
       String secondWord = s.substring(s.lastIndexOf(" ") + 1);

       for(int i = firstWord.length() - 1 ; i >= 0 ; i--){
           newStr += firstWord.charAt(i);
       }
       newStr += " ";

        for (int i = secondWord.length() - 1; i >= 0 ; i--) {
            newStr += secondWord.charAt(i);

        }
        System.out.println(newStr);

    }
}
