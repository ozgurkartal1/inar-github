package week_13.assignmet.question_13_03;

import java.util.ArrayList;

public class Question_13_03 {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before sort : ");
        System.out.println("List -> " + list);

        sort(list);

        System.out.println("After sort : ");
        System.out.println("List -> " + list);
    }

    public static void sort(ArrayList<Number> list) {
        int index = 0;

        while (index < list.size()){
            Number min = list.get(index);
            int minIndex = index;
            Number number = list.get(index);

            for (int i = index + 1; i < list.size(); i++) {
                if(list.get(i).doubleValue() < min.doubleValue()){
                    min = list.get(i);
                    minIndex = i;
                }
            }

            list.set(minIndex, number);
            list.set(index, min);

            index++;
        }
    }
}
