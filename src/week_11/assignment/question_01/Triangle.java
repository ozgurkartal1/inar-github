package src.week_11.assignment.question_01;

import src.week_11.live_class.example1.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3, String color, boolean isFilled){
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }


}
