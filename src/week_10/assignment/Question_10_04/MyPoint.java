package src.week_10.assignment.Question_10_04;

public class MyPoint {
    private double x ;
    private double y;

    MyPoint(){
       this(0,0);
    }

    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow((myPoint.getX() - x), 2) +
                Math.pow((myPoint.getY() - y), 2));
    }

    double distance(double x, double y){
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}
