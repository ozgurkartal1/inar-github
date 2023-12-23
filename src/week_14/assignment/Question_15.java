package week_14.assignment;

import java.util.*;

public class Question_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements(n) : ");
        int numberOfElements = input.nextInt();

        System.out.print("Enter the elements of the ArrayList" +
                "(each in the range [1, n]) : ");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= numberOfElements ; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < numberOfElements; i++) {
            int number = input.nextInt();
            map.put(number, map.get(number) + 1);

        }

        Set<Integer> keys = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : keys){
            if(map.get(i) == 0){
                list.add(i);
            }
        }

        System.out.print("Numbers missing from the ArrayList : " + list);
    }
}
