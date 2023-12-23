package week_14.assignment;

import java.util.Scanner;
import java.util.Stack;

public class Question_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Post Fix Expression : ");
        String s = input.nextLine();

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                stack.add(s.charAt(i) - '0');
            }else{
                int number1 = stack.pop();
                int number2 = stack.pop();
                switch (s.charAt(i)){
                    case '+' -> result = number1 + number2;
                    case '-' -> result = number1 - number2;
                    case '*' -> result = number1 * number2;
                    case '/' -> result = number1 / number2;
                }

                stack.add(result);
            }

        }

        System.out.println(stack.get(0));
    }
}
