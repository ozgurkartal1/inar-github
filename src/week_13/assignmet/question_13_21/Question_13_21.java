package week_13.assignmet.question_13_21;

import week_13.assignmet.question_13_15.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational h = new Rational(new BigInteger("-" + b),  new BigInteger("" + (2 * a)));

        Rational k = new Rational(new BigInteger("" + c), BigInteger.ONE)
                .subtract(new Rational(new BigInteger("" + a), BigInteger.ONE)
                        .multiply(h.multiply(h)));

        // h = -b / 2a;
        // k = c - a * h^2;

        System.out.println("h is " + h + " k is " + k);
    }
}
