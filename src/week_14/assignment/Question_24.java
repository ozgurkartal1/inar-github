package week_14.assignment;

import java.util.*;

public class Question_24 {

    public static void main(String[] args) {

        int[] arr = {1, 14, 18, 19, 16, 12, 17, 13, 15, 7};
        int[] arr1 = {8, 14, 7, 11, 18, 11, 16, 16, 1, 15};
        ArrayList<Integer> list1= new ArrayList<>();
        for (int i : arr1){
            list1.add(i);
        }

        System.out.println(containsNearbyContains(list1));
    }

    private static boolean containsNearbyContains(ArrayList<Integer> list1) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            if(!map.containsKey(list1.get(i))){
                map.put(list1.get(i), i);
            }else{
                if(i - map.get(list1.get(i)) <= 5){
                    return true;
                }else{
                    map.put(list1.get(i), i);
                }
            }
        }
        return false;
    }
}
