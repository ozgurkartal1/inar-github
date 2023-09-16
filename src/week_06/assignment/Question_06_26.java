package src.week_06.assignment;

public class Question_06_26 {

    public static void main(String[] args) {

        final int COUNT_OF_NUMBERS = 100;

        printPalindromicAndPrimeNumbers(COUNT_OF_NUMBERS);
    }
    public static void printPalindromicAndPrimeNumbers(final int COUNT_OF_NUMBERS) {
        int count = 0;
        int number = 2;

        while (count < COUNT_OF_NUMBERS) {
            if (isPalindromic(number) && isPrime(number)) {
                count++;
                System.out.print(number + " ");
                if(count % 10 == 0){
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromic(int number) {
        int temp = number;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int reverseNumber = 0;
        temp = number;


        for (int i = count; i > 0; i--) {
            int digit = temp % 10;
            reverseNumber += digit * (int) (Math.pow(10, (i - 1)));
            temp /= 10;
        }
        if (reverseNumber == number) {
            return true;
        }

        return false;
    }
}
