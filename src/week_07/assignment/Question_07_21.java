package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls : ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine : ");
        int numberOfSlots = input.nextInt();

        String[] path = new String[numberOfBalls];

        for (int i = 0; i < path.length; i++) {
            path[i] = input.next();
        }

        int[] slots = getSlots(path, numberOfSlots);

        printBall(slots);


    }

    public static int getMax(int[] slots) {
        int max = slots[0];
        for (int i = 1; i < slots.length; i++) {
            if (slots[i] > max) {
                max = slots[i];
            }
        }

        return max;
    }

    public static void printBall(int[] slots) {
        int tempMax = 1;
        int lastIndex = 0;
        int index = 0;
        int max = getMax(slots);
        int count = 0;

        while(tempMax > 0){
            tempMax = 0;

            for (int j = 0; j < slots.length; j++) {
                if(slots[j] > tempMax){
                    tempMax = slots[j];
                    index = j;
                }
            }

            if(tempMax == 0){
                break;
            }

            count++;

            for (int i = 0; i < max - tempMax; i++) {
                    System.out.println();
            }

            if(lastIndex < index && count > 1){
                for (int i = 0; i < index - lastIndex - 1; i++) {
                    System.out.print(" ");
                }
            }else{
                for (int i = 0; i < index; i++) {
                    System.out.print(" ");
                }
            }

            System.out.print("0");

            max = tempMax;
            slots[index]--;
            lastIndex = index;
        }
    }

    public static int[] getSlots(String[] path, int k) {
        int[] slots = new int[k];
        for (String s : path) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'R') {
                    count++;
                }
            }
            slots[count]++;
        }

        return slots;
    }


}

