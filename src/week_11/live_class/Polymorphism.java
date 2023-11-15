package src.week_11.live_class;

import src.week_11.live_class.example1.CircleFromSimpleGeometricObject;
import src.week_11.live_class.example1.RectangleFromSimpleGeometricObject;
import src.week_11.live_class.example1.SimpleGeometricObject;

public class Polymorphism {

    public static void main(String[] args) {

        display(new CircleFromSimpleGeometricObject
                (1, "red", false));

        display(new RectangleFromSimpleGeometricObject("black", true, 1, 1));


    }

    private static void display(SimpleGeometricObject obj) {
        System.out.println("Date is " + obj.getDate() + "\n" +
        "The color is : " + obj.getColor());
    }
}
