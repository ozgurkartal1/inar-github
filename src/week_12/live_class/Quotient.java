package src.week_12.live_class;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers : ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n2 != 0){
            System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
        }
        else{
            System.out.println("Divisor can not be zero");
        }

        System.out.println("Final statement");


    }
}
