package week_13.assignmet.question_13_18;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>{

    private BigInteger numerator;
    private BigInteger denominator;

    public Rational(){
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger n, BigInteger d){
        BigInteger gcd = gcd(n.abs(), d.abs());
        numerator = ((d.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger("-1")).
                multiply(n.divide(gcd));

        denominator = (d.divide(gcd)).abs();
    }

    private BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger min = n.min(d);
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger i = BigInteger.TWO; i.compareTo(min) < 0; i = i.add(BigInteger.ONE)) {
            if(n.remainder(i).equals(BigInteger.ZERO) &&
                    d.remainder(i).equals(BigInteger.ZERO)){
                gcd = i;
            }
        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational r){
        BigInteger n = this.numerator.multiply(r.getDenominator())
                .add(this.denominator.multiply(r.getNumerator()));

        BigInteger d = this.denominator.multiply(r.getDenominator());

        return new Rational(n, d);
    }

    public Rational subtract(Rational r){
        BigInteger n = this.numerator.multiply(r.getDenominator())
                .subtract(this.denominator.multiply(r.getNumerator()));

        BigInteger d = this.denominator.multiply(r.getDenominator());

        return new Rational(n, d);
    }

    public Rational multiply(Rational r){
        BigInteger n = this.numerator.multiply(r.getNumerator());

        BigInteger d = this.denominator.multiply(r.getDenominator());

        return new Rational(n, d);
    }

    public Rational divide(Rational r){
        BigInteger n = this.numerator.multiply(r.getDenominator());

        BigInteger d = this.denominator.multiply(r.getNumerator());

        return new Rational(n, d);
    }

    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getNumerator().equals(BigInteger.ZERO)){
            return 0;
        }
        if(this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0){
            return 1;
        }

        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rational) {
            return this.subtract((Rational) obj).getNumerator().equals(BigInteger.ZERO);
        }
        try {
            throw new Exception(obj + " is not Rational object");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String toString(){
        return this.getNumerator() + "/" + this.getDenominator();
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
