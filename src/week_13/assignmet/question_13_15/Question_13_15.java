package week_13.assignmet.question_13_15;

import java.math.BigInteger;

public class Question_13_15 {

    public static void main(String[] args) {

       Rational r1 = new Rational(new BigInteger("5"),
               new BigInteger("6"));

       Rational r2 = new Rational(BigInteger.ONE,
               new BigInteger("4"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2.doubleValue());

    }
}
