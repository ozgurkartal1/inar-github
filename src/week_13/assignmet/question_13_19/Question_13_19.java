package week_13.assignmet.question_13_19;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter decimal : ");

        String s1 = input.nextLine();

        String[] s = s1.split(",");

        Rational r1 = new Rational(new BigInteger(s[0]),
                BigInteger.ONE);

        Rational r2;

        if(s[0].contains("-")){
            r2 = new Rational(new BigInteger(s[1]),
            new BigInteger("-" + (int)(Math.pow(10.0, (s[1].length())))));
        }else{
             r2 = new Rational(new BigInteger(s[1]),
                     new BigInteger(String.valueOf((int) (Math.pow(10, s1.length())))));
        }


        System.out.println("The fraction number is " +
                r1.add(r2));
    }
}
