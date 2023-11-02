package src.week_09.assignment.Question_09_08;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String fanToString(){
        if(on){
            return "Fan speed : " + speed + ", color : " + color + ", radius : " + radius;
        }

        return "Fan color : " + color + ", radius : " + radius + "\nFan is off";
    }
}
