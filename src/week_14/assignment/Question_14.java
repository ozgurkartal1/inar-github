package week_14.assignment;

import java.util.*;

public class Question_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> arrayList = createArrayList();

        System.out.println("Original list of words : " + arrayList);

        Map<String, Map<Character, Integer>> map = new HashMap<>();

        for (String string : arrayList) {
            Map<Character, Integer> result = createMap(string);

            map.put(string, result);
        }

        Collection<Map<Character, Integer>> values = map.values();
        Set<String> keys = map.keySet();

        Set<Set<String>> set = new HashSet<>();

        for (Map<Character, Integer> value : values) { // -> b = 1 , a = 1, t = 1
            Set<String> set1 = new HashSet<>();
            for (String key : keys) {
                if (value.equals(map.get(key))) {
                    set1.add(key);
                }
            }
            set.add(set1);
        }

        System.out.println("Anagram groups : " + set);
    }

    private static List<String> createArrayList() {
        Scanner input = new Scanner(System.in);

        List<String> result = new ArrayList<>();

        System.out.print("Enter words (enter -1 to finish) : ");
        String s;
        do {
            s = input.next();
            if (!s.equals("-1")) {
                result.add(s);
            }
        } while (!s.equals("-1"));

        return result;
    }

    private static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!result.containsKey(s.charAt(i))) {
                result.put(s.charAt(i), 1);
            } else {
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
        }

        return result;
    }
}
