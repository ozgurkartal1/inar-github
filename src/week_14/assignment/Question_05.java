package week_14.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_05 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers for ArrayList nums(enter -1 to stop)");

        int number;

        do{
            number = input.nextInt();
            if(number != -1){
                list.add(number);
            }

        }while (number != -1);

        System.out.println(list);

        movingZeros(list);

        System.out.println(list);
    }

    private static void movingZeros(ArrayList<Integer> list) {
      int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0){
                // Count of 0
                count++;
                //

                list.remove(list.get(i));
                i--;
            }
        }

        for (int i = 0; i < count; i++) {
            list.add(0);
        }
    }
}
