package src.week_11.live_class.example1;

import java.util.Date;

public class SimpleGeometricObject {

    private String color = "white";

    private boolean isFilled = false;

    private Date date;

    public SimpleGeometricObject(){
        date = new Date();
    }

    public SimpleGeometricObject(String color, boolean isFilled){
        date = new Date();
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return "Created on " + date + "\ncolor: "
                + color + "\nfilled : " + isFilled;
    }
}
