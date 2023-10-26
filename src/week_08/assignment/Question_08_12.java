package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] bracket = {{8350, 33950, 82250, 171_550, 372_950},
                           {16700, 67900, 137_050, 208_850, 372_959},
                           {8350, 33959, 68525, 104_425, 186_475},
                           {11950, 45500,117_450, 190_200, 372_950}};

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        System.out.print("(0- single filer, 1- married jointly or qualifying widow(er)," +
                "2- married separately, 3- head of household) Enter the filling status : ");

        byte status = input.nextByte();

        System.out.print("Enter taxable income : ");
        double income = input.nextDouble();

        double tax = computeTax(bracket, rates, income, status);

        System.out.println("Tax is $" + tax);
    }

    public static double computeTax(int[][] bracket, double[] rates, double income, byte status) {
        double tax = 0;
        int previousValue = 0;

        for (int i = 0; i < rates.length; i++) {
            if(i < bracket[0].length){
                if(income > bracket[status][i]){
                    tax += (bracket[status][i] - previousValue) * rates[i];
                    previousValue = bracket[status][i];
                }else{
                    tax += (income - previousValue) * rates[i];
                    break;
                }
            }else{
                tax += (income - previousValue) * rates[i];
            }

        }

        return tax;
    }
}
