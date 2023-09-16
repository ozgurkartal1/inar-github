package src.week_06.live_class;

import java.util.Scanner;

public class StackOverFlowExample {
    public static void main(String[] args) {

        int sum = addThenMultiply(3, 5);
        System.out.println("sum = " + sum);
    }

    public static int addThenMultiply(int number1, int number2) {
        int result = number1 + number2;
        result = multiply(result, 2);
        return result;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
