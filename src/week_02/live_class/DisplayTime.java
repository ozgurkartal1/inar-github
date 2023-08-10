package week_02.live_class;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a seconds value: ");
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        seconds = (seconds % 3600) % 60;;

        System.out.println("Entering seconds is "  +  hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
