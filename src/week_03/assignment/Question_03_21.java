package week_03.assignment;

import java.util.Scanner;

public class Question_03_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();

        System.out.print("Enter month : 1-12 : ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month : 1-31 : ");
        int dayOfTheMonth = input.nextInt();

        if(month <= 2){
            month = month + 12;
            year = year - 1;
        }

        int century = (year / 100) ;
        int yearOfTheCentury = (year % 100);

        int dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1)) / 10 + yearOfTheCentury + yearOfTheCentury / 4 +
                century / 4 + 5 * century) % 7;

        switch (dayOfTheWeek){
            case 0 -> System.out.println("Day of the week is Saturday");
            case 1 -> System.out.println("Day of the week is Sunday");
            case 2 -> System.out.println("Day of the week is Monday");
            case 3 -> System.out.println("Day of the week is Tuesday");
            case 4 -> System.out.println("Day of the week is Wednesday");
            case 5 -> System.out.println("Day of the week is Thursday");
            case 6 -> System.out.println("Day of the week is Friday");
        }


    }
}
