package src.week_11.live_class.example1;

public class PolymorphismDemo {



    public static void main(String[] args) {

        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));

        displayObject(new RectangleFromSimpleGeometricObject("black", true,1 , 1));


    }

    public static void displayObject(SimpleGeometricObject object){
        System.out.println(object.toString());
    }
}
