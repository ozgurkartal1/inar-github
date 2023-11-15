package src.week_10.assignment.Question_10_17;

import java.math.BigInteger;

public class Question_10_17 {

    public static void main(String[] args) {

        int count = 0;

       BigInteger bigInteger = createBigInteger();

        while (count < 10){

          if(isSquare(bigInteger)){
              System.out.println(bigInteger);
              count++;
          }

          bigInteger = bigInteger.add(BigInteger.ONE);

        }
    }

    public static BigInteger createBigInteger() {
        long max = Long.MAX_VALUE;

        String s = max + "";

        return new BigInteger(s);
    }

    public static boolean isSquare(BigInteger n) {
        return n.sqrt().multiply(n.sqrt()).equals(n);
    }
}
