package src.week_12.live_class;

import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers : ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            int result = quotient(n1, n2);

            System.out.println(n1 + " / " + n2 + " is " + result);
        }
        catch (java.lang.ArithmeticException ae){
            System.out.println("an integer can not be divided by zero");
        }

        System.out.println("Execution continues");
    }

    public static int quotient(int n1, int n2) {
        if(n2 == 0){

            throw new java.lang.ArithmeticException("Divisor can not be zero");
        }

        return n1 / n2;
    }
}
