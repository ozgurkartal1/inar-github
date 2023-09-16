package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();

        System.out.print("Enter month as number between 1 - 12 : ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {

        printMonthHead(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthBody(int year, int month) {

        int firstDayOfMonth = getFirstDayOfTheMonth(year,month);
        int numberOfDaysInMont = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDaysInMont; i++) {
            System.out.printf("%2d  ", i);
            if((i + firstDayOfMonth) % 7 == 0){
                System.out.println();
            }
        }

    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (isLeapYear(year)){
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                   month == 8 || month == 10 || month == 12){
                return 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            }else {
                return 29;
            }
        }else {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12){
                return 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            }else {
                return 28;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printMonthHead(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println("\t\t" + monthName + " " + year);
        System.out.println("----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "0";
        }
    }
    public static int getFirstDayOfTheMonth(int year, int month){
        int h = 0;
        int firstDayOfMonth = 1;
        if(month == 1 || month == 2){
            month += 12;
            year--;
        }
        int century = year / 100;
        int yearOfTheCentury = year % 100;

        h = (firstDayOfMonth + 26 * (month + 1) / 10 + yearOfTheCentury +
            yearOfTheCentury / 4 + century / 4 + 5 * century + 6) % 7;

        return h;
    }
}
