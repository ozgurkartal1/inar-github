package week_14.assignment;

import java.util.*;

public class Question_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to stop) : ");
        int number;
        Map<Integer, Integer> map = new HashMap<>();

        do {
            number = input.nextInt();
            if(number != 0){
                if(!map.containsKey(number)){
                    map.put(number, 1);
                }else{
                    map.put(number, map.get(number) + 1);
                }
            }
        }while(number != 0);

        Set<Integer> set = map.keySet();
        ArrayList<Integer> arrayList = new ArrayList<>(set);

        Integer max = arrayList.get(0);
        Integer maxCount = map.get(arrayList.get(0));

        for (int i = 1; i < arrayList.size(); i++) {
            if(map.get(arrayList.get(i)) > maxCount){
                max = arrayList.get(i);
                maxCount = map.get(arrayList.get(i));
            }
        }

        System.out.println(max + " --> " + maxCount + " times");


    }
}
