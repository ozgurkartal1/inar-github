package week_14.assignment;

import java.util.*;

public class Question_21 {

    public static void main(String[] args) {

        System.out.println("Enter the first list : ");
        List<Integer> list1 = createArrayList();

        System.out.println("Enter the second list : ");
        List<Integer> list2 = createArrayList();

        ArrayList<Integer> intersection = method(list1, list2);

        System.out.println(intersection);
    }

    private static ArrayList<Integer> method(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer s : list1){
            for (Integer s1 : list2){
                if(s.equals(s1)){
                    result.add(s1);
                    break;
                }
            }
        }

        return result;
    }

    private static List<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int number;

        do {
            number = input.nextInt();
            if(number != -1)
                result.add(number);
        }while (number != -1);

        return result;
    }
}
