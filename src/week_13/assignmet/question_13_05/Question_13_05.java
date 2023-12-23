package week_13.assignmet.question_13_05;

public class Question_13_05 {

    public static void main(String[] args) throws Exception {

        System.out.println("The larger of the two circles is : ");

        System.out.println(GeometricObject.max(new Circle(false, "green", 5),
                new Circle(true, "yellow", 4)));

        System.out.println("---------------------------------------");

        System.out.println("The larger of the two rectangle is : ");

        System.out.println(GeometricObject.max(new Rectangle(15, 12, true, "green"),
                new Rectangle(3, 5)));


    }
}
