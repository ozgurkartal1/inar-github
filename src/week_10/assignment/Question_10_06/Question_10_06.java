package src.week_10.assignment.Question_10_06;

import src.week_10.live_class.example1.StackOfIntegers;

public class Question_10_06 {

    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();

        int number = 2;

        while (number < 120){
            if(isPrime(number)){
                stack.push(number);
            }

            number++;
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2 ; i++) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
