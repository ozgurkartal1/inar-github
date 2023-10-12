package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to sort : ");
        String s = input.nextLine().toLowerCase();

        System.out.println("sorted form : " + sort(s));
    }

    public static String sort(String s) {
        String newS = "";
        char[] list = getSortedCharArrayFromString(s);


        for (int i = 0; i < list.length; i++) {
            newS += list[i];
        }

        return newS;

    }


    public static char[] getSortedCharArrayFromString(String s){
        char[] list = new char[s.length()];

        for (int i = 0; i < list.length; i++) {
            list[i] = s.charAt(i);
        }

        int low = 0;
        int high = list.length - 1;

        while(high > low){
            int index = low;
            int min = list[low];

            for (int i = low + 1; i <= high; i++) {
                if(list[i] < min){
                    min = list[i];
                    index = i;
                }
            }

            char temp = list[low];
            list[low] = list[index];
            list[index] = temp;

            low++;
        }


        return list;
    }


}
