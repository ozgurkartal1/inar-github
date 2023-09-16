package src.week_06.assignment;

public class Question_06_16 {

    public static void main(String[] args) {

        System.out.println("Year\tDays in year");

        for (int i = 2000; i <= 2020; i++) {
            int daysInYear = numberOfDaysInAYear(i);
            System.out.printf("%4d\t\t\t%3d\n",i, daysInYear);
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if(isLeapYear(year)){
            return 366;
        }
        return 365;
    }
    public static boolean isLeapYear(int year){

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
