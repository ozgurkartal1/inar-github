package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT : ");
        short timeZoneOffset = input.nextShort();

        long Milliseconds = System.currentTimeMillis();

        long totalSeconds = Milliseconds / 1000 ;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60 ;

        long totalHours = totalMinutes / 60;

        long currentHours = (totalHours + timeZoneOffset) % 24;

        System.out.println("The current time is " + currentHours  + ":" +currentMinutes + ":" + currentSeconds +  " GMT +3");
    }
}
