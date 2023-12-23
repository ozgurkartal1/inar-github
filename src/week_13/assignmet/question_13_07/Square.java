package week_13.assignmet.question_13_07;
public class Square extends GeometricObject implements Colorable{

    double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean isFilled, String color, double side) {
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
    public String toString() {
        return super.toString() + "\nside : " + side +
                "\n Area : " + getArea() +
                "\n Perimeter : " + getPerimeter();
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
