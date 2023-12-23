package week_13.assignmet.question_13_10;

import java.util.Date;

public abstract class GeometricObject {

    private boolean isFilled;
    private String color;
    private Date createdDate;

    GeometricObject(){
        this(false, "white");
        createdDate = new Date();
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

    @Override
    public String toString() {
        return "Created Date : " + getCreatedDate() +
               "\nIsFilled : " + isFilled() +
               "\nColor : " + getColor();
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean equals(GeometricObject object);
}
