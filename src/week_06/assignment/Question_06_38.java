package src.week_06.assignment;

public class Question_06_38 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomUppercaseLetter() + " ");

            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");

            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }

    }

    private static char getRandomDigitCharacter() {
        return (char)(Math.random() * ('9' - '0' + 1) + '0');
    }

    private static char getRandomUppercaseLetter() {
        return (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
    }

}
