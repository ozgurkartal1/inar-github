package week_04.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_04_25 {

    public static void main(String[] args) {

        int random1 = (int) (Math.random() * ('Z' - 'A' + 1)) + 'A';
        int random2 = (int) (Math.random() * 10) + '0';

          char plateNumberDigit1 = (char) (random1);

          random1 = (int) (Math.random() * ('Z' - 'A' + 1)) + 'A';
          char plateNumberDigit2 = (char) (random1);

          random1 =(int) (Math.random() * ('Z' - 'A' + 1)) + 'A';
          char plateNumberDigit3 = (char) (random1);

          random2 = (int) (Math.random() * 10) + '0';
          char plateNumberDigit4 = (char) (random2);

          random2 = (int) (Math.random() * 10) + '0';
          char plateNumberDigit5 = (char) (random2);

          random2 = (int) (Math.random() * 10) + '0';
          char plateNumberDigit6 = (char) (random2);

          random2 = (int) (Math.random() * 10) + '0';
          char plateNumberDigit7 = (char) (random2);

         String generatedPlateNumber = "" + plateNumberDigit1 + plateNumberDigit2 + plateNumberDigit3 + plateNumberDigit4 +
                 plateNumberDigit5 + plateNumberDigit6 + plateNumberDigit7;


       System.out.print("Generate plate number is : " + generatedPlateNumber);





    }
}
