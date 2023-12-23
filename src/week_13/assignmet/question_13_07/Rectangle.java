package week_13.assignmet.question_13_07;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, boolean isFilled, String color) throws Exception {
        super(isFilled, color);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Exception{
        if(width <= 0){
            throw new Exception("It can not be built");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Exception{
        if(height <= 0){
            throw new Exception("İt can not be built");
        }
        this.height = height;
    }

    public String toString(){
        return super.toString() + "\nRectangle width : " + width +
                "\nRectangle height : " + height +
                "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }

    public double getArea() {
        return height * width;
    }


    public double getPerimeter() {
        return 2 * (height + width);
    }



}
