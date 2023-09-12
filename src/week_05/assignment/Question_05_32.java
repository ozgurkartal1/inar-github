package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lotteryNumber = 0;

        System.out.print("Enter your lottery pick (two distinct digits) : ");
        int lotteryPick = input.nextInt();

        int digit1;
        int digit2;

        do{
           digit1  = (int) (Math.random() * 10);
           digit2 = (int) (Math.random() * 10);
        }while(digit1 == digit2);

        lotteryNumber = digit1 * 10 + digit2;

        System.out.println("The lottery number is " + lotteryNumber);

        if(lotteryPick == lotteryNumber){
            System.out.println("Exact match : you win $10000");
            System.exit(1);

        } else if (lotteryPick / 10 == digit1||
                   lotteryPick / 10  == digit2 ||
                   lotteryPick % 10 == digit1 ||
                   lotteryPick % 10 == digit2) {

            System.out.println("Match one digit : you win $1000");

        }else{
            System.out.println("Sorry, no match");
        }
    }
}
