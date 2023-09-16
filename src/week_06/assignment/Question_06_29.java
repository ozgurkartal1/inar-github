package src.week_06.assignment;

public class Question_06_29 {

    public static void main(String[] args) {

        printTwinPrimes();
    }

    private static void printTwinPrimes() {
        int number = 2;

        while (number < 1000){
            if(isPrime(number) && isPrime(number + 2)){
                System.out.println("(" + number + ", " + (number + 2) + ")");
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
