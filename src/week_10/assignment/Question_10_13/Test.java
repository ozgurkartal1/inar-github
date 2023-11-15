package src.week_10.assignment.Question_10_13;

public class Test {

    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Rectangle : ");
        System.out.println("--------------------------");
        System.out.println("Area : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());

        System.out.println((r1.contains(3, 3) ? "contains " : "does not contains ") +
                "the point");

        System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))
        ? "contain " : "does not contain ") + " the rectangle");

        System.out.println((r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))
        ? "overlaps " : "does not overlap ") + "the rectangle");
    }
}
