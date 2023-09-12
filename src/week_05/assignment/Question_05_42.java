package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salesAmount = 0;

        System.out.print("Enter the commission sought : ");
        final int COMMISSION_SOUGHT = input.nextInt();

        for(double i = 0.0 ; i < 10000000.0f ; i += 0.01f){
            double commission = 0;

            if(i <= 5000){
                commission += i * 0.08;
            } else if (i <= 10000) {
                commission += 5000 * 0.08 + (i - 5000) * 0.10;
            }else{
                commission += 5000 * 0.08 + (10000 - 5000) * 0.10 + (i - 10000) * 0.12;
            }
            if((int)(commission) == COMMISSION_SOUGHT){
                salesAmount = i;
                break;
            }
        }
        System.out.println("Minimum sales to earn $" + COMMISSION_SOUGHT + ": $" + Math.round(salesAmount));
    }
}
