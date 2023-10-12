package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter scores :  (negative number signifies end) : ");

        int scores;
        int count = 0;

        int[] array = new int[100];

        do {
            scores = input.nextInt();

            array[count] = scores;

            count++;

        } while (scores > 0);

        int[] newArray = new int[count - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        System.out.print("Average of scores: " + getAverage(newArray) + "\n" +
          "Number of scores above or equal to average : " +
                  getNumberOfScoresAboveOrEqualToAverage(newArray) + "\n" +
          "Number of scores below average : " + getNumberOfScoresBelowAverage(newArray));
    }

    public static int getNumberOfScoresBelowAverage(int[] array) {
        int count = 0;
        int average = getAverage(array);

        for (int i : array){
            if(i < average){
                count++;
            }
        }
        return count;
    }

    public static int getNumberOfScoresAboveOrEqualToAverage(int[] array) {
        int count = 0;
        int average = getAverage(array);

        for (int i : array){
            if(i >= average){
                count++;
            }
        }
        return count;
    }

    public static int getAverage(int[] array) {
        float sum = 0;

        for (int i : array){
            sum += i;
        }

        return Math.round(sum / array.length);
    }
}
