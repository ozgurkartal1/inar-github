package src.week_11.assignment.question_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer;

        do{
            System.out.print("What is " + number1 + " + " + number2 + "?");
            answer = input.nextInt();
            list.add(answer);

            if(isDuplicated(list)){
                list.remove(list.size() - 1);
                System.out.println("You already entered " + answer);
            }

            if(answer != (number1 + number2)){
                System.out.print("Wrong answer. Try again. ");
            }


        }while (number1 + number2 != answer);

        System.out.println("You got it");
    }

    public static boolean isDuplicated(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int number1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int number2 = list.get(j);
                if(number1 == number2){
                    return true;
                }
            }
        }

        return false;
    }


}
