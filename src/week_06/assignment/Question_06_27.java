package src.week_06.assignment;

public class Question_06_27 {

    public static void main(String[] args) {

        printFirstHundredEmirpNumbers();
    }

    public static void printFirstHundredEmirpNumbers() {
        int number = 2;
        int count = 0;

        while (count < 100) {
            if (isNumberPrime(number) && isNumberPrime(reversedNumber(number)) &&
                    isPalindromic(number)) {
                count++;
                System.out.print(number + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }

    }

    private static boolean isPalindromic(int number) {
        int reversedNumber = reversedNumber(number);
        return number != reversedNumber;
    }

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int reversedNumber(int number) {
        int temp = number;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int reverseNumber = 0;

        for (int i = count; i > 0; i--) {
            int digit = number % 10;
            reverseNumber += digit * (int) (Math.pow(10, (i - 1)));
            number /= 10;
        }

        return reverseNumber;
    }
}
