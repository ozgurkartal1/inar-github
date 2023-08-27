package week_04.assignment;

public class Question_04_16 {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * ('Z' - 'A' + 1)) + 'A';
        char character = (char) randomNumber;
        System.out.println(character);
    }
}
