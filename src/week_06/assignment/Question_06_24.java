package src.week_06.assignment;

public class Question_06_24 {

    public static void main(String[] args) {

        long milliSeconds = System.currentTimeMillis();

        printCalendar(milliSeconds);
    }

    public static void printCalendar(long milliSeconds) {

        int currentSeconds = getCurrentSecond(milliSeconds);
        int currentMinutes = getCurrentMinutes(milliSeconds);
        int currentHours = getCurrentHours(milliSeconds);
        int currentYear = getCurrentYear(milliSeconds);
        int currentMonth = getCurrentMonth(milliSeconds, getCurrentYear(milliSeconds));
        int currentDay = (getCurrentDay(milliSeconds, getCurrentYear(milliSeconds),
                getCurrentMonth(milliSeconds, getCurrentYear(milliSeconds))));

        System.out.println((currentHours % 12)+ " : " + currentMinutes + " : " + currentSeconds +
                ((currentHours > 12) ? " PM" : " AM") + "\n" +
                currentDay + " / " + currentMonth + " / " + currentYear);


    }

    public static int getCurrentDay(long milliSeconds, int currentYear, int currentMonth) {
        int sum = 0;
        for (int i = 1; i < currentMonth; i++) {
            sum += getNumberOfDaysInMonth(currentYear, i);
        }

        return getNumberOfDaysInCurrentYear(milliSeconds, currentYear) - sum + 1;
    }

    public static int getCurrentMonth(long milliSeconds, int year){

        int numberOfDaysInCurrentYear = getNumberOfDaysInCurrentYear(milliSeconds, year);
        int month = 1;

        while (numberOfDaysInCurrentYear >= getNumberOfDaysInMonth(year, month)){
            numberOfDaysInCurrentYear -= getNumberOfDaysInMonth(year, month);

            month++;
        }

        return month;
    }

    public static int getCurrentYear(long milliSeconds) {
        int year = 1970;
        int totalNumberOfDays = getTotalNumberOfDays(milliSeconds);

        while (totalNumberOfDays >= numberOfDaysInYear(year)){
            totalNumberOfDays -= numberOfDaysInYear(year);
            year++;
        }

        return year;
    }
    public static int getNumberOfDaysInCurrentYear(long milliSeconds, int year){
        int sum = 0;
        for (int i = 1970; i < year; i++) {
            sum += numberOfDaysInYear(i);
        }
        return getTotalNumberOfDays(milliSeconds) - sum;
    }

    public static int getCurrentHours(long milliSeconds) {

        return getTotalHours(milliSeconds) % 24;

    }

    public static int getCurrentMinutes(long milliSeconds) {

        return getTotalMinutes(milliSeconds) % 60;

    }

    public static int getCurrentSecond(long milliSeconds) {

        return getTotalSeconds(milliSeconds) % 60;
    }

    public static int getTotalHours(long milliSeconds){
        return (getTotalMinutes(milliSeconds) / 60) + 3;
    }

    public static int getTotalMinutes(long milliSeconds){
        return getTotalSeconds(milliSeconds) / 60;
    }

    public static int getTotalSeconds(long milliSeconds){
        return (int)(milliSeconds / 1000);
    }
    public static int getTotalNumberOfDays(long milliSeconds){
        return getTotalHours(milliSeconds) / 24;
    }
    public static int numberOfDaysInYear(int year){
        return (isLeapYear(year)) ? 366 : 365;
    }
    public static int getNumberOfDaysInMonth(int year, int month){

        if(month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        } else if (month == 2) {
            if(isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }

        return 30;
    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
