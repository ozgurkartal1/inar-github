package src.week_05.live_class;

public class FutureTuition {

    public static void main(String[] args) {

        double tuition = 10000;

        int year = 0;

        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
            System.out.printf("%2d. year : $%.2f\n",year, tuition);
        }
        System.out.printf("Tuition will be doubled in %2d years\n" +
                "Tuition will be $%.2f in %2d years", year, tuition, year);
    }
}
