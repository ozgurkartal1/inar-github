package src.week_07.live_class;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int sizeOfArray = input.nextInt();

        double[] array = getArray(sizeOfArray);

        printArray(array);

    }

    private static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5.2f ", array[i]);
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    private static double[] getArray(int size) {

       double [] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
        }
        return array;
    }
}
