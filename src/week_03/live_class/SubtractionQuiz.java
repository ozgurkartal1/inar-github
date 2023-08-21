package week_03.live_class;

import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if(number1 < number2){
           int temp = number1;;
           number1 = number2;
           number2 = temp;
       }
        System.out.println("What is result " + number1 + " - " + number2 + " = ?");
        int subtraction = number1 - number2;

        System.out.print("Enter an answer -> ");
        int answer = input.nextInt();

       if(subtraction == answer){
           System.out.println(number1 + " - " + number2 + " = " + " is " +
                   true);
       }else {
           System.out.println(number1 + " - " + number2 + " = " + " is " +
                   false);
       }

    }
}
