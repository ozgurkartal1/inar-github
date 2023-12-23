package week_14.assignment;

import java.util.*;

public class Question_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();

        System.out.println(number + " is a " +(isHappy(number) ? "happy "
                : "unhappy ") + "number");


    }
    public static boolean isHappy(int number) {
        Set<Integer> set = new HashSet<>();
        while (number != 1 && !set.contains(number)){
            set.add(number);
            number = sumOfSquare(number);

        }

        return number == 1;
    }

    public static int sumOfSquare(int number) {
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            sum += (int) (Math.pow(digit, 2));

            number /= 10;
        }

        return sum;
    }


}
