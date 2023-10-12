package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers : ");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int greatestCommonDivisor = gcd(numbers);

        System.out.println("Greatest common divisor is " + greatestCommonDivisor);

    }

    public static int gcd(int[] numbers) {

        int gcd = 1;
        int min = getMin(numbers);


        for (int i = 2; i <= min ; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] % i == 0){
                    count++;
                }
            }

            if (count == numbers.length){
                gcd = i;
            }
        }

        return gcd;
    }

    public static int getMin(int[] numbers) {

        int min = numbers[0];

        for (int i : numbers) {
            if(i < min){
                min = i;
            }
        }

        return min;
    }

}
