package src.week_10.assignment.Question_10_04;

public class Test {

    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(10.0, 30.5);

        MyPoint point2 = new MyPoint();

        System.out.println("The distance between " +
                "(" + point2.getX() + ", " + point2.getY() + ")" + " and " +
                "(" + point1.getX() + ", " + point1.getY() + ")" + " is : " +
                point1.distance(point2));
    }
}
