package week_13.assignmet.question_13_09;

public class Circle extends GeometricObject implements Comparable<Circle> {

    double radius;


    Circle(double radius) throws Exception {
        setRadius(radius);
    }

    Circle(double radius, boolean isFilled, String color) throws Exception {
        super(isFilled, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Invalid Radius");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        }

        if (getRadius() == o.getRadius()) {
            return 0;
        }

        return -1;
    }

    @Override
    public boolean equals(GeometricObject object) throws Exception {
        if (object instanceof Circle) {
            return this.radius == ((Circle) object).getRadius();
        }
        throw new Exception(object + " is not Circle Object");
    }


}
