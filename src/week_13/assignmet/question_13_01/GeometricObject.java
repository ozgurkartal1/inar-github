package week_13.assignmet.question_13_01;

import java.util.Date;

public abstract class GeometricObject{

    private boolean isFilled;
    private String color;
    private Date createdDate;

    GeometricObject(){
        this(false, "white");
    }

    GeometricObject(boolean isFilled, String color){
        this.isFilled = isFilled;
        this.color = color;
        createdDate = new Date();
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String toString(){
        return "color : " + color + " and filled : " + isFilled;
    }

    protected abstract double getArea();
    protected abstract double getPerimeter();
}
