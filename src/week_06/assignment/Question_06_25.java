package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds : ");
        long millis = input.nextLong();

        String s = convertMillis(millis);

        System.out.println("hours : minutes : seconds : " + s);
    }

    public static String convertMillis(long millis) {
        String s = "";

        long remainingSeconds = millis / 1000;
        long seconds = remainingSeconds % 60;
        s = Long.toString(seconds) + s;

        long remainingMinutes = remainingSeconds / 60;
        long minutes = remainingMinutes % 60;
        s = Long.toString(minutes) + " : " + s;

        long remainingHours = remainingMinutes / 60;
        s = Long.toString(remainingHours) + " : " + s;

        return s;
    }

}
