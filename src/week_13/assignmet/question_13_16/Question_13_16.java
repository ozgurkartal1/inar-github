package week_13.assignmet.question_13_16;

public class Question_13_16 {

    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Usage : operand1 operator operand2");
            System.exit(1);
        }

        Rational1 result = new Rational1();
        String[] array1 = args[0].split("/");
        String[] array2 = args[2].split("/");

        switch (args[1].charAt(0)){
            case '+' -> result = new Rational1(Long.parseLong(array1[0]),
                    Long.parseLong(array1[1])).add(new Rational1(Long.parseLong(array2[0]),
                    Long.parseLong(array2[1])));
            case '-' -> result = new Rational1(Long.parseLong(array1[0]),
                    Long.parseLong(array1[1])).subtract(new Rational1(Long.parseLong(array2[0]),
                    Long.parseLong(array2[1])));

            case '*' -> result = new Rational1(Long.parseLong(array1[0]),
                    Long.parseLong(array1[1])).multiply(new Rational1(Long.parseLong(array2[0]),
                    Long.parseLong(array2[1])));

            case '/' -> result = new Rational1(Long.parseLong(array1[0]),
                    Long.parseLong(array1[1])).divide(new Rational1(Long.parseLong(array2[0]),
                    Long.parseLong(array2[1])));

        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " +
                result);
    }
}

 class Rational1 extends Number implements Comparable<Rational1>{

    private long numerator;
    private long denominator;

    public Rational1(){
        this(0, 1);
    }

    public Rational1(long n, long d){
        long gcd = gcd(n, d);
        this.numerator = ((d < 0) ? -1 : 1) * n / gcd;
        this.denominator = Math.abs(d) / gcd;
    }

    private long gcd(long n, long d) {
        long gcd = 1;
        n = Math.abs(n);
        d = Math.abs(d);

        long min = Math.min(n, d);

        for (int i = 2; i <= min; i++) {
            if(n % i == 0 && d % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public Rational1 add (Rational1 r){
        long n = this.numerator * r.getDenominator() +
                r.getNumerator() * this.denominator;

        long d = this.denominator * r.getDenominator();

        return new Rational1(n, d);
    }

    public Rational1 subtract(Rational1 r){
        long n = this.numerator * r.getDenominator() -
                r.getNumerator() * this.denominator;

        long d = this.denominator * r.getDenominator();

        return new Rational1(n, d);
    }

    public Rational1 multiply (Rational1 r){
        long n = this.numerator * r.getNumerator();
        long d = this.denominator * r.getDenominator();

        return new Rational1(n, d);
    }

    public Rational1 divide(Rational1 r){
        long n = this.numerator * r.getDenominator();
        long d = this.denominator * r.getNumerator();

        return new Rational1(n, d);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rational1){
            return this.subtract((Rational1) obj).getNumerator() == 0;
        }

        try {
            throw new Exception("Wrong class apply");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        return (double) numerator / denominator;
    }

    @Override
    public int compareTo(Rational1 o) {
        return ((this.subtract(o).getNumerator() > 0) ? 1 :
                (this.subtract(o).getNumerator() == 0) ? 0 : -1);
    }
}

