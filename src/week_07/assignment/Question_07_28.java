package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        String[] combinations = getCombinations(numbers);

        displayCombinations(combinations);
    }

    public static void displayCombinations(String[] combinations) {
        for (String s : combinations){
            System.out.println(s);
        }
    }

    public static String[] getCombinations(int[] numbers) {
        int length = numbers.length;
        String[] combinations = new String[(length) * (length - 1)];
        int count = 0;

        for (int i = 0 ; i < length ; i++){
            for(int j = 0 ; j < length; j++){
                if(i == j){
                    continue;
                }else {
                    combinations[count] = numbers[i] + " " + numbers[j];
                    count++;
                }

            }
        }

        return combinations;
    }
}
