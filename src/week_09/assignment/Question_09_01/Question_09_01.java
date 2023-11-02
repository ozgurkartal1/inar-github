package src.week_09.assignment.Question_09_01;

public class Question_09_01 {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 40);

        System.out.println("--Rectangle1--");

        System.out.println("Width\t\t: " + rectangle1.width +
                "\nHeight\t\t: " + rectangle1.height +
                "\nArea\t\t: " + rectangle1.getArea() +
                "\nPerimeter\t: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("\n--Rectangle2--");

        System.out.println("Width\t\t: " + rectangle2.width +
                "\nHeight\t\t: " + rectangle2.height +
                "\nArea\t\t: " + rectangle2.getArea() +
                "\nPerimeter\t: " + rectangle2.getPerimeter());
    }

}
