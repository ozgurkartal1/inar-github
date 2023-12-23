package week_13.assignmet.question_13_11;

public class Octagon extends GeometricObject
        implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(boolean isFilled, String color, double side) {
        super(isFilled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if(getArea() > o.getArea()){
            return 1;
        }

        if(getArea() == o.getArea()){
            return 0;
        }

        return -1;
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
      return (Octagon) super.clone();
    }
}
