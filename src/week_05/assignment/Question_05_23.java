package src.week_05.assignment;

public class Question_05_23 {

    public static void main(String[] args) {

        double leftToRightSum = 0;
        double rightToLeftSum = 0;

        for (int i = 1; i <= 50000; i++) {

            leftToRightSum += (double) 1 / i;
        }
        System.out.println("Summation of series left to right : " + leftToRightSum);

        for (int i = 50000; i >= 1; i--) {

            rightToLeftSum += (double) 1 / i;
        }
        System.out.println("Summation of series right to left : " + rightToLeftSum);

        System.out.println("Summation of series right to left - Summation of series left to right : " +
                (rightToLeftSum - leftToRightSum));
    }
}
