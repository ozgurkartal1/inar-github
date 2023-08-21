package week_03.assignment;

import java.util.Scanner;

public class Question_03_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter time zone offset to GMT : ");
        int timeZoneOffset = input.nextInt();

        long millisecond = System.currentTimeMillis();
        long totalSecond = millisecond / 1000;
        long remainingSeconds = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long remainingMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long remainingHours = (totalHours + timeZoneOffset) % 24;

        if(remainingHours < 12){
            System.out.println("The current time is " + remainingHours + ":" +
                    remainingMinutes + ":" + remainingSeconds + " AM ");
        }else{
            if(remainingHours == 12){
                System.out.println("The current time is " + remainingHours + ":" +
                        remainingMinutes + ":" + remainingSeconds + " PM ");
            }
            else{
                System.out.println("The current time is " + (remainingHours - 12) + ":" +
                        remainingMinutes + ":" + remainingSeconds + " PM ");
            }
        }

    }
}
