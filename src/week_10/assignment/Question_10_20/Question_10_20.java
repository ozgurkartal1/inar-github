package src.week_10.assignment.Question_10_20;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Question_10_20 {

    public static void main(String[] args) {


        for (int i = 100; i <= 1000; i+= 100) {
            BigDecimal e = BigDecimal.ONE;
            BigDecimal factorial = BigDecimal.ONE;

            for (int j = 1; j < i; j++) {
                factorial = factorial.multiply(new BigDecimal(j));
                BigDecimal addition = BigDecimal.ONE.divide(factorial,25, RoundingMode.UP);
                e = e.add(addition);
            }

            System.out.println(i + "    " + e);
        }
    }


}
