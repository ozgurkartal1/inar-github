package src.week_09.assignment.Question_09_01;

public class Rectangle {

    double width;
    double height;

    Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }


}
