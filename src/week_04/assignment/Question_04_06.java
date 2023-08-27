package week_04.assignment;

public class Question_04_06 {

    public static void main(String[] args) {
        int radius = 40;

        int randomDegree = (int) (Math.random() * 361);

        double x1 = radius * Math.cos(Math.toRadians(randomDegree));
        double y1 = radius * Math.sin(Math.toRadians(randomDegree));

        randomDegree = (int) (Math.random() * 361);

        double x2 = radius * Math.cos(Math.toRadians(randomDegree));
        double y2 = radius * Math.sin(Math.toRadians(randomDegree));

        randomDegree = (int) (Math.random() * 361);

        double x3 = radius * Math.cos(Math.toRadians(randomDegree));
        double y3 = radius * Math.sin(Math.toRadians(randomDegree));

        double side1 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double side2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        double angle1 = Math.toDegrees(Math.asin(Math.pow(side1, 2) / (Math.pow(side2, 2) + Math.pow(side3, 2))));
        double angle2 = Math.asin(Math.pow(side2, 2) / (Math.pow(side1, 2) + Math.pow(side3, 2)));
        double angle3 = Math.toDegrees(Math.asin(Math.pow(side3, 2) / (Math.pow(side1, 2) + Math.pow(side2, 2))));

       System.out.println("The three angles are : " + angle1 + " " + angle2 + " " + angle3);
    }
}
