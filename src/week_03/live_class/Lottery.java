package week_03.live_class;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int lottery = 10 + (int)(Math.random() * (100 - 10));

        System.out.print("Enter a two-digit number -> ");
        int selectedNumber = input.nextInt();

        System.out.println("The lottery number is -> " + lottery);

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int selectedNumberDigit1 = selectedNumber / 10;
        int selectedNumberDigit2 = selectedNumber % 10;

        if(selectedNumber == lottery){
            System.out.println("You won $10000");
        }else if(selectedNumberDigit1 == lotteryDigit2 && selectedNumberDigit2 == lotteryDigit1){
            System.out.println("You won $3000");
        }else if(selectedNumberDigit1 == lotteryDigit1 || selectedNumberDigit1 == lotteryDigit2 ||
                selectedNumberDigit2 == lotteryDigit1 || selectedNumberDigit2 == lotteryDigit2){
            System.out.println("You won $1000");
        }else {
            System.out.println("You lose. Try again");
        }
    }
}
