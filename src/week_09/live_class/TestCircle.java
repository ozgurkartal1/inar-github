package src.week_09.live_class;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);

        Circle circle2 = new Circle(30);

        System.out.println("Circle 1 radius is : " + circle1.radius);
        System.out.println("Circle 2 radius is : " + circle2.radius);

        System.out.println("------------------------------------------");

        circle2 = circle1;

        System.out.println("Circle 1 radius is : " + circle1.radius);
        System.out.println("Circle 2 radius is : " + circle2.radius);

        System.out.println("--------------------------------------------");

        circle1.setRadius(100);

        System.out.println("Circle 1 radius is : " + circle1.radius);
        System.out.println("Circle 2 radius is : " + circle2.radius);


    }
}
