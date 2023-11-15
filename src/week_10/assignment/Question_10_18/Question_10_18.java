package src.week_10.assignment.Question_10_18;

import java.math.BigInteger;

public class Question_10_18 {

    public static void main(String[] args) {

        long max = Long.MAX_VALUE;
        String s = max + "";

        BigInteger bigInteger = new BigInteger(s);
        int count = 0;

        while (count < 5){
            bigInteger = bigInteger.add(BigInteger.ONE);

            if(isPrime(bigInteger)){
                System.out.println(bigInteger);
                count++;
            }
        }
    }

    public static boolean isPrime(BigInteger bigInteger) {
        BigInteger divisor = new BigInteger("2");

        while (!divisor.equals(bigInteger.divide(new BigInteger("2")))){
            if(bigInteger.remainder(divisor).equals(BigInteger.ZERO)){
                return false;
            }
        }

        return true;
    }
}
