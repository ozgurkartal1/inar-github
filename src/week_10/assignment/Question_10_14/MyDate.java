package src.week_10.assignment.Question_10_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;

    private int day;

    MyDate(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);

        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    void setDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);

        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }




}
