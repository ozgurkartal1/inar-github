package week_13.assignmet.question_13_10;

public class Question_13_10 {

    public static void main(String[] args) {

        GeometricObject rectangle1 = new Rectangle(3, 5);
        GeometricObject rectangle2 = new Rectangle(true, "green", 3 ,5);
        GeometricObject rectangle3 = new Rectangle(3, 8);

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.equals(rectangle3));

    }
}
