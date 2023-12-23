package week_14.assignment;

import java.util.ArrayList;

public class Question_25 {

    public static void main(String[] args) {

        int size = 15;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int number = (int) (Math.random() * 100);
            list.add(number);
        }

        int targetSum = (int) (Math.random() * 50) + 50;
        boolean b = false;

        System.out.println("ArrayList : " + list);
        System.out.println("Target Sum : " + targetSum);

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int searchingNumber = targetSum - list.get(i);
            for (int j = i + 1; j < size; j++) {
                if(searchingNumber == list.get(j)){
                    System.out.println("Numbers are : " + list.get(i) + ", " +
                            list.get(j));
                    b = true;
                    break;
                }
            }
            if(b){
                break;
            }
        }

        System.out.println("result is " + b);




    }
}
