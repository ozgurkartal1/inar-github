package week_14.assignment.question_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<Point> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            double x = Math.random() * 10;
            double y = Math.random() * 10;

            list.add(new Point(x, y));
        }

        // increasing order with respect to x-coordinates

        Collections.sort(list);
        display(list);

        System.out.println();

        // increasing order with respect to y-coordinates

        list.sort(new CompareY());
        display(list);
    }

    private static void display(ArrayList<Point> list) {
        for (Point p : list){
            System.out.print(p + " , ");
        }
    }
}
