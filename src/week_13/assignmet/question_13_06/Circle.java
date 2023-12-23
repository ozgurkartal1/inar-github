package week_13.assignmet.question_13_06;



public class Circle extends GeometricObject{

    double radius;

    public Circle(double radius) throws Exception{
        setRadius(radius);
    }

    public Circle(boolean isFilled, String color, double radius) throws Exception{
        super(isFilled, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception{
        if(radius <= 0){
            throw new Exception("This circle can not be created.");
        }
        this.radius = radius;
    }

    public String toString(){
        return super.toString() + "\nRadius : " + radius +
                "\nArea " + getArea() +
                "\nPerimeter : " + getPerimeter();
    }


    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }


    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }



}
