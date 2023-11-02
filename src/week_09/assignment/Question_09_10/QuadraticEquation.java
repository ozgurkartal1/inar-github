package src.week_09.assignment.Question_09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }


}
