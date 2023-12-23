package week_14.assignment.question_03;

public class Point implements Comparable<Point>{
    private double x;
    private double y;

    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
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

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point o) {
      if(Double.compare(this.x, o.getX()) == 0){
          return Double.compare(this.y, o.getY());
      }

      return Double.compare(this.x, getX());
    }
}
