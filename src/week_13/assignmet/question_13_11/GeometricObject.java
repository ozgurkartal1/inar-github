package week_13.assignmet.question_13_11;

import java.util.Date;

public abstract class GeometricObject {
    protected boolean isFilled;
    protected String color;

    protected Date createdDate;

    GeometricObject(){
        this(false, "white");
        setCreatedDate(new Date());
    }

    GeometricObject(boolean isFilled, String color){
        this.isFilled = isFilled;
        this.color = color;
        setCreatedDate(new Date());
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Created Date : " + createdDate +
                "\nisFilled : " + isFilled + "\nColor : " + color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
