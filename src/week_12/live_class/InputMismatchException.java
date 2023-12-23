package src.week_12.live_class;

import java.util.Scanner;


public class InputMismatchException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.println("Enter an integer : ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            }
            catch (java.util.InputMismatchException e){
                System.out.println("Try again. Incorrect input");
                input.nextLine();
            }
        }while(continueInput);
    }
}
