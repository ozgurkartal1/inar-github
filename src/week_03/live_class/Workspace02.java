package week_03.live_class;

import java.util.Scanner;

public class Workspace02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number -> ");
        int number = input.nextInt();

        boolean even = (number % 2 == 0); //

        if(even){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }
}
