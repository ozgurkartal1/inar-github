package src.week_10.assignment.Question_10_19;

import java.math.BigInteger;

public class Question_10_19 {

    public static void main(String[] args) {

        System.out.println("p\t\t\t2^p - 1");

        for (int i = 2; i < 100; i++) {
            if(isMersennePrime(i)){
                System.out.println(i + "\t\t\t" + createBigInteger(i));
            }
        }
    }

    public static BigInteger createBigInteger(int i){
        BigInteger bigInteger = BigInteger.ONE;

        for (int j = 0; j < i; j++) {
            bigInteger = bigInteger.multiply(new BigInteger("2"));
        }

        return bigInteger.subtract(BigInteger.ONE);
    }

    public static boolean isMersennePrime(int i) {

        BigInteger bigInteger = createBigInteger(i);


        return isPrime(i) && isPrime(bigInteger);
    }

    public static boolean isPrime(BigInteger bigInteger) {


        for (int i = 0; i < 100; i++) {
            long x = (long)(Math.random() * (Long.MAX_VALUE - 1)) + 2;
            String s = x + "";
            BigInteger divisor = new BigInteger(s);

            if(bigInteger.remainder(divisor).equals(BigInteger.ZERO)){
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }


}
