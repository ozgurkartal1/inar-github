package week_03.assignment;

import java.util.Scanner;

public class Question_03_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day : ");
        int todayDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today : ");
        int elapsedDay = input.nextInt();

        int futureDay = (todayDay + elapsedDay) % 7;

        switch (todayDay){
            case 0 -> System.out.print("Today is Sunday");
            case 1 -> System.out.print("Today is Monday");
            case 2 -> System.out.print("Today is Tuesday");
            case 3 -> System.out.print("Today is Wednesday");
            case 4 -> System.out.print("Today is Thursday");
            case 5 -> System.out.print("Today is Friday");
            case 6 -> System.out.print("Today is Saturday");
        }

        switch (futureDay){
            case 0 -> System.out.print(" and the future day is Sunday");
            case 1 -> System.out.print(" and the future day is is Monday");
            case 2 -> System.out.print(" and the future day is is Tuesday");
            case 3 -> System.out.print(" and the future day is is Wednesday");
            case 4 -> System.out.print(" and the future day is is Thursday");
            case 5 -> System.out.print(" and the future day is is Friday");
            case 6 -> System.out.print(" and the future day is is Saturday");
        }
    }
}
