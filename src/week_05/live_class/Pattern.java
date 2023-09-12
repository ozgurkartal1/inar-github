package src.week_05.live_class;

public class Pattern {

    public static void main(String[] args) {

        System.out.println("\nPattern A");

        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i ; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
