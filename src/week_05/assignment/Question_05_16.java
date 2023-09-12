package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        int k = 2;

        while (number > 1) {
            boolean statementForIsPrime = true;

            for (int i = 2; i < number; i++) {

                if (k % i == 0) {
                    statementForIsPrime = false;
                    break;
                }
            }
            if (statementForIsPrime) {
                while (number % k == 0) {
                    System.out.print(k + " ");
                    number /= k;
                }
            }
            k++;
        }
    }
}
