package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long number = input.nextLong();

        System.out.println("The approximated square root of "
                + number + " is : " + sqrt(number));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = 1.1;

        while(nextGuess - lastGuess >= 0.0001){

            nextGuess = Math.round((lastGuess + n / lastGuess) / 2);
            lastGuess ++;
        }
        return nextGuess;
    }
}
