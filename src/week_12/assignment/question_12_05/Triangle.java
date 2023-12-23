package week_12.assignment.question_12_05;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle() throws IllegalTriangleException{
      this(1,2,4);
    }
    Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        setSide1(side1, side2, side3);
        setSide2(side1, side2, side3);
        setSide3(side1, side2, side3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side2 + side3 <= side1){
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 + side3 <= side2){
            throw new IllegalTriangleException();
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 + side2 <= side3){
            throw new IllegalTriangleException();
        }
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override

    public String toString(){
        return "Triangle : " + "side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + "\n" +
               "Perimeter of triangle is " + getPerimeter() + "\n" +
               "Area of the triangle is " + getArea();
    }
}
