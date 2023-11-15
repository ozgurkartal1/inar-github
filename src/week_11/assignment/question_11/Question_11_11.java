package src.week_11.assignment.question_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with 0 : ");

        int value;

        do{
            value = input.nextInt();
            if(value!= 0){
                list.add(value);
            }
        }while(value != 0);

        System.out.println("Before sorting..");

        display(list);

        sort(list);

        System.out.println("\nAfter sorting..");

        display(list);
    }

    public static void display(ArrayList<Integer> list){
        for (Integer i : list){
            System.out.print(i + " ");
        }
    }

    public static void sort(ArrayList<Integer> list) {
        int firstIndex = 0;
        int lastIndex = list.size() - 1;

        while(firstIndex < lastIndex){

            int max = list.get(lastIndex);
            int index = lastIndex;

            for (int i = lastIndex - 1; i >= 0; i--) {
                if(list.get(i) > max){
                    max = list.get(i);
                    index = i;
                }
            }

            list.remove(index);
            list.add(lastIndex, max);

            lastIndex--;
        }
    }
}
