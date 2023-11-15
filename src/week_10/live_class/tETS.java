package src.week_10.live_class;

import java.util.GregorianCalendar;

public class tETS {

    public static void main(String[] args) {

        GregorianCalendar c = new GregorianCalendar();

        System.out.println(c.get(GregorianCalendar.YEAR));

        long elapsedTime = 3999999999999L;

        c.setTimeInMillis(elapsedTime);

        System.out.println(c.get(GregorianCalendar.YEAR));
    }
}
