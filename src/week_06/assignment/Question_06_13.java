package src.week_06.assignment;

public class Question_06_13 {

    public static void main(String[] args) {

        System.out.println("i\t\t\tm(i)");
        System.out.println("------------------------");

        for (int i = 1; i <= 20; i++) {
            double sum = computeSumSeries(i);

            System.out.printf("%1d\t\t\t%.4f\n",i,sum);
        }
    }

    private static double computeSumSeries(int number) {
        double sum = 0;

        for (int i = 1; i <= number ; i++) {

            sum += (double)(i) / (i + 1);
        }
        return sum;
    }
}
