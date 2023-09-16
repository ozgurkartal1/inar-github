package src.week_06.assignment;

public class Question_06_14 {

    public static void main(String[] args) {

        System.out.println("i\t\t\tm(i)\n--------------------------");

        for (int i = 1; i < 1000; i += 100) {
            double sum = estimatePi(i);
            System.out.printf("%1d\t\t\t%.4f\n", i, sum);
        }
    }

    public static double estimatePi(int i) {
        double sum = 0;
        for (int j = 1; j <= i ; j++) {
            sum += 4 * (Math.pow(-1, (j + 1))) / (2 * j - 1);
        }
        return sum;
    }
}
