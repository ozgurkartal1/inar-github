package src.week_11.assignment.question_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points : ");

        ArrayList<ArrayList<Double>> list = createList(input.nextInt());

        System.out.println("The total area is " + area(list));
    }

    public static ArrayList<ArrayList<Double>> createList(int i) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Double>> result = new ArrayList<>();

        System.out.println("Enter the coordinates of the points : ");

        for (int j = 0; j < i; j++) {
            ArrayList<Double> row = new ArrayList<>();
            row.add(input.nextDouble());
            row.add(input.nextDouble());

            result.add(row);
        }

        return result;
    }

    public static double area(ArrayList<ArrayList<Double>> list) {
        double area = 0;
        for (int i = 0; i < list.size(); i++) {
            int nextIndex = (i + 1) / list.size();
            area += (list.get(i).get(0) * list.get(nextIndex).get(1)) -
                    (list.get(nextIndex).get(0) * list.get(i).get(1));
        }

        return area;
    }


}
