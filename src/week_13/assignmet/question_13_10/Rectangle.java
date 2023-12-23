package week_13.assignmet.question_13_10;

public class Rectangle extends GeometricObject
        implements Comparable<Rectangle>{

    private double width;
    private double height;

    Rectangle(){

    }

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(boolean isFilled, String color, double width, double height) {
        super(isFilled, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(GeometricObject object){
        return getArea() == object.getArea();
    }

    @Override
    public int compareTo(Rectangle o) {
        if(getArea() > o.getArea()){
            return 1;
        }

        if(getArea() == o.getArea()){
            return 0;
        }

        return -1;
    }
}
