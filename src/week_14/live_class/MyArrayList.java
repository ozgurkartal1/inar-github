package week_14.live_class;

import java.util.*;

public class MyArrayList {

    public static void main(String[] args) {

        String[] list = new String[]{"java", "sql", "datastructure", "api"};

        String doc = "java java api stream sql mySql server database key silk mysql sql datastructure api api Java sever database".toLowerCase();

        String[] array = doc.split(" ");

        System.out.println(Arrays.toString(array));

        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList(array));

        Map<String, Integer> map = new HashMap<>();

        for (String s : array) {
           if(map.containsKey(s)){



               map.put(s, map.get(s) + 1);
           }else{
               map.put(s, 1);
           }

        }

        System.out.println(map);



    }
}
