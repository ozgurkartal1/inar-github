package src.week_08.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of banks : ");

        int numberOfBanks = input.nextInt();

        System.out.print("Enter minimum total assets for keeping a bank safe :");

        int minimumTotalAssets = input.nextInt();

        int[][] matrix = new int[numberOfBanks][];

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter bank " + i + " 's total assets : ");
            int assets = input.nextInt();

            System.out.print("Enter the number of banks that borrowed money from bank i :");
            int numberOfBankThatBorrowed = input.nextInt();

            matrix[i] = new int[2 * numberOfBankThatBorrowed + 1];

            matrix[i][0] = assets;

            System.out.print("Enter borrowers ID amount borrowed ->");

            for (int j = 0; j < numberOfBankThatBorrowed; j++) {
                matrix[i][2 * j + 1] = input.nextInt();
                matrix[i][2 * j + 2] = input.nextInt();
            }
        }

        boolean[] safeBanks = new boolean[matrix.length];
        Arrays.fill(safeBanks, true);

        isSafeBanks(matrix, safeBanks, minimumTotalAssets);

        int numberOfUnsafeBank = getCountOfUnsafeBanks(safeBanks);

        int[] indexesOfUnsafeBank = findIndexesOfUnsafeBanks(numberOfUnsafeBank, safeBanks);

        System.out.println("Unsafe banks are : ");

        print(indexesOfUnsafeBank);
    }
    public static void print(int[] a){
        for (int i : a){
            System.out.print(i + " ");
        }
    }
    public static void isSafeBanks(int[][] matrix, boolean[] b, int min) {
        while (true) {
            int previousCount = getCountOfUnsafeBanks(b);

            int[] indexes = findIndexesOfUnsafeBanks(previousCount, b);

            for (int i = 0; i < matrix.length; i++) {
                int total = matrix[i][0];

                for (int j = 1; j < matrix[i].length; j += 2) {
                    if (!isBorrowedUnsafeBank(matrix[i][j], indexes)) {
                        total += matrix[i][j + 1];
                    }
                }
                if (total < 201) {
                    b[i] = false;
                }
            }

            int currentCount = getCountOfUnsafeBanks(b);

            if(previousCount == currentCount){
                break;
            }
        }
    }

    public static boolean isBorrowedUnsafeBank(int i, int[] array) {
        for (int a : array){
            if(a == i){
                return true;
            }
        }

        return false;
    }


    public static int[] findIndexesOfUnsafeBanks(int c, boolean[] b) {
        int[] result = new int[c];

        int count = 0;
        int controlCount = 0;
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                count++;
            }
            if (count != controlCount) {
                result[count - 1] = i;
            }

            controlCount = count;
        }

        return result;
    }

    public static int getCountOfUnsafeBanks(boolean[] b) {
        int result = 0;

        for (boolean st : b) {
            if (!st) {
                result++;
            }
        }

        return result;
    }
}
