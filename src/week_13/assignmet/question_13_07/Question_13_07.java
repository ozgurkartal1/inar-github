package week_13.assignmet.question_13_07;

public class Question_13_07 {

    public static void main(String[] args) throws Exception {

        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Rectangle(10, 5);
        geometricObjects[2] = new Circle(2);
        geometricObjects[3] = new Square(5);
        geometricObjects[4] = new Square();

        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println("Area of the Geometric Object in the index " + i
            + " is : " + geometricObjects[i].getArea());

            if(geometricObjects[i] instanceof Colorable){
                ((Colorable) geometricObjects[i]).howToColor();
            }

            System.out.println("--------------------------------------");
        }
    }
}
