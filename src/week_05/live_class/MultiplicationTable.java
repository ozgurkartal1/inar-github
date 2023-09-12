package src.week_05.live_class;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("             Multiplication table");
        System.out.print("    ");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d",i);
        }

        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
