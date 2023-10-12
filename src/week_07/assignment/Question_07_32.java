package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = input.nextInt();

        System.out.print("Enter the list : ");

        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int k = list[0];

        boolean st1;
        boolean st2;

        do {

            st1 = false;
            st2 = false;

            int index = partition(list, k);
            int currentIndex = -1;
            int maxIndex = -1;

            for (int i = list.length - 1; i >= 0; i--) {
                if (list[i] < k && index < i) {
                    maxIndex = i;
                    break;
                }
            }

            while (!(maxIndex == index) && maxIndex != -1) {
                int max = -1;
                for (int i = index + 1; i < list.length; i++) {
                    if (k > list[i] && list[i] > max) {
                        max = list[i];
                        currentIndex = i;
                        st1 = true;
                    }
                }

                int temp = list[currentIndex];
                list[currentIndex] = list[index];
                list[index] = temp;

                index = partition(list, k);

            }

            for (int i = 0; i < index; i++) {
                if (list[i] > k) {
                    currentIndex = i;
                    st2 = true;
                    break;
                }
            }

            if (st2) {
                int temp = list[currentIndex];
                list[currentIndex] = list[index];
                list[index] = temp;
            }

        } while (st1 || st2);

        print(list);
    }

    public static void print(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static int partition(int[] list, int k) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == k) {

                return i;
            }
        }

        return -1;
    }
}
