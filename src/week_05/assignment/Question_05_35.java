package src.week_05.assignment;

public class Question_05_35 {

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i <= 624 ; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        System.out.print("The sum of the serie is " + sum);
    }
}
