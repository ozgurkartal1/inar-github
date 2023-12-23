package week_14.assignment;

import java.util.*;

public class Question_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list : ");
        int size = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 3);
            list.add(number);
        }

        System.out.println("Generated list : " + list);

        Map<Integer, Integer> map = createMapOfList(list);
        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer i : map.keySet()) {
            if(map.get(i) > (10 / 3)){
                list1.add(i);
            }
        }

        System.out.println("Elements appearing more than " + (size / 3) +
                " times " + list1);

    }

    private static Map<Integer, Integer> createMapOfList(ArrayList<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }
        return map;
    }
}
