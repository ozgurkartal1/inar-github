package week_14.assignment;

import java.util.LinkedList;
import java.util.Random;

public class Question_26 {

    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Original Linked List\n" + list);
        LinkedList<Integer> list2 = updateList(list);
        System.out.println("Updated Link List\n" + list2);
    }

    private static LinkedList<Integer> updateList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            list.add(i + 1, findGcd(list.get(i), list.get(i + 1)));
        }
        return list;
    }

    private static Integer findGcd(Integer num1, Integer num2) {
        int gcd = 1;
        for (int i = 2; i < Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
