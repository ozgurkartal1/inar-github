package src.week_09.assignment.Question_09_09;

public class Question_09_09 {

    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon();

        System.out.println("First Regular polygon :\n" +
                "perimeter : " + polygon1.getPerimeter() + "\n" +
                            "area : " + polygon1.getArea());

        System.out.println("---------------------------------------");

        RegularPolygon polygon2 = new RegularPolygon(6,4);

        System.out.println("Second Regular polygon : \n" +
                "perimeter : " + polygon2.getPerimeter() + "\n" +
                "area is : " + polygon2.getArea());

        System.out.println("---------------------------------------");

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Third Regular polygon : \n" +
                        "perimeter : " + polygon3.getPerimeter() + "\n" +
                "area is : " + polygon3.getArea());
    }
}
