package src.week_11.live_class.example1;

import src.week_11.live_class.example1.CircleFromSimpleGeometricObject;
import src.week_11.live_class.example1.RectangleFromSimpleGeometricObject;

public class Test {

    public static void main(String[] args) {

        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);

        System.out.println("A circle " + circle.toString());

        System.out.println("The color : " + circle.getColor());

        System.out.println("The is filled : " + circle.isFilled());

        System.out.println("The area is : " + circle.getArea());

        System.out.println("The perimeter is " + circle.getPerimeter());


        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 5);

        System.out.println("A rectangle " + rectangle.toString());

        System.out.println("The color : " + rectangle.getColor());

        System.out.println("The is filled : " + rectangle.isFilled());

        System.out.println("The area is : " + rectangle.getArea());

        System.out.println("The perimeter is " + rectangle.getPerimeter());


    }
}
