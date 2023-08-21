package week_03.live_class;

import java.util.Scanner;

public class ComputingTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tax = 0;

        System.out.println("Enter number of status -> ");
        byte numberOfStatus = input.nextByte();

        System.out.println("Enter the taxable incomes -> ");
        double income = input.nextDouble();

        if(numberOfStatus == 0){
            if(income <= 8350){
                tax = income * 0.10;
            } else if(income <= 33950){
                tax = (8350 * 0.10) + (income - 8350) * 0.15;
            } else if(income <= 82250){
                tax = (8350 * 0.10) + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if(income <= 171550){
                tax = (8350 * 0.10) + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            }else if(income <= 372950){
                tax = (8350 * 0.10) + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        ((income - 171550)) * 0.33;
            }else{
                tax = (8350 * 0.10) + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + ((income - 372950)) * 0.35;
            }
        }

        System.out.println("The tax of taxable incomes is -> " + tax);
    }
}
