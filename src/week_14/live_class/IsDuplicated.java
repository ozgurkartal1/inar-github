package week_14.live_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class IsDuplicated {

    public static void main(String[] args) {

        String s = "inar academy";

        System.out.println(isDuplicated(s));

        String word = "Inar Academy";


    }

    public static boolean isDuplicated(String s){
        boolean[] array = new boolean[128];

        for (int i = 0 ; i < s.length() ; i++){
            if(!array[s.charAt(i)]){
                array[s.charAt(i)] = true;
            }else{
                return true;
            }

        }

        return false;
    }
}
