package src.week_09.assignment.Question_09_03;

import java.util.Date;

public class Question_09_03 {

    public static void main(String[] args) {

        for (int i = 4; i < 12; i++) {
            long elapsedTime = (long) (Math.pow(10.0, i));
            Date date = new Date(elapsedTime);

            System.out.println("For elapsed " + elapsedTime + " time is " +
                    date.toString());
        }
    }
}
