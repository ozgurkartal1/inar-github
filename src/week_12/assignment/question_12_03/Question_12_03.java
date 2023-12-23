package week_12.assignment.question_12_03;

import java.util.Scanner;

public class Question_12_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int[] array = createArray();

        System.out.print("Enter the index of the array : ");
        int index = input.nextInt();

        try {
            int number = choose(index, array);
            System.out.println("You choose : " + number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
    }

    public static int choose(int index, int[] array) {
        if(index >= array.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public static int[] createArray(){
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }
}
