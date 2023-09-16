package src.week_06.assignment;

public class Question_06_24 {

    public static void main(String[] args) {

        long n = System.currentTimeMillis() / 1000;

        printTime(n);
        System.out.print("  ");
        printDate(n);
    }

    public static void printTime(long n) {

        long seconds = n % 60;

        long remainingMinutes = n / 60;
        long minutes = remainingMinutes % 60;

        long remainingHours = remainingMinutes / 60;
        long hours = (remainingHours + 3) % 24;

        if (hours > 12){
            hours -= 12;
            System.out.print(hours + ":" + minutes + ":" + seconds + " PM");

        }else {
            System.out.print(hours + ":" + minutes + ":" + seconds + " AM");
        }

    }

    public static long getNumberOfDaysSpentForYears(long n){
        final int INITIAL_YEAR = 1970;
        long numberOfDaysSpentForYears = 0;
        long totalNumberOfDays = getTotalNumberOfDay(n);

        int year = INITIAL_YEAR;

        while (totalNumberOfDays >= daysInAYear(year)){
            totalNumberOfDays -= daysInAYear(year);
            numberOfDaysSpentForYears += daysInAYear(year);
            year++;
        }
        return numberOfDaysSpentForYears;
    }

    public static int getCurrentYear(long n){
        final int INITIAL_YEAR = 1970;
        long totalNumberOfDays = getTotalNumberOfDay(n);

        int year = INITIAL_YEAR;

        while (totalNumberOfDays >= daysInAYear(year)){
            totalNumberOfDays -= daysInAYear(year);
            year++;
        }
        return year;
    }

    public static long getNumberOfDaysSpentForMonths(long n){
        final int INITIAL_MONTH = 1;
        long totalNumberOfDays = getTotalNumberOfDay(n) - getNumberOfDaysSpentForYears(n);
        long numberOfDaysSpentForMonths = 0;

        int year = getCurrentYear(n);
        int month = INITIAL_MONTH;

        while(totalNumberOfDays >= daysInAMonth(year, month)){
            totalNumberOfDays -= daysInAMonth(year, month);
            numberOfDaysSpentForMonths += daysInAMonth(year, month);
            month++;
        }
        return numberOfDaysSpentForMonths;
    }

    public static int getCurrentMonth(long n){
        final int INITIAL_MONTH = 1;
        long totalNumberOfDays = getTotalNumberOfDay(n) - getNumberOfDaysSpentForYears(n);

        int year = getCurrentYear(n);
        int month = INITIAL_MONTH;

        while(totalNumberOfDays >= daysInAMonth(year, month)){
            totalNumberOfDays -= daysInAMonth(year, month);
            month++;
        }
        return month;
    }
    public static long getCurrentDay(long n){
        final int INITIAL_DAY = 1;
        return INITIAL_DAY + getTotalNumberOfDay(n) - getNumberOfDaysSpentForYears(n) -
                getNumberOfDaysSpentForMonths(n);
    }


    public static void printDate(long n){
      int year = getCurrentYear(n);
      int month = getCurrentMonth(n);
      long day = getCurrentDay(n);

        System.out.print(day + " / " + month + " / " + year);

    }

    public static long getTotalNumberOfDay(long n){
    long seconds = n % 60;

    long remainingMinutes = n / 60;
    long minutes = remainingMinutes % 60;

    long remainingHours = remainingMinutes / 60 + 3;
    long hours = remainingHours % 24;

    return remainingHours / 24;
    }

    private static int daysInAMonth(int year, int month) {
        if(isLeapYear(year)){
            if(month == 1 || month == 3 || month == 5 ||
               month == 7 || month == 8 || month == 10 || month == 12){
                return 31;

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;

            }else{
                return 29;
            }
        }else {
            if(month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10 || month == 12){
                return 31;

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;

            }else{
                return 28;
            }
        }
    }

    public static int daysInAYear(int year) {
        if(isLeapYear(year)){
            return 366;
        }
        return 365;
    }
    private static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
