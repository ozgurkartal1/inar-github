package src.week_09.assignment.Question_09_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question_09_05 {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current year : " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month : " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);

        System.out.println("\nAfter set time : ");

        System.out.println("Current year : " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month : " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));


    }
}
