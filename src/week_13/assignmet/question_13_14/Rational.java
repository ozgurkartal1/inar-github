package week_13.assignmet.question_13_14;

public class Rational extends Number implements Comparable<Rational>{
    private long[] list = new long[2];

    public Rational(){
        list[1] = 1;
    }
    public Rational(long[] list){
        this.list = list;
        long gcd = gcd(list[0], list[1]);
        list[0] = ((list[1] > 0) ? 1 : -1) * list[0] / gcd;
        list[1] = Math.abs(list[1]) / gcd;
    }

    private static long gcd(Long aLong, Long aLong1) {
        long min = Math.min(aLong, aLong1);
        long gcd = 1;

        for (int i = 2; i <= min; i++) {
            if(aLong % i == 0 && aLong1 % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    public Rational add(Rational r2){
        long[] result = new long[2];
        result[0] = this.list[0] * r2.getList()[1] +
                r2.getList()[0] * this.list[1];

        result[1] = this.list[1] * r2.getList()[1];

        return new Rational(result);
    }

    public Rational subtract(Rational r2){
        long[] result = new long[2];
        result[0] = this.list[0] * r2.getList()[1] -
                r2.getList()[0] * this.list[1];

        result[1] = this.list[1] * r2.getList()[1];

        return new Rational(result);
    }

    public Rational divide(Rational r2){
        long[] result = new long[2];
        result[0] = list[0] * r2.getList()[1];
        result[1] = list[1] * r2.getList()[0];

        return new Rational(result);
    }

    public Rational multiply(Rational r2){
        long[] result = new long[2];
        result[0] = list[0] * r2.getList()[0];
        result[1] = list[1] * r2.getList()[1];

        return new Rational(result);
    }

    public long[] getList() {
        return list;
    }

    public void setList(long[] list) {
        this.list = list;
    }

    public String toString(){
        if(list[1] == 1){
            return list[0] + "";
        }

        return list[0] + "/" + list[1];
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rational){
            return this.subtract((Rational) obj).getList()[0] == 0;
        }

        return false;
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
        return list[0] * 1.0 / list[1];
    }

    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getList()[0] > 0){
            return 1;
        }

        if (this.subtract(o).getList()[0] == 0){
            return 0;
        }
        return -1;
    }
}
