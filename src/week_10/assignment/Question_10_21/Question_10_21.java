package src.week_10.assignment.Question_10_21;

import java.math.BigInteger;

public class Question_10_21 {

    public static void main(String[] args) {

        BigInteger bigInteger = createBigInteger();

        BigInteger divisor1 = new BigInteger("5");
        BigInteger divisor2 = new BigInteger("6");

        result(bigInteger, divisor1, divisor2);
    }

    private static void result(BigInteger bigInteger, BigInteger divisor1, BigInteger divisor2) {
        int count = 0;
        final int NUMBER_OF_BIGINTEGER = 10;

        while (count < NUMBER_OF_BIGINTEGER){

            if(isDivide(bigInteger, divisor1) ||
            isDivide(bigInteger, divisor2)){
                count++;
                System.out.println(bigInteger);
            }

            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }

    private static boolean isDivide(BigInteger bigInteger, BigInteger divisor1) {
        return bigInteger.remainder(divisor1).equals(BigInteger.ZERO);
    }

    private static BigInteger createBigInteger() {
        long max = Long.MAX_VALUE;
        String s = max + "";

        return new BigInteger(s);
    }
}
