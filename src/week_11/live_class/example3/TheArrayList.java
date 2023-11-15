package src.week_11.live_class.example3;

import src.week_11.live_class.example1.CircleFromSimpleGeometricObject;
import src.week_11.live_class.example1.RectangleFromSimpleGeometricObject;

import java.util.ArrayList;

public class TheArrayList {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        cities.add("Miami");
        cities.add("Seoul");
        cities.add("Tokyo");

        System.out.println("List size ? " + cities.size());

        System.out.println("Is Miami int he list ? " +
                cities.contains("Miami"));

        System.out.println("Is empty : " +
                cities.isEmpty());

        cities.remove(1);

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }

        System.out.println();

        ArrayList<Object> list = new ArrayList<>();

        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new RectangleFromSimpleGeometricObject(1, 1));

        System.out.println("The area of the first circle " +
                ((CircleFromSimpleGeometricObject)list.get(0)).getArea());
    }


}
