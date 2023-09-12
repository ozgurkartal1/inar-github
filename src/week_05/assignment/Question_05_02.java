package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTION = 10;
        int countOfCorrect = 0;
        long startTime = System.currentTimeMillis();
        String output = "";

        int i = 1;

        while(i <= NUMBER_OF_QUESTION){
            int number1 = (int)(Math.random() * 15) + 1;
            int number2 = (int)(Math.random() * 15) + 1;

            System.out.print("What is " + number1 + " + " + number2 + " ? " );
            int answer = input.nextInt();

            if(answer == (number1 + number2)){
                System.out.println("You are correct ");
                countOfCorrect++;
            }else{
                System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            }

            i++;
            output += "\n" + number1 + "+" + number2 + "=" + answer + " " +
                    (((answer == (number1 + number2)))?"correct":"wrong");
        }
        long endTime = System.currentTimeMillis();
        System.out.print("\n\nCorrect count is " + countOfCorrect +
                         "\nTest time is " + ((endTime - startTime) / 1000) + " seconds" +
                         "\n" + output);
    }
}
