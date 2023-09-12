package src.week_05.assignment;

public class Question_05_25 {

    public static void main(String[] args) {

        double pi = 0;

        for (int i = 1; i <= 100000; i++) {

            pi += 4 * (Math.pow(-1, (i + 1)) / (2 * i - 1));

            if(i == 10000){
                System.out.println("PI value for i = 10000 : " + pi);
            } else if (i == 20000) {
                System.out.println("PI value for i = 20000 : " + pi);
            } else if (i == 100000) {
                System.out.println("PI value for i = 100000 : " + pi);
            }
        }
    }
}
