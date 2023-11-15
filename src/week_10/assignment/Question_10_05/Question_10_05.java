package src.week_10.assignment.Question_10_05;

import src.week_10.live_class.example1.StackOfIntegers;

import java.util.Scanner;

public class Question_10_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        int divisor = number - 1;

        System.out.print("Decreasing order : ");

        while (divisor > 1){
            if(number % divisor == 0 && isPrime(divisor)){

                System.out.print(divisor + " ");

                stack.push(divisor);
            }

            divisor--;
        }

        System.out.println();

        System.out.print("We used pop() method : " );

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }


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
