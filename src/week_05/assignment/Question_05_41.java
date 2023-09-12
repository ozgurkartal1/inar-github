package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_41 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;
        int countOfLargestNumber = 0;

        System.out.println("Enter integers (it ends with input of 0) : ");
        int number;

        do{
              number = input.nextInt();

            if(number > max){
                countOfLargestNumber = 0;
                max = Math.max(number, max);
            }
            if (number == max){
                countOfLargestNumber++;
            }

        }while(number != 0);

        System.out.println("The largest count " + max + " and occurrence of the count is " + countOfLargestNumber);


    }
}
