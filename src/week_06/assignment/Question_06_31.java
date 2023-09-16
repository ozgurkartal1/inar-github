package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer : ");
        long cardNumber = input.nextLong();

        if(isValid(cardNumber)){
            System.out.println(cardNumber + " is valid");
        }else {
            System.out.println(cardNumber + " is invalid");
        }

    }
    public static boolean isValid(long number){
        int size = getSize(number);
        int sum = sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);

        if(size < 13 || size > 16){
            return false;
        }
        if(!prefixMatched(number)){
            return false;
        }
        if(sum % 10 != 0){
            return false;
        }

        return true;
    }
    public static int getSize(long number){
        int count = 0;
        while (number != 0){
            count++;
            number /= 10;
        }
        return count;
    }

    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        int count = 0;

        while(number != 0){
            int digit = (int)(number % 10);
            count++;
            if(count % 2 == 0){
                sum += getDigit(digit * 2);
            }
            number /= 10;
        }
        return sum;
    }

    public static int getDigit(int i) {

        int sum = 0;
        while(i != 0){
            int digit = i % 10;
            sum += digit;
            i /= 10;
        }
       return sum;
    }

    public static int sumOfOddPlace(long number){
        int sum = 0;
        int count = 0;

        while(number != 0){
            int digit = (int)(number % 10);
            count++;
            if(count % 2 != 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
    public static int getPrefix(long number){
        int size = getSize(number);

        if(number / (long)(Math.pow(10, (size - 1))) == 3){
            return (int)(number / (long) (Math.pow(10, (size - 2))));
        }
        return (int)(number / (long)(Math.pow(10, (size - 1))));
    }

    public static boolean prefixMatched(long number){
        int prefix = getPrefix(number);
        return prefix == 4 || prefix == 5 || prefix == 6 || prefix == 37;
    }

}
