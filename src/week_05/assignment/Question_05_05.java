package src.week_05.assignment;

public class Question_05_05 {

    public static void main(String[] args) {

        System.out.println("Kilograms\t\tPounds\t\t|\t\tPounds\t\tKilograms");
        for (int i = 1; i <= 200; i += 2) {
            int j = (int) (i * 2.5 + 17.5);
            System.out.printf("%3d\t\t\t\t%5.1f\t\t|\t\t%3d\t\t\t\t%5.2f\n"
                    , i, (i * 2.2), j, j / 2.2);

        }

    }
}
