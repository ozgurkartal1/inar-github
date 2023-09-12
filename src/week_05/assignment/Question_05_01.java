package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int countOfPositiveNumber = 0;
        int countOfNegativeNumber = 0;
        int count = 0;
        int sum = 0;
        double average;


        System.out.print("Enter an integer, the input ends if it is 0 :");
        int number = input.nextInt();

        while(number != 0){ //

            if(number > 0){
                countOfPositiveNumber++; // number of positive number

            }else {
                countOfNegativeNumber++;  // number of negative number
            }
            sum += number;
            count++;

            number = input.nextInt();
        }

        if(count != 0){
            average = (double)(sum) / count;

            System.out.println("The number of positive is " + countOfPositiveNumber);
            System.out.println("The number of negative is " + countOfNegativeNumber);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);

        }else {
            System.out.println("No numbers are entered except 0");
        }

    }
}
