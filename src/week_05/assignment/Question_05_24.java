package src.week_05.assignment;

public class Question_05_24 {

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i <= 97 ; i+= 2) {

            sum += i / (double)(i + 2);
        }
        System.out.println("Sum of series : " + sum);
    }
}
