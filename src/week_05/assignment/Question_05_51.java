package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_51 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String s1 = input.nextLine();

        System.out.print("Enter the second string : ");
        String s2 = input.nextLine();


        if(s1.isEmpty() || s2.isEmpty()){
            System.out.println(s1 + " and " + s2 + " have no common prefix");
            System.exit(1);
        }

        int length = s1.length();
        String commonPrefix = s1;

        while (s2.indexOf(commonPrefix) != 0 && !commonPrefix.isEmpty()){

            commonPrefix = s1.substring(0, length - 1);
            length--;
        }
        if (commonPrefix.isEmpty()){
            System.out.println(s1 + " and " + s2 + " have no common prefix");
        }else {
            System.out.println("The common prefix is " + commonPrefix);
        }

    }
}
