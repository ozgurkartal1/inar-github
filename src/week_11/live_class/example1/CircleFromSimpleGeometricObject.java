package src.week_11.live_class.example1;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

    private double radius;

    public CircleFromSimpleGeometricObject(){

    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean isFilled){

        this.radius = radius;
        setColor(color);
        setFilled(isFilled);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}
