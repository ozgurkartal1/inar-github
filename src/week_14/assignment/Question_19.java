package week_14.assignment;

import java.util.*;

public class Question_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter DNA -> ");
        String dna = input.next();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < dna.length() - 4; i++) {
            String s = dna.substring(i, i + 5);

            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, map.get(s) + 1);
            }
        }

        Set<String> set = map.keySet();
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : set){
            if(map.get(s) > 1){
                arrayList.add(s);
            }
            System.out.println(s + " -> " + map.get(s));
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
