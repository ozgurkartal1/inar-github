package src.week_10.assignment.Question_10_13;

public class MyRectangle2D {
    private double x;
    private double y;

    private double width;

    private double height;

    MyRectangle2D(){
        this(0, 0 , 1, 1);
    }

    MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public boolean contains(double x, double y){
        return x < this.x + width / 2 && x > this.x - width / 2 &&
                y < this.y + height / 2 && y > this.x - height / 2;
    }
    public boolean contains (MyRectangle2D myRectangle2D){
        double[] lowestPoint = {myRectangle2D.getX() - myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() - myRectangle2D.getHeight() / 2};

        double[] greatestPoint = {myRectangle2D.getX() + myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() + myRectangle2D.getHeight() / 2};

        return contains(lowestPoint[0], lowestPoint[1]) &&
                contains(greatestPoint[0], greatestPoint[1]);
    }

    public boolean overlaps(MyRectangle2D myRectangle2D){
        double[] point1 = {myRectangle2D.getX() - myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() - myRectangle2D.getHeight() / 2};

        double[] point2 = {myRectangle2D.getX() + myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() + myRectangle2D.getHeight() / 2};

        double[] point3 = {myRectangle2D.getX() - myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() + myRectangle2D.getHeight() / 2};

        double[] point4 = {myRectangle2D.getX() + myRectangle2D.getWidth() / 2,
                myRectangle2D.getY() - myRectangle2D.getHeight() / 2};

        if(!contains(myRectangle2D)){
            return  contains(point1[0], point1[1]) ||
                    contains(point2[0], point2[1]) ||
                    contains(point3[0], point3[1]) ||
                    contains(point4[0], point4[1]);
        }

        return false;
    }
}
