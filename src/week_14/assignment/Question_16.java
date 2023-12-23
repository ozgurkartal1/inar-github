package week_14.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_16 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\" +
                "Questions\\src\\Question_15.java");

        Map<String, Integer> map = new HashMap<>();

        try(Scanner input = new Scanner(file)){
            while(input.hasNext()){
                String word = input.next();
                String[] arr = word.split
            ("[\\s\\d._;}/:!{)(\\[\\]\\\\<>+*=,\"\\-]+");

                for (String s : arr) {
                    if(s.isEmpty()){
                        break;
                    }
                    if (!map.containsKey(s)) {
                        map.put(s, 1);
                    } else {
                        map.put(s, map.get(s) + 1);
                    }
                }
            }
        }

        display(map);

    }

    private static void display(Map<String, Integer> map) {
        ArrayList<String> key = new ArrayList<>(map.keySet());
        Collections.sort(key);

        for (String s : key){
            System.out.println(s + " -> " + map.get(s));
        }
    }
}
