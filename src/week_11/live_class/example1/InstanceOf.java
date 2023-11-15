package src.week_11.live_class.example1;

public class InstanceOf {

    public static void main(String[] args) {

        Object object = new CircleFromSimpleGeometricObject(1);
        Object object1 = new RectangleFromSimpleGeometricObject(1, 1);



        display(object);
        System.out.println("------------------------------------");
        display(object1);
    }

    public static void display(Object object) {
        if (object instanceof CircleFromSimpleGeometricObject) {

            System.out.println("The circle area is " +
                    ((CircleFromSimpleGeometricObject) object).getArea());

            System.out.println("The circle diameter is " +
                    ((CircleFromSimpleGeometricObject) object).getDiameter());
        }

        if (object instanceof RectangleFromSimpleGeometricObject) {

            System.out.println("The rectangle area is " +
                    ((RectangleFromSimpleGeometricObject) object).getArea());
        }
    }
}
