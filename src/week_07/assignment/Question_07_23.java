package src.week_07.assignment;

import java.util.Arrays;

public class Question_07_23 {

    public static void main(String[] args) {

        boolean[] locker = new boolean[100];


        for (int i = 0; i < 100; i++) {
            for (int j = i; j < locker.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    locker[j] = !locker[j];
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            if (locker[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
