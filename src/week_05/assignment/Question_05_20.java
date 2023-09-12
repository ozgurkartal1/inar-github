package src.week_05.assignment;

public class Question_05_20 {

    public static void main(String[] args) {

        int countOfPrimeNumber = 0;


        for (int i = 2; i <= 1000; i++) {
            boolean statementForIsPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    statementForIsPrime = false;
                    break;
                }
            }

            if (statementForIsPrime) {

                System.out.print(i + " ");
                countOfPrimeNumber++;

                if (countOfPrimeNumber % 8 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
