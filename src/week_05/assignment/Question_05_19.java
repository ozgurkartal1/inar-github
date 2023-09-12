package src.week_05.assignment;

public class Question_05_19 {

    public static void main(String[] args) {

        for (int i = 0; i < 8 ; i++) {

            for (int j = 1; j <= 8 - i ; j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= Math.pow(2, i); j *= 2) {
                System.out.printf("%4d", j);
            }

            for (int j = (int)Math.pow(2, (i- 1)); j >= 1 ; j /= 2) {
                System.out.printf("%3d ", j);
            }
            System.out.println();
        }
    }
}
