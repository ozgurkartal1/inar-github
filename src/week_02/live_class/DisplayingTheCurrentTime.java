package week_02.live_class;

import java.util.Scanner;

public class DisplayingTheCurrentTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long milliSeconds = System.currentTimeMillis();

        long totalSeconds = milliSeconds / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHours = totalHours % 24;

        long totalDays = totalHours / 24;

        long currentDays = totalDays % 365;

        long totalMonths = currentDays / 30;

        currentDays = currentDays % 30;

        long totalYears = totalDays / 365;


            System.out.println("Date is " + (1 + currentDays) + "." + (1 + totalMonths) + "." + (1970 + totalYears));

    }
}
