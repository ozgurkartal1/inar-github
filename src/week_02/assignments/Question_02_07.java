package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {

    public static void main(String[] args) {

        final int minutesValueOfOneYear = 365 * 24 * 60;
        final int minutesValueOfOneDay = 24 * 60;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes : ");
        int minutes = input.nextInt();

        int years = minutes / minutesValueOfOneYear ;
        int days = (minutes % minutesValueOfOneYear) / minutesValueOfOneDay;


        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days");

    }
}
