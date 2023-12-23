package week_14.assignment;

import java.util.ArrayList;

public class Question_06 {

    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 70) + 30;
            originalList.add(number);
        }

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (Integer i : originalList){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }

        ArrayList<Integer> merged = merged(odd, even);

        System.out.println(merged);
    }

    private static ArrayList<Integer> merged(ArrayList<Integer> odd, ArrayList<Integer> even) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(odd);
        result.addAll(even);
        return result;
    }
}
