package week_13.assignmet.question_13_20;

public class Complex implements Cloneable{
    private double realPart;
    private double imaginaryPart;

    public Complex(){

    }

    public Complex(double a) {
        this.realPart = a;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c){
        double a = this.realPart + c.getRealPart();
        double b = this.imaginaryPart + c.getImaginaryPart();

        return new Complex(a, b);
    }

    public Complex subtract(Complex c){
        double a = this.realPart - c.getRealPart();
        double b = this.imaginaryPart - c.getImaginaryPart();

        return new Complex(a, b);
    }

    public Complex multiply(Complex c){
        double a = this.realPart * c.getRealPart() -
                this.imaginaryPart * c.getImaginaryPart();

        double b = this.realPart * c.getImaginaryPart() +
                this.imaginaryPart * c.getRealPart();

        return new Complex(a, b);
    }

    public Complex divide(Complex c){
        Complex cofactor =
             new Complex(c.getRealPart(), (-1 * (c.getImaginaryPart())));

        double division = c.realPart * cofactor.getRealPart() -
                c.getImaginaryPart() * cofactor.getImaginaryPart();

        Complex abc = this.multiply(cofactor);

        return new Complex(abc.getRealPart() / division,
                abc.getImaginaryPart() / division);
    }

    public double abs(){
        return Math.sqrt(Math.pow(realPart, 2) +
                Math.pow(imaginaryPart, 2));
    }

    @Override
    public String toString() {
        if(imaginaryPart == 0){
            return realPart + "";
        }

        if(realPart == 0){
            return imaginaryPart + "i";
        }

        return realPart + " + " + imaginaryPart + "i";
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }
}
