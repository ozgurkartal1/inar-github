package week_14.live_class;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapC {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(234, "Ozgur Kartal");
        map.put(655, "Ekin Çal");
        map.put(476, "Esin");

        // keySet Metodu keyleri tutmak için kullanılan bir method.

        Set<Integer> set = map.keySet();

        System.out.println(set);
    }
}
