package week_14.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size 'n' for ArrayList A : ");
        int sizeA = input.nextInt();
        System.out.print("Enter " + sizeA + " Integers for ArrayList A : ");

        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < sizeA; i++) {
            int number = input.nextInt();
            A.add(number);
        }

        System.out.print("Enter the size 'n' for ArrayList B : ");
        int sizeB = input.nextInt();
        System.out.print("Enter " + sizeA + " Integers for ArrayList B : ");

        ArrayList<Integer> B = new ArrayList<>();

        for (int i = 0; i < sizeB; i++) {
            int number = input.nextInt();
            B.add(number);
        }

        ArrayList<Integer> C = merged(A, B);

        System.out.println(C);
    }

    private static ArrayList<Integer> merged(ArrayList<Integer> a, ArrayList<Integer> b) {
        Collections.sort(a);
        ArrayList<Integer> result = (ArrayList<Integer>) a.clone();
        b.sort(Collections.reverseOrder());
        result.addAll(b);

        return result;
    }
}
