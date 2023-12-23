package week_14.assignment;

import java.io.File ;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_23 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\" +
                "Questions\\src\\Question_23.java");

        if(!file.exists()){
            System.out.println("Go Home");
            System.exit(1);
        }

        Map<String, Integer> map = new TreeMap<>();

        try(Scanner input = new Scanner(file)) {
            System.out.println("Non-duplicate words in ascending order:");
            while(input.hasNext()){
                String s = input.next();
                String[] array = s.split("[\\s\\d._;}/:!{)(\\[\\]\\\\<>+*=,\"\\-]+");


                for (String string : array){
                    if(string.isEmpty()){
                        break;
                    }
                    if(!map.containsKey(string)){
                       map.put(string, 1);
                    }else {
                        map.put(string, map.get(string) + 1);
                    }
                }
            }
        }

        Set<String> key = map.keySet();

        for (String s : key){
            if(map.get(s) == 1){
                System.out.println(s);
            }
        }

    }
}
