package week_14.assignment;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.print("Enter words (enter -1 to finish) : ");

        String s;

        do{
            s = input.next();
            if(!s.equals("-1")){
                arrayList.add(s);
            }
        }while (!s.equals("-1"));

        System.out.println(arrayList);

        Map<Map<Character, Integer>, Integer> map = new HashMap<>();

        for (String string : arrayList) {
            Map<Character, Integer> result = createMap(string);
            if (!map.containsKey(result)) {
                map.put(result, 1);
            } else {
                map.put(result, map.get(result) + 1);
            }
        }

        Set<Map<Character, Integer>> set = map.keySet();
        Set<Set<String>> set1 = new HashSet<>();

        for (Map<Character, Integer> map1 : set){
            Set<String> set2 = new HashSet<>();
            for (String s1 : arrayList){
                Map<Character, Integer> result = createMap(s1);
                if(map1.equals(result)){
                    set2.add(s1);
                }
            }

            set1.add(set2);
        }

        System.out.println(set1);
    }

    private static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), 1);
            }else{
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
        }

        return result;
    }
}
