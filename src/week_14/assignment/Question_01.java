package week_14.assignment;

import java.util.ArrayList;

public class Question_01 {

    public static void main(String[] args) {


        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer number = (int)(Math.random() * 80) + 20;
            generatedList.add(number);
        }

        System.out.println("Generated integers : " + generatedList);

        ArrayList<Integer> reversedList = reversed(generatedList);

        System.out.println("Reversed list : " + reversedList);
    }

    private static ArrayList<Integer> reversed(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0 ; i--){
            result.add(list.get(i));
        }

        return result;
    }
}
