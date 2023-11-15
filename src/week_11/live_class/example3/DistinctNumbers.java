package src.week_11.live_class.example3;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (input end with 0) : ");
        int value;

        do{
            value = input.nextInt();

            if(!list.contains(value) && value != 0){
                list.add(value);
            }


        }while(value != 0);

        // Display distinct Numbers :

        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }


}
