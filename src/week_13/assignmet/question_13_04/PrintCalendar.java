package week_13.assignmet.question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {

    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Usage :  month year ");
            System.exit(1);
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);


        Calendar c = new GregorianCalendar(year, month - 1, 1);

        int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("     ");
        }

        for (int i = 1; i <= dayInMonth; i++) {
            System.out.printf("%3d  ", i);

            if((firstDayOfWeek + i - 1) % 7 == 0){
                System.out.println();
            }
        }
    }
}
