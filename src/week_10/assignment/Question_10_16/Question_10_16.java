package src.week_10.assignment.Question_10_16;

import src.week_10.assignment.Question_10_22.MyString1;

import java.math.BigInteger;

public class Question_10_16 {

    public static void main(String[] args) {

        int count = 0;
        final int NUMBERS_OF_INTEGERS = 10;

        String number = "1";


        BigInteger bigInteger;
        BigInteger divisor1 = new BigInteger("2");
        BigInteger divisor2 = new BigInteger("3");


        int i = 0;

        while(count < NUMBERS_OF_INTEGERS){

            bigInteger = create50DecimalDigitsNumber(number, i);

            if(bigInteger.remainder(divisor1).equals(BigInteger.ZERO) ||
          bigInteger.remainder(divisor2).equals(BigInteger.ZERO)){
              count++;
              System.out.println(bigInteger);
          }

          i++;
        }
    }

    public static BigInteger create50DecimalDigitsNumber(String number, int i) {
        int numberOfDigits = calculateNumberOfDigits(i);

        for (int j = 1; j < 50 - numberOfDigits; j++) {
            number += 0;
        }

        number += i;

        return new BigInteger(number);
    }

    public static int calculateNumberOfDigits(int i) {
        int result = 0;

        if(i == 0){
            return 1;
        }

        while (i != 0){
            i /= 10;
            result++;
        }

        return result;
    }
}
