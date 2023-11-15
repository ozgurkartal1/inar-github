package src.week_10.assignment.Question_10_11;

public class Test {

    public static void main(String[] args) {

        Circle2D circle2D = new Circle2D(2, 2, 5.5);

        System.out.println("Circle1 area : " + circle2D.getArea());
        System.out.println("Circle1 perimeter : " + circle2D.getPerimeter());

        System.out.println("Does circle1 contain the point (3, 3)? ->>>" +
                circle2D.contains(3, 3));

        System.out.println("Does circle1 contain the circle centered at (4, 5) +" +
                " and radius 10.5?" + circle2D.contains(new Circle2D(4, 5 , 10.5)));

        System.out.println("Does circle1 overlap the circle centered at (3, 5) +" +
                " and radius 2.3?" + circle2D.contains(new Circle2D(3, 5 , 2.3)));

    }
}
