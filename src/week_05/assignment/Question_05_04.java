package src.week_05.assignment;

public class Question_05_04 {

    public static void main(String[] args) {

        System.out.println("Miles\t\tKilometers");

        for(int i = 1 ; i <= 10 ; i++){
            System.out.printf("%2d\t\t\t%.3f\n", i, (i * 1.609));
        }
    }
}
