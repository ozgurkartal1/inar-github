package src.week_06.assignment;

public class Question_06_09 {

    public static void main(String[] args) {

        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-----------------------------------------------");

        for (float i = 1.0f; i <= 10.0f ; i+= 1.0f) {
            System.out.printf("%3.1f\t\t%.3f\t|\t",i, footToMeter(i));
            System.out.printf("%.1f\t%.3f\n",(5 * i + 15), meterToFoot(5 * i + 15));
        }


    }

    private static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
}
