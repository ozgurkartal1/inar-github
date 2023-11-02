package src.week_09.live_class;

public class Circle {

    double radius = 1;

    Circle(){}

    Circle(double radius){

        this.radius = radius;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }
}
