package week_03.live_class;

import java.util.Scanner;

public class SimpleIfDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if(number % 5 == 0 && number % 2 == 0){
            System.out.println("Hi Ten");
        }

        else if(number % 5 == 0) {
            System.out.println("Hi Five");
        }
        else if(number % 2 == 0){
            System.out.println("Hi Even");
        }
    }
}
