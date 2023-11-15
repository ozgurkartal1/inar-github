package src.week_11.assignment.question_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");

        int number = input.nextInt();

        ArrayList<Integer> a = findPrimeFactors(number);

        System.out.println("The smallest number n for m * n to be a perfect square is " +
                findSmallestFactors(a));

        System.out.println("m * n is " + number * findSmallestFactors(a));

    }

    private static ArrayList<Integer> findPrimeFactors(int i) {
        ArrayList<Integer> result = new ArrayList<>();
        int k = 2;

        while(i != 1){
            if(isPrime(k)){
               while (i % k == 0){
                   i /= k;
                   result.add(k);
               }
            }

            k++;
        }

        return result;
    }

    public static boolean isPrime(int k) {
        for (int i = 2; i <= k / 2 ; i++) {
            if(k % i == 0){
                return false;
            }
        }

        return true;
    }

    public static int findSmallestFactors(ArrayList<Integer> a){
        int result = 1;
        int count;


        for (int i = 0 ; i < a.size(); i += count) {
            count = 0;
            int n1 = a.get(i);
            for (int j = i ; j < a.size(); j++) {
                int n2 = a.get(j);
                if(n1 == n2){
                    count++;
                }
            }


            if(count % 2 != 0){
                result *= a.get(i);
            }
        }

        return result;
    }


}
