package src.week_05.assignment;

public class Question_05_26 {

    public static void main(String[] args) {

        double e = 0;


        for (int i = 0; i <= 100000; i++) {
            double cross = 1;

            for (int j = 1; j <= i; j++) {
                cross *= j;
            }

            e += (double)1 / cross;

            if(i == 10000){
                System.out.println("PI value for i = 10000 : " + e);

            } else if (i == 20000) {
                System.out.println("PI value for i = 20000 : " + e);

            } else if (i == 100000) {
                System.out.println("PI value for i = 100000 : " + e);
            }
        }
        System.out.println("Java's e is " + Math.exp(1));
    }
}
