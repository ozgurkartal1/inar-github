package src.week_05.assignment;

public class Question_05_06 {

    public static void main(String[] args) {

        System.out.println("Miles\t\tKilometers\t\t|\t\tKilometers\t\tMiles");

        for (int i = 1; i <= 10 ; i++) {
            int j = 5 * i + 15;
            System.out.printf("%1d\t\t\t%4.3f\t\t\t|\t\t%2d\t\t\t\t%5.3f\n", i, (1.609 * i), j, (j / 1.609));
        }

    }
}
