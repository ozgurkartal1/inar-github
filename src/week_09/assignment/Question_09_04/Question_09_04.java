package src.week_09.assignment.Question_09_04;

import java.util.Random;

public class Question_09_04 {

    public static void main(String[] args) {

        Random random = new Random(1000);

        System.out.println("Random Numbers are : ");

        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(100);
            System.out.print(number + " ");

            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
