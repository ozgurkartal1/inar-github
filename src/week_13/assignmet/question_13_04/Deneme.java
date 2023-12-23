package week_13.assignmet.question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deneme {

    public static void main(String[] args) {

        Calendar c = new GregorianCalendar(2016, 4, 1);

        System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
