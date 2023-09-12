package src.week_05.live_class;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();

        int count = 0;
        int temp = number;

        while(temp != 0){

            temp /= 10;
            count++;
        }

        temp = number;
        int sum = 0;

        while(temp != 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit, count);

            temp /= 10;
        }
        if(sum == number){
            System.out.print("It is armstrong number");
        }else{
            System.out.print("It is not armstrong number");
        }
    }
}
