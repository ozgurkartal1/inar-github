package src.week_09.assignment.Question_09_06;

import java.util.Arrays;

public class Question_09_06 {

    public static void main(String[] args) {

        StopWatch watch = new StopWatch();

        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        watch.start();

        selectionSort(array);

        watch.stop();

        System.out.println("The execution time of sorting 100,000 numbers using " +
                "selection sort : " + watch.elapsedTime() + " milliseconds");

    }

    public static void selectionSort(int[] array){
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
    }
}
