package week_13.assignmet.question_13_09;

public class Question_13_09 {

    public static void main(String[] args) throws Exception {


            GeometricObject circle1 = new Circle(5);
            GeometricObject circle2 = new Circle(6);
            GeometricObject circle3 = new Circle(5, true, "green");

            System.out.println("Circle1" +
                    (circle1.equals(circle2) ? " is equal " : " is not equal") +
                    " to circle2");
            System.out.println("Circle1" +
                    (circle1.equals(circle3) ? " is equal" : " is not equal") +
                    " to circle3");


    }
}
