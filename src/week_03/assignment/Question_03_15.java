package week_03.assignment;

import java.util.Scanner;

public class Question_03_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lotteryNumber = (int)(Math.random() * 900) + 100;


        System.out.println("Enter your lottery pick(three digits) : ");
        int yourNumber = input.nextInt();

        System.out.println("The lottery number is " + lotteryNumber);

        int lotteryNumberDigit1 = lotteryNumber / 100;
        int lotteryNumberDigit2 = (lotteryNumber % 100) / 10;
        int lotteryNumberDigit3 = (lotteryNumber % 10);

        int yourNumberDigit1 = yourNumber / 100;
        int yourNumberDigit2 = (yourNumber % 100) / 10;
        int yourNumberDigit3 = (yourNumber % 10);

        if(lotteryNumber == yourNumber){
            System.out.println("Exact Match !!! 10000$ Prize");
        }else if((lotteryNumberDigit1 == yourNumberDigit1 && lotteryNumberDigit2 == yourNumberDigit3 &&
                lotteryNumberDigit3 == yourNumberDigit2) || (lotteryNumberDigit2 == yourNumberDigit1 &&
                lotteryNumberDigit1 == yourNumberDigit3 && lotteryNumberDigit3 == yourNumberDigit2) ||
                (lotteryNumberDigit2 == yourNumberDigit1 &&
                        lotteryNumberDigit1 == yourNumberDigit2 && lotteryNumberDigit3 == yourNumberDigit3) ||
                (lotteryNumberDigit3 == yourNumberDigit1 && lotteryNumberDigit2 ==  yourNumberDigit2 &&
                        lotteryNumberDigit1 == yourNumberDigit3) || (lotteryNumberDigit3 == yourNumberDigit1 &&
                lotteryNumberDigit1 ==  yourNumberDigit2 && lotteryNumberDigit2 == yourNumberDigit3)){
            System.out.println("Matched all numbers !!! 3000$ Prize");
        }else if (lotteryNumberDigit1 == yourNumberDigit1 || lotteryNumberDigit1 == yourNumberDigit2 ||
        lotteryNumberDigit1 == yourNumberDigit3 || lotteryNumberDigit2 == yourNumberDigit1 ||
        lotteryNumberDigit2 == yourNumberDigit2 || lotteryNumberDigit2 == yourNumberDigit3||
        lotteryNumberDigit3 == yourNumberDigit1 || lotteryNumberDigit3 == yourNumberDigit2 ||
        lotteryNumberDigit3 == yourNumberDigit3){
            System.out.println("Matched one number !!! 1000$ Prize");
        }else{
            System.out.println("Sorry No Match :(");
        }



    }
}
